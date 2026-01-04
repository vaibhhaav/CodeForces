import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long length_tiles = (n+a-1)/a;
        long breadth_tiles = (m+a-1)/a;
        long total_tiles = length_tiles * breadth_tiles;
        System.out.println(total_tiles);
        sc.close();
    }
}
