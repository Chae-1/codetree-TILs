import java.util.Scanner;

public class Main {

    static int MAX_N = 1001;
    static int[] hills = new int[MAX_N];
    static int k = 17;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            hills[i] = sc.nextInt();
        }

        // 높이가 height 를 기준으로 [height, height + 17] 범위로 만든다고 했을 때 최소 비용을 산출한다.
        int minCost = Integer.MAX_VALUE;
        for (int height = 0; height < 101; height++) {
            int cost = 0;
            for (int i = 0; i < n; i++) {
                int curHeight = hills[i];
                // [height, height + k] 범위안으로 만들기 위해서
                // curHeight 가 height 보다 높다.
                // curHeight 가 height 보다 높을 때 깎는다.
                // curHeight가 범위 밖일 때
                if (curHeight < height) {
                    cost += (height - curHeight) * (height - curHeight);
                }

                if (curHeight > height + k) {
                    cost += (curHeight - (height + k)) * (curHeight - (height + k));
                }
            }
            minCost = Math.min(cost, minCost);
        }
        System.out.println(minCost);
    }
}