package task008;

import java.net.Socket;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class Player extends Thread {
    private Game game;
    char mark;
    Player opponent;
    Socket socket;
    BufferedReader input;
    PrintWriter output;


    public Player(Game game, Socket socket, char mark) {
        this.game = game;
        this.socket = socket;
        this.mark = mark;
        try {
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            output = new PrintWriter(socket.getOutputStream(), true);
            output.println("WELCOME " + mark);
            output.println("MESSAGE Waiting for opponent to connect");
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }


    public void otherPlayerMoved(int location) {
        output.println("OPPONENT_MOVED " + location);
        output.println(
                game.hasWinner() ? "DEFEAT" : game.boardFilledUp() ? "TIE" : "");
    }


    public void run() {
        try {
            // The thread is only started after everyone connects.
            output.println("MESSAGE All players connected");

            // Tell the first player that it is her turn.
            if (mark == 'X') {
                output.println("MESSAGE Your move");
            }

            // Repeatedly get commands from the client and process them.
            while (true) {
                String command = input.readLine();
                if (command.startsWith("MOVE")) {
                    int location = Integer.parseInt(command.substring(5));

                    if (game.legalMove(location, this)) {
                        output.println("VALID_MOVE");
                        output.println(game.hasWinner() ? "VICTORY"
                                : game.boardFilledUp() ? "TIE"
                                : "");
                    } else {
                        output.println("MESSAGE ?");
                    }
                } else if (command.startsWith("QUIT")) {
                    return;
                }

            }
        } catch (IOException e) {

        }
    }


}
