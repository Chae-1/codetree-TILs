import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxCount = 0;
        int count = 0;
        // 1. 이번 원소와 저번 원소의 부호가 같다.
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i - 1] * arr[i] >= 0) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }
        System.out.println(maxCount);
    }
}