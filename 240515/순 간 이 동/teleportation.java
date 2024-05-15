import java.util.Scanner;

public class Main {

    // A -> B로 갈건데,
    // x 위치에서 y 위치로 갈 수 있고
    // y 위치에서 x 위치로 갈 수 있다.
    // 가능한 방법을 동원해서 걷는 거리를 최소한의 거리로 하라.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        // 1. A -> B로 직접 갔을 경우
        // 1. A위치에서 x를 경유해 y로 간다음 B로 가는 경우


        int result = calMinCostAToB(A, B, x, y);
        System.out.println(result);

    }

    private static int calMinCostAToB(int A, int B, int x, int y) {
        int resultDirectAToB = Math.abs(A - B);
        // 2. A -> x -> y -> B
        // A에서 x로 가는 비용 + y에서 B로 가는 비용
        int resultStopOverX = Math.abs(A - x) + Math.abs(y - B);
        // 3. A -> y -> x -> B
        // A에서 y로 가는 비용 + x에서 B로 가는 비용
        int resultStopOverY = Math.abs(A - y) + Math.abs(x - B);
        return Math.min(resultDirectAToB, Math.min(resultStopOverX, resultStopOverY));
    }
}