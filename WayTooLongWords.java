import java.util.Scanner;
import java.util.ArrayList;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int count = sc.nextInt();
        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            words.add(sc.next());
        }

        for (String word : words) {
            if (word.length() > 10) {
                String abbreviated = word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.println(abbreviated);
            } else {
                System.out.println(word);
            }
        }
    }
}
