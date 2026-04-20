import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {

    public static void main(String[] args) {


        readWithScanner();

    }

    private static void readWithScanner() {

        String[] fileNames  =  {"goldilocks.txt", "hansel_and_gretel.txt"};

        try {
            Scanner scanner = new Scanner(new File("src/main/resources/goldilocks.txt"));
            String line = "";
            while (scanner.hasNext())
            {
                line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("I couldn't find that file.");
        }
    }
}
