import java.util.*;
public class Main {
    static int A[] = new int[1_000_001];
    static int B[] = new int[1_000_001];
    

public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int time = 1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                A[time] = A[time - 1] + v;
                time++;
            }
        }

        time = 1;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                B[time] = B[time - 1] + v;
                time++;
            }
        }

        int[] diff = new int[time];

        for (int i = 1; i < time; i++) {
            diff[i] = A[i] - B[i];
        }
        // 속도의 차이의 부호가 이전 다르면, 선두가 바뀐다.
        // 현재 속도와 이전 속도의 곱이 음수면 선두가 바뀐다.
        int result = 0;
        // diff가 음수이면 B가 앞서있다.
        // diff가 양수, 0이면 A가 앞서있다.
        // 0이면 판단하지 않는다.
        boolean beforeResult = diff[1] < 0 ? true : false;
        for (int i = 2; i < time; i++) {
            // diff가 0이면 방향이 바뀌지 않은 것이다.
            if (diff[i] == 0) {
                continue;
            }

            boolean currentResult = diff[i] < 0 ? true : false;
            if (currentResult != beforeResult) {
                result++;
                beforeResult = currentResult;
            }
        }
        System.out.println(result);
    }
}