import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        // 1, 2, 3
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    int firstDiff = Math.abs(i - arr[0]);
                    int secDiff = Math.abs(j - arr[1]);
                    int thirdDiff = Math.abs(k - arr[2]);
                    if (firstDiff <= 2 || secDiff <= 2 || thirdDiff <= 2) {
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
}