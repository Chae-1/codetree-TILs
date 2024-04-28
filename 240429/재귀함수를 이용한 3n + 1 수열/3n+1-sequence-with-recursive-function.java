import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sequence(n);
        System.out.println(sequence(n));
    }

    public static int sequence(int n) {
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            return sequence(n / 2) + 1;
        } else {
            return sequence(n * 3 + 1) + 1;
        }   

    }
}