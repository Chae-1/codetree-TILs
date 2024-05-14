import java.util.*;

public class Main {
    static int MAX_N = 1001;
    static int[] hills = new int[MAX_N];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int minIdx = 0;
        for (int i = 0; i < n; i++) {
            hills[i] = sc.nextInt();
            if (min > hills[i]) {
                min = hills[i];
                minIdx = i;
            }
        }

        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int base = hills[i];
            int up = base - min - 17;
            int totalCost = up > 0 ? up * up : 0;
            hills[minIdx] = up > 0 ? min + up : min;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                if (base < hills[j]) {
                    int cost = hills[j] - hills[minIdx] - 17;
                    totalCost += cost > 0 ? cost * cost : 0;
                } else if (base > hills[j]){
                    int cost = base - hills[j] - 17;
                    totalCost += cost > 0 ? cost * cost : 0;
                }
            }
            hills[minIdx] = min;
            minCost = Math.min(minCost, totalCost);
        }
        System.out.println(minCost);
    }
}