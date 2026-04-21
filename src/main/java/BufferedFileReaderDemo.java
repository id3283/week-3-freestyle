import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class BufferedFileReaderDemo {

    public static void main(String[] args) {
        String fileName = "src/main/resources/" + "goldilocks.txt";

        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufReader = new BufferedReader(reader);

            String fileLine = bufReader.readLine();
            int lineNumber = 1;
            while (fileLine != null) {
                System.out.println(lineNumber + " " +fileLine);
                fileLine = bufReader.readLine();
                lineNumber++;
            }

        } catch (FileNotFoundException e) {
            System.err.println("I couldn't find the file named: "+ fileName);
        }
        catch (IOException e) {
            System.err.println("IO Exception... I don't know what's is going on.");
        }
    }
}
