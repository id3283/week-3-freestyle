import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("src/main/resources/names.txt"));
            String line = "";
            while (scanner.hasNext())
            {
                line = scanner.nextLine();
                System.out.println("Here's the first line: " + line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("I couldn't find that file.");
        }

    }
}
