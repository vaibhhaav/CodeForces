import java.util.Scanner;

public class HQ9plus {
    public String willProduceOutput(String p) {
        for (char c : p.toCharArray()) {
            if (c == 'H' || c == 'Q' || c == '9') {
                return "YES";
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        HQ9plus sol = new HQ9plus();
        System.out.println(sol.willProduceOutput(p));
    }
}
