import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = Arrays.stream(sc.next().split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        // 위치
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
                int last = -1;
                // dist가 최대가 될 경우를 구하자.
                int dist = Integer.MAX_VALUE;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == 1) {
                        if (last != -1) {
                            dist = Math.min(j - last, dist);
                        }
                        last = j;
                    }
                }
                arr[i] = 0;
                max = Math.max(max, dist);
            }
        }
        System.out.println(max);
    }
}