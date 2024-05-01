import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i > 0 && arr[i] > arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(count, maxCount);
        }
        System.out.println(maxCount);
    }
}