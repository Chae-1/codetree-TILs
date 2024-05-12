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
        // 가장 작은 값
        int min = arr[0];
        int count = 0;
        for (int i = 0; i < n; i++) {
            // 최대 최소의 차이가 k 이하가 될 수 있는 갯수를 구한다.
            int currMax = arr[i];
            if (min + k >= currMax) {
                count++;
            }
        }
        System.out.println(count);
    }
}