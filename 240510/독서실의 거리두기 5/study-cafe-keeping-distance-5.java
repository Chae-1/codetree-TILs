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
            // 1. 비어 있는 위치를 찾는다.
            if (arr[i] == 0) {
                // 2. i와 떨어져있는 왼쪽의 최대값을 찾는다.
                int curM = Integer.MAX_VALUE;
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] == 1) {
                        curM = Math.min(i - j, curM);
                        break;
                    }
                }

                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == 1) {
                        curM = Math.min(j - i, curM);
                        break;
                    }
                }

                max = Math.max(max, curM);
            }
        }
        System.out.println(max);
    }
}