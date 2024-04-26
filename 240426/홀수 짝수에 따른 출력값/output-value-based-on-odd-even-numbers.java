import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOddOrEven(n));
    }

    public static int sumOddOrEven(int n) {
        if (n == 1 || n == 2)
            return n;
        
        return n + sumOddOrEven(n - 2);
    }
}