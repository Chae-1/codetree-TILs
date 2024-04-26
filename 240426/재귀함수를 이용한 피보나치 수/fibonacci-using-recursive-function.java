import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacchi(n));
    }


    public static int fibonacchi(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fibonacchi(n - 1) + fibonacchi(n - 2);
    }
}