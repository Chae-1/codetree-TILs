import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[201];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;

            for (int j = x1; j < x2; j++) {
                arr[j]++;
            }
        }
        int max = 0;
        for (int i = 0; i <= 200; i++) {
            if (max < arr[i])
                max = arr[i];
        }

        System.out.println(max);
    }
}