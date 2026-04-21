import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerScannerScanner {

    public static void main(String[] args) {
        String fileName = "src/main/resources/" + "hi.txt";
        File f = new File(fileName);

        Scanner myScanner = null;
        try {
            myScanner = new Scanner(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String userInput = myScanner.nextLine();

        while (myScanner.hasNext()) {
            userInput = myScanner.nextLine();
            System.out.println(userInput);
        }
    }
}
