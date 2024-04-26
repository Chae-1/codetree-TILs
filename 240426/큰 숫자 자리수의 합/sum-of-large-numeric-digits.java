import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(sumEachNum(a * b * c));
    }

    public static int sumEachNum(int n) {
        if (n < 10)
            return n;
        return sumEachNum(n / 10) + n % 10;
    }
}