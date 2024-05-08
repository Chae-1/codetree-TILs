import java.util.*;

public class Main {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        // 1, 2, 3
        // 2 - 1
        // 2 - 3
        int sequenceComb = 0;
        for (int k = min; k <= max; k++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int ai = Math.abs(k - arr[i]);
                    int bi = Math.abs(k - arr[i]);
                    if (ai == bi) {
                        count++;
                    }
                }
            }
            sequenceComb = Math.max(sequenceComb, count);
        }

        System.out.println(sequenceComb);
    }
}