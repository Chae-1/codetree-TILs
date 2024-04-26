import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(eachNumPower(n));
    }

    public static int eachNumPower(int n) {
        if (n < 10) // 한자리 수이면
            return n * n;

        return eachNumPower(n / 10) + (n % 10) * (n % 10);
    }
}