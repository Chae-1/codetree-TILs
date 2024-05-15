import java.util.Scanner;

public class Main {

    // A -> B로 갈건데,
    // x 위치에서 y 위치로 갈 수 있고
    // y 위치에서 x 위치로 갈 수 있다.
    // 가능한 방법을 동원해서 걷는 거리를 최소한의 거리로 하라.

    static int x[] = new int[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
        }
        // 1. A -> B로 직접 갔을 경우
        // 1. A위치에서 x를 경유해 y로 간다음 B로 가는 경우

        System.out.println(calMinCost());
    }

    private static int calMinCost() {
        // 최대 나올 수 있는 비용이
        int minCost = 5;
        // 1. i를 고정 시키고 나머지 둘을 움직일 때
        for (int i = 0; i < 3; i++) {
            int cost = 0;
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    continue;
                }
                // 세우고자 하는 위치 차이
                int diff = Math.abs(i - j);
                if (Math.abs(x[i] - x[j]) != diff) {
                    cost++;
                }
            }
            minCost = Math.min(minCost, cost);
        }
        return minCost;
    }
}