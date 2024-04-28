import java.util.*;
public class Main {
    static int count = 0;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sequence(n);
        System.out.println(count);
    }

    public static void sequence(int n) {
        if (n == 1) {
            return ;
        }

        if (n % 2 == 0) {
            count++;
            sequence(n / 2);
            return;
        } else {
            count++;
            sequence(3 * n + 1);
            return ;
        }   

    }
}