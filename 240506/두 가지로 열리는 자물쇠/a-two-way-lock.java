import java.util.*;

public class Main {
    static int[] a = new int[3];
    static int[] b = new int[3];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }

        // 모든 자리 수 거리 2
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    boolean b1 = matchAllComb(i, j, k, n, a);
                    boolean b2 = matchAllComb(i, j, k, n, b);
                    if (b1 || b2) {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }

    private static boolean matchAllComb(int first, int sec, int third, int n, int[] a) {

        int[] numbers = {first, sec, third};
        for (int i = 0; i < 3; i++) {
            // A가 매치되는 지 확인 한다.
            boolean matchComb = false;
            for (int j = -2; j <= 2; j++) {
                int afterDial =  a[i] + j;
                if (afterDial <= 0) {
                    afterDial = afterDial + n;
                }

                if (afterDial == numbers[i]) {
                    matchComb = true;
                    break;
                }
            }

            if (!matchComb) {
                return false;
            }
        }
        return true;
    }
}