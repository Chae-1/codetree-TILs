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
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            int cost = 0;
            for (int j = 0; j < 3; j++) {
                 if (i == j)
                     continue;
                 // a - b 사이에 숫자 하나를 추가로 끼울 수 있다.
                // 그래서 차이가 2를 넘어서면 이동시켜야한다.
                 if (Math.abs(x[i] - x[j]) > 2) {
                     cost++;
                 }
            }
            minCost = Math.min(minCost, cost);
        }
        return minCost;
    }
}