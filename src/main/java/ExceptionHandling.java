import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        System.out.println("Enter an integer, please.");
        Scanner myScanner = new Scanner(System.in);

        boolean goodValue = false;
        int i = 0;

        do {
            try {
                String userInput = myScanner.nextLine();
                i = Integer.parseInt(userInput);
                goodValue = true;
                System.out.println("If there's a problem, this won't print.");
            }
            catch (NumberFormatException e) {
                System.out.println(e);
                System.err.println("You didn't enter an integer.  Dummy.");
            }
        } while (goodValue == false);

        System.out.println("You entered: " + i);
    }
}
