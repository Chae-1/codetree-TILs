import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] *= 2;
            for (int j = 0; j < n; j++) {
                int[] except = new int[n - 1];
                int cur = 0;
                for (int k = 0; k < n; k++) {
                    if (j != k) {
                        except[cur++] = arr[k];
                    }
                }

                int diffSum = 0;
                for (int k = 1; k < n - 1; k++) {
                    diffSum += Math.abs(except[k] - except[k - 1]);
                }
                minDiff = Math.min(diffSum, minDiff);
            }
            arr[i] /= 2;
        }
        System.out.println(minDiff);
    }
}