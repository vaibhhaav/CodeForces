import java.util.*;

public class Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String u = sc.next();
        int n = s.length();
        int m = u.length();
        int ans = Integer.MAX_VALUE;

        for (int shift = -m; shift <= n; shift++) {
            int cost = 0;
            for (int j = 0; j < m; j++) {
                int pos = shift + j;
                if (pos >= 0 && pos < n) {
                    if (s.charAt(pos) != u.charAt(j)) cost++;
                } else {
                    cost++;
                }
            }
            ans = Math.min(ans, cost);
        }

        System.out.println(ans);

    }
}