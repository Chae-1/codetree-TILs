import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // A -> B로 갈건데,
    // x 위치에서 y 위치로 갈 수 있고
    // y 위치에서 x 위치로 갈 수 있다.
    // 가능한 방법을 동원해서 걷는 거리를 최소한의 거리로 하라.

    static int x[] = new int[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
        }
        // 연속된 숫자라면 1 - 2 - 3
        // 4 5 6
        // 11 12 13
        // 14 15 16
        //

        System.out.println(calMinCost());
    }

    private static int calMinCost() {
        // 1. 연속된 수라면
        Arrays.sort(x);
        int avg = (x[0] + x[2]) / 2;
        if (avg == x[1]) {
            return 0;
        }
        for (int i = 0; i < 3; i++) {
            int cur = x[i];
            int min = Math.min(x[(i + 1) % 3], x[(i + 2) % 3]);
            int max = Math.max(x[(i + 1) % 3], x[(i + 2) % 3]);

            // cur를 구간안으로 편입
            // max보다 클 경우, max - 1
            // min보다 작을 경우, min + 1
            if (cur > max) {
                cur = max - 1;
            } else if (cur < min) {
                cur = min + 1;
            }

            // 조정 후, 연속된 수인지 확인
            if (cur - min == 1 && max - cur == 1) {
                return 1;
            }
        }
        return 2;
    }
}