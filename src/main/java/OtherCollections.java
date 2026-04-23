import java.util.ArrayList;

public class OtherCollections {

    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(2);
        scores.add(4);
        scores.add(8);

        for (Integer score: scores) {
            System.out.println(score);
        }

        System.out.println();
        scores.remove(1);

        for (Integer score: scores) {
            System.out.println(score);
        }

    }
}
