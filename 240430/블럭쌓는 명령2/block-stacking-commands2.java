import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int j = a; j <= b; j++) {
                arr[j] = arr[j] + 1;
            }
        }

        int max = 1;
        for (int i = 2; i <= n; i++) {
            if (arr[max] < arr[i])
                max = i;
        }

        System.out.println(arr[max]);
    }
}