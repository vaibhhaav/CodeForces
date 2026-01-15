import java.util.*;

public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            if (!map.containsKey(name)) {
                map.put(name, 0);
                System.out.println("OK");
            } else {
                int count = map.get(name) + 1;
                while (map.containsKey(name + count)) {
                    count++;
                }
                map.put(name, count);
                map.put(name + count, 0);
                System.out.println(name + count);
            }
        }
    }
}