import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isEvenAndEachDigitSumDivideFive(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isEvenAndEachDigitSumDivideFive(int n) {
        int temp = n;
        int eachSum = 0;
        while (temp != 0) {
            eachSum += temp % 10;
            temp /= 10;
        }
        return n % 2 == 0 && eachSum % 5 == 0;
    }
}