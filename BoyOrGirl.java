import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        sc.close();

        char[] chars = username.toCharArray();
        int distinctCount = 0;

        for (int i = 0; i < chars.length; i++) {
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (chars[i] == chars[j]) {
                    seen = true;
                    break;
                }
            }
            if (!seen) distinctCount++;
        }

        if (distinctCount % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}