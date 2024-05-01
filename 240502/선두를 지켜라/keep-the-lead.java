import java.util.*;
public class Main {
    static int A[] = new int[1_000_001];
    static int B[] = new int[1_000_001];
    
    static int PROCEEDING_A = 1;
    static int PROCEEDING_B = 2;

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
                A[time++] += v;
            }
        }

        time = 1;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                B[time++] += v;
            }
        }
        
        int[] diff = new int[time];
        for (int i = 1; i < time; i++) {
            diff[i] = A[i] - B[i];
        }
        // 속도의 차이의 부호가 이전 다르면, 선두가 바뀐다.
        // 현재 속도와 이전 속도의 곱이 음수면 선두가 바뀐다.
        int result = 0;
        for (int i = 2; i < time; i++) {
            if (diff[i - 1] * diff[i] < 0) {
                result++;
            }           
        }
        System.out.println(result);
    }
}