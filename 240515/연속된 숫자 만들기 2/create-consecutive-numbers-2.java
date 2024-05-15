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
        // 현재 숫자랑 위치가 다른 숫자들 중 연속되지 않은 숫자의 개수를 구한다.
        // ex ) 1 2 3
        // 1 0 1 -> 0이라는 숫자가 있다는 것은
        // 이 값을 기준으로 양쪽 두개의 숫자가 연속된다는 것을 의미한다.
        // ex ) 1 4 5
        // ->   2 1 1
        // ->   1이 있다는 것은 한개의 숫자만 움직이면 모든 수가 연속된다는 것을 의미한다.
        // -> 이 연속되지 않은 숫자의 개수를 구해서 가장 작은 값이 minCost가 될 것이다 .
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            int cost = 0;
            for (int j = 0; j < 3; j++) {
                 if (i == j)
                     continue;
                 if (Math.abs(x[i] - x[j]) != 1) {
                     cost++;
                 }
            }
            minCost = Math.min(minCost, cost);
        }
        return minCost;
    }
}