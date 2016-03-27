package task011;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.server.ExportException;
@Aspect
public class Client extends JFrame {

    Dialog dialog;

    private JFrame frame = new JFrame("Pick 4");
    private JLabel messageLabel = new JLabel("");
    private ImageIcon icon;
    private ImageIcon opponentIcon;

    private Square[] board = new Square[25];
    private Square currentSquare;

    private static int PORT = 8901;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;


    public Client(String serverAddress, int port) throws Exception {

        // Setup networking
        socket = new Socket(serverAddress, port);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);

        // Layout GUI
        messageLabel.setBackground(Color.lightGray);
        frame.getContentPane().add(messageLabel, "South");

        JPanel boardPanel = new JPanel();
        boardPanel.setBackground(Color.black);
        boardPanel.setLayout(new GridLayout(5, 5, 2, 2));
        for (int i = 0; i < board.length; i++) {
            final int j = i;
            board[i] = new Square();
            board[i].addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    currentSquare = board[j];
                    out.println("MOVE " + j);
                }
            });
            boardPanel.add(board[i]);
        }
        frame.getContentPane().add(boardPanel, "Center");

    }

    @Before("execution(* *..HelloWorld.helloWorld())")//must print "Hello World"
    public void play() throws Exception {
        String response;
        response = in.readLine();
        if (response.startsWith("WELCOME")) {
            char mark = response.charAt(8);
            icon = new ImageIcon(mark == 'X' ? getClass().getResource("x.gif") : getClass().getResource("o.gif"));
            opponentIcon = new ImageIcon(mark == 'X' ? getClass().getResource("o.gif") : getClass().getResource("x.gif"));
            frame.setTitle("pick 4 - Player " + mark);
        }
        while (true) {
            response = in.readLine();
            if (response.startsWith("VALID_MOVE")) {
                messageLabel.setText("Valid move, please wait");
                currentSquare.setIcon(icon);
                currentSquare.repaint();
            } else if (response.startsWith("OPPONENT_MOVED")) {
                int loc = Integer.parseInt(response.substring(15));
                board[loc].setIcon(opponentIcon);
                board[loc].repaint();
                messageLabel.setText("Opponent moved, your turn");
            } else if (response.startsWith("VICTORY")) {
                messageLabel.setText("You win");
                break;
            } else if (response.startsWith("DEFEAT")) {
                messageLabel.setText("You lose");
                break;
            } else if (response.startsWith("TIE")) {
                messageLabel.setText("You tied");
                break;
            } else if (response.startsWith("MESSAGE")) {
                messageLabel.setText(response.substring(8));
            }
        }
        out.println("QUIT");
    }

    private boolean wantsToPlayAgain() {
        int response = JOptionPane.showConfirmDialog(frame,
                "Want to play again?",
                "pick 4",
                JOptionPane.YES_NO_OPTION);
        frame.dispose();
        return response == JOptionPane.YES_OPTION;
    }

    static class Square extends JPanel {
        JLabel label = new JLabel((Icon) null);

        public Square() {
            setBackground(Color.white);
            add(label);
        }

        public void setIcon(Icon icon) {
            label.setIcon(icon);
        }
    }


    public static void main(String[] args) throws Exception {


        JFrame frame = new JFrame();
        String adress = JOptionPane.showInputDialog(frame, "write adress");
        int port = 8901;

        Client client = new Client(adress, port);
        while (true) {
            try {
                client.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                client.frame.setSize(760, 760);
                client.frame.setVisible(true);
                client.frame.setResizable(false);
                client.play();
                if (!client.wantsToPlayAgain()) {
                    break;
                } else {
                    client = new Client(adress, port);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
