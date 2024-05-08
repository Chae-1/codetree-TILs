import java.util.*;

public class Main {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }


        int maxCount = 0;
        for (int h = 1; h < max; h++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                // 해수면 위로 빙산이 존재한다.
                int cur = i;
                while (cur < n && arr[cur] - h > 0) {
                    cur++;
                }

                if (cur != i) {
                    i = cur;
                    count++;
                }
            }

            maxCount = Math.max(count, maxCount);
        }

        System.out.println(maxCount);
    }
}