import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      
        String s = sc.next();     

        int removals = 0;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                removals++;        
            }
        }

        System.out.println(removals);
        sc.close();
    }
}
