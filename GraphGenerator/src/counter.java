import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by zamkovoyilya on 09/05/16.
 */
public class counter {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("/Users/zamkovoyilya/java2k4s/GraphGenerator/src/ostov.txt");
        Scanner scanner = new Scanner(file);


        int counter = 0;
        while (scanner.hasNext()) {

            String input = scanner.nextLine();

            counter++;


        }

        System.out.println(counter);

    }

}
