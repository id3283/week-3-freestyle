import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReaderDemo {

    public static void main(String[] args) {
        String fileName = "src/main/resources/" + "goldilocks.txt";

        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufReader = new BufferedReader(reader);

            String input = bufReader.readLine();

            while (input != null) {
                System.out.println(input);
                input = bufReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.err.println("I couldn't find the file named: "+ fileName);
        }
        catch (IOException e) {
            System.err.println("IO Exception... I don't know what's is going on.");
        }
    }
}
