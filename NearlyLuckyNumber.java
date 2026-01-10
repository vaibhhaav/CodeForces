import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String n = sc.next();  // Read as string to handle up to 10^18 easily
            
            // Count lucky digits (4 and 7)
            int luckyCount = 0;
            for (char c : n.toCharArray()) {
                if (c == '4' || c == '7') {
                    luckyCount++;
                }
            }
            
            // Check if luckyCount itself is a lucky number
            boolean isLuckyCount = isLuckyNumber(luckyCount);
            
            System.out.println(isLuckyCount ? "YES" : "NO");
        } 

        public static boolean isLuckyNumber(int num) {
            String numStr = String.valueOf(num);
            for (char c : numStr.toCharArray()) {
                if (c != '4' && c != '7') {
                    return false;
                }
            }
            return true;
        } 
}
