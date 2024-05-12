import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 배열 내 최솟값과 최댓값이 가질 수 있는 최대 차이
        int k = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int maxCount = 0;
        // 시작할 작은 값을 선택한 이후
        // 최대 차이가 k가 나는 원소들의 개수가 가장 많은 시점을 구한다.

        for (int i = 0; i < n; i++) {

            int min = arr[i];
            int count = 0; // i번쨰 원소를 최솟값으로 한 구간을 탐색
            for (int j = i; j < n; j++) {
                // 최대 최소의 차이가 k 이하가 될 수 있는 갯수를 구한다.
                int currMax = arr[j];
                if (min + k >= currMax) {
                    count++;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        System.out.println(maxCount);

    }
}