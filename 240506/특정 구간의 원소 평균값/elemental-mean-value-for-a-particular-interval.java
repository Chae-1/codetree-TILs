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

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // i, j 구간의 평균값을 구한 이후
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                // 평균값이 i, j의 원소중 하나라고 같다면
                // result ++;
                double avg = (double)sum / (j - i + 1);

                for (int k = i; k <= j; k++) {
                    if (avg == arr[k]) {
                        result++;
                        break;
                    }
                }
                // 평
            }
        }
        System.out.println(result);
    }
}