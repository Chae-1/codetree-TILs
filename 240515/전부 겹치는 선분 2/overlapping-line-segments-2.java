import java.util.Scanner;

public class Main {
    static int MAX_N = 101;
    static int[] x1 = new int[MAX_N];
    static int[] x2 = new int[MAX_N];
    static int[] overlapped = new int[MAX_N];
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        // 제외할 선분을 선택한다.
        // 이를 제외하고 모든 선분에 대해서 겹칠 수 있는지 확인한다.
        // 모든 선분의 끝점과 시작점에 대해서
        // 어느 선분의 시작점 > 그 선분을 제외한 끝점 이 단 하나라도 있다면, 모든 선분은 겹칠 수 없다.
        // 가장 작은 끝점 > 가장 큰 시작점 이면 모든 선분은 겹칠 수 없다.
        if (overlappedExceptOne()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean overlappedExceptOne() {
        for (int exceptNum = 0; exceptNum < n; exceptNum++) {
            int maxX1 = Integer.MIN_VALUE;
            int minX2 = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                // 제외할 선분은 확인하지 않는다.
                if (exceptNum == i)
                    continue;
                maxX1 = Math.max(x1[i], maxX1);
                minX2 = Math.min(x2[i], minX2);
            }

            if (minX2 >= maxX1) {
                return true;
            }
        }
        return false;
    }
}