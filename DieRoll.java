public class DieRoll {
    public String dieRoll(int Y, int W) {
        int maxRoll = Math.max(Y, W);
        int favorable = 6 - maxRoll + 1;
        int gcd = gcd(favorable, 6);
        return (favorable / gcd) + "/" + (6 / gcd);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

}
