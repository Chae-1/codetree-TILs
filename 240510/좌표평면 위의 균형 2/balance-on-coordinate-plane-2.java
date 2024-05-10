import java.util.*;

public class Main {
    static int MAX_N = 100;
    static int[] x = new int[MAX_N];
    static int[] y = new int[MAX_N];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // i, j로 구역을 나눴을 떄 각 구역에서 나오는 최소
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                // 1 사분면
                int count = 0;
                int max = 0;
                for (int k = 0; k < n; k++) {
                    if (x[k] >= i && y[k] >= j) {
                        count++;
                    }
                }
                max = Math.max(count, max);

                count = 0;
                for (int k = 0; k < n; k++) {
                    if (x[k] <= i && y[k] >= j) {
                        count++;
                    }
                }
                max = Math.max(count, max);

                count = 0;
                for (int k = 0; k < n; k++) {
                    if (x[k] >= i && y[k] <= j) {
                        count++;
                    }
                }
                max = Math.max(count, max);

                count = 0;
                for (int k = 0; k < n; k++) {
                    if (x[k] <= i && y[k] <= j) {
                        count++;
                    }
                }
                // i, j로 수평선을 나눴을 때
                // 각 사분면에 존재하는 점의 개수의 최대
                // 이 개수가 최소여야 한다.
                max = Math.max(count, max);
                min = Math.min(min, max);
            }
        }
        System.out.println(min);
    }
}