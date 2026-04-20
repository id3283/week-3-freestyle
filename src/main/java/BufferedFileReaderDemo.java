import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReaderDemo {

    public static void main(String[] args) {
        String fileName = "src/main/resources/names.txt";

        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufReader = new BufferedReader(reader);

            String input;
            while((input = bufReader.readLine()) != null) {
                System.out.println(input);
            }

        } catch (FileNotFoundException e) {
            System.err.println("I couldn't find the file named: "+ fileName);
        }
        catch (IOException e) {
            System.err.println("IO Exception... I don't know what's is going on.");
        }
    }
}
