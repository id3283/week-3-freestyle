public class SimpleException {

    public static void main(String[] args) {

        try {
            int i = 10 / 0;
            System.out.println("this won't print.");

        }
        catch (ArithmeticException e) {
            System.out.println("There was an error.");
        }

        System.out.println("done");
    }
}
