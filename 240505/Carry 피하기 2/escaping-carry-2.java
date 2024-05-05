import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (isNotCarry(arr[i], arr[j], arr[k])) {
                        max = Integer.max(arr[i] + arr[j] + arr[k], max);
                    }
                }
            }
        }
        System.out.println(max);
    }

    private static boolean isNotCarry(int num1, int num2, int num3) {

        // 숫자의 범위는 10,000까지 존재한다.
        for (int i = 0; i < 5; i++) {
            // i == 자리의 수
            int pow = (int) Math.pow(10, i);
            int n1 = (num1 / pow) % 10;
            int n2 = (num2 / pow) % 10;
            int n3 = (num3 / pow) % 10;
            // 각 자리수의 합이 10이 넘지 않은 수여야 한다.
            if (n1 + n2 + n3 >= 10) {
                return false;
            }
        }

        return true;
    }
}