import java.util.*;

public class Main {

    static int[] a = new int[3];
    static int[] b = new int[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (canSwitch(i, j, k, a, n) || canSwitch(i, j, k, b, n)) {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }

    private static boolean canSwitch(int num1, int num2, int num3, int[] lock, int n) {

        int[] numbers = {num1, num2, num3};
        // 자물쇠의 모든 자리 수와 거리가 2이내이면된다.
        for (int i = 0; i < 3; i++) {
            boolean match = false;
            for (int j = -2; j <= 2; j++) {
                // 1에서 -2 -1 n == 10 + numbers[i] - j
                int eachNum = numbers[i] + j;
                // 해당 숫자가 음수 이면
                if (eachNum <= 0) {
                    eachNum = n + eachNum;
                } else if (eachNum > n) {
                    eachNum = eachNum % n;
                }

                // eachNum가 같으면 된다.
                if (eachNum == lock[i]) {
                    match = true;
                    break;
                }
            }

            if (!match) {
                return false;
            }
        }
        return true;
    }
}