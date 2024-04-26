import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i) && sumEachNum(i) % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int sumEachNum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;           
        }
        return sum;
    }

}