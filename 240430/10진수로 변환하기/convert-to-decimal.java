import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int result = 0;
        int w = 1;
        while (n != 0) {
            result += w * (n % 2);
            n /= 10;
            w *= 2;
        }
        System.out.println(result);
    }
}