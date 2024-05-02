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
        // diff가 음수이면 B가 앞서있다.
        // diff가 양수, 0이면 A가 앞서있다.
        // 0이면 판단하지 않는다.
        int result = 0;
        int leader = 0; // A가 앞서면 1, B가 앞서면 1 저장
        for (int i = 1; i < time; i++) {
            if (diff[i] > 0) {
                // 이전 선두가 B 이면, result 1 증가
                if (leader == 2) {
                    result++;
                }
                leader = 1;
            } else if (diff[i] < 0) {
                if (leader == 1) {
                    result++;
                }
                leader = 2;
            }
        }   

        System.out.println(result);
    }
}