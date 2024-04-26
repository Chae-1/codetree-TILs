import java.util.*;

public class Main {
    static int[] arr;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < m; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            System.out.println(rangeSum(left, right));
        }
    }

    public static int rangeSum(int left, int right) {
        int sum = 0;
        for (int i = left - 1; i < right; i++) {
            sum += arr[i];
        }
        return sum;
    }
}