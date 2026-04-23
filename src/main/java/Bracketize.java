public class Bracketize {

    public static void main(String[] args) {

        String value = "";
        value = makeKeyValuePair("name", "dave");

        value = putInArray(value);
        

        System.out.println(value);
    }

    public static String makeKeyValuePair(String key, String value) {
        return String.format("\"%s\" : \"%s\"", key, value);
    }
    public static String putInArray(String value) {
        return "[" + value + "]";
    }
}
