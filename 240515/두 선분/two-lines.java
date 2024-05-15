import java.util.Scanner;

public class Main {
    static int MAX_N = 101;
    static int[] arr = new int[MAX_N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();

        if (isIntersected(x1, x2, x3, x4)) {
            System.out.println("intersecting");
        } else {
            System.out.println("nonintersecting");
        }
    }

    // 선분 x1 - x2
    // 선분 x3 - x4
    // 교차하기 위해서는 x3 <
    private static boolean isIntersected(int x1, int x2, int x3, int x4) {
        // 14, 20   10, 15
        // 선분 x1 - x2가
        // 선분 x3 - x4보다 앞에 위치했을 때
        // x3가 x3보다 크다면 교차한다.
        if (x2 < x3) {
            return false;
        }

        if (x4 < x1) {
            return false;
        }
        return true;
    }
}