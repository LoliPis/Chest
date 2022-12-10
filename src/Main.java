import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<List<String>> biDemArrList = new ArrayList<>();
    public static void main(String[] args) {
        example();
    }
    static void example() {
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, (i + j) % 2 == 0 ? "◯" : "●");
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + (j < 7 ? " ": ""));
            }
            System.out.println();
        }
    }
}