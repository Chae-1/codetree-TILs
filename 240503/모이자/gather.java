import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // arr[i] == i 지역에 살고 있는 사람의 수
        //
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // i번째 집에서 모였을 때
        // 최소 거리가되는 i를 구하라.
        // i, j (j > i) 거리는 j - i이다.
        // (arr[j] * j - i) == j에 있는 사람들이 i번째 집으로 가는데 총 거리를 구할 수 있다.
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int curDist = 0;
            for (int j = 0; j < n; j++) {
                curDist += Math.abs((j - i) * arr[j]);
            }

            if (curDist < minDist) {
                minDist = curDist;
            }
        }

        System.out.println(minDist);

    }
}