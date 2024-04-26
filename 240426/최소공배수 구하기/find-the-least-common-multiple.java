import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(mcm(n, m));
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
            // 12 % 18
            // 18, 12 % 18
            // 18, 12
            // 12, 6
            // 6
        return gcd(b, a % b);
    }

    public static int mcm(int n, int m) {
        return (n * m) / gcd(n, m); 
    }
}