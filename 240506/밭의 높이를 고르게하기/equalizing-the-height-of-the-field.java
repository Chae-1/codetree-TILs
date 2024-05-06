import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        // 최소한 t번 이상 h 높이로 만들기 위한 최소 비용
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n - t; i++) {
            int cost = 0;
            for (int j = i; j < i + t; j++) {
                cost += Math.abs(arr[j] - h);
            }
            min = Math.min(cost, min);
        }

        System.out.println(min);

    }
}