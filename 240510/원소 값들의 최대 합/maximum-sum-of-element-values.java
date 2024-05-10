import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }


        // 시작하는 위치
        int max = 0;
        for (int start = 1; start <= n; start++) {

            int cur = start;
            int sum = 0;
            for (int jump = 0; jump < m; jump++) {
                cur = arr[cur];
                sum += arr[cur];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}