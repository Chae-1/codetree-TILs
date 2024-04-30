import java.util.*;
public class Main {
    public static long toBinary(int n) {
        int[] arr = new int[30];
        int cnt = 0;
        while (true) {
            if (n < 2) {
                arr[cnt++] = n;
                break;
            }
            arr[cnt++] = n % 2;
            n /= 2;
        }

        long result = 0;
        for (int i = cnt - 1; i >= 0; i--) {
            result = result * 10 + arr[i];
        }
        return result;
    }


    public static int toDecimal(int b) {
        int result = 0;
        int cnt = 1;
        while (b != 0) {
            result += cnt * (b % 10);
            b /= 10;
            cnt *= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = toDecimal(n) * 17;
        System.out.println(toBinary(i));
    }
}