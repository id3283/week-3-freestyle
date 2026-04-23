import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) {
        String fileName = "src/main/resources/" + "students.csv";

        try {
            FileWriter myWriter = new FileWriter(fileName, true);

            myWriter.append("Hurera");
            myWriter.append("\n");
//            myWriter.write("Tim");
//            myWriter.write("\n");

            myWriter.close();

        } catch (IOException e) {
            System.err.println("Couldn't write to file: " + fileName);
        }

    }
}
