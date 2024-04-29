import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int candidate = arr[i] + arr[2 * n - 1 - i];
            if (max < candidate)
                max = candidate;
        }
        System.out.println(max);
    }
}