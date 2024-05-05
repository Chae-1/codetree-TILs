import java.util.*;
public class Main {
    static int[] x = new int[101];
    static int[] y = new int[101];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 1, n번째 체크 포인트는 건너뛰지 못한다.
        // 1번 체크포인트에서 시작한다.
        for (int i = 1; i <= n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        // 하나의 체크포인트를 제외하고 모든 체크포인트를 방문해야한다.
        int minDistance = Integer.MAX_VALUE;
        for (int i = 2; i <= n - 1; i++) {
            // i == 건너뛸 위치
            // 1, N 번째는 건너뛰지 않는다.
            int distance = 0;
            // 이전 위치
            int beforePoint = 1;
            for (int j = 2; j <= n; j++) {
                if (i != j) {
                    // 해당 포인트가 건너뛸 포인트가 아니라면,
                    // 이전 위치에서 현재 위치로 이동한다.
                    distance += Math.abs(x[j] - x[beforePoint]) + Math.abs(y[j] - y[beforePoint]);
                    beforePoint = j;
                }
            }
            minDistance = Math.min(minDistance, distance);
        }

        System.out.println(minDistance);
    }
}