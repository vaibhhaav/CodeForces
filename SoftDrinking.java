import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int totalDrink = k * l;
        int totalLimes = c * d;
        int totalSalt = p;

        int toastsByDrink = totalDrink / nl;
        int toastsByLimes = totalLimes;
        int toastsBySalt = totalSalt / np;

        int maxToasts = Math.min(toastsByDrink, Math.min(toastsByLimes, toastsBySalt));
        System.out.println(maxToasts / n);
    }
}

