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
        int maxX1 = Integer.MIN_VALUE;
        int minX2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            maxX1 = Math.max(maxX1, x1[i]);
            minX2 = Math.min(minX2, x2[i]);
        }

        // 어느 선분이라도 시작점이 다른 선분의 끝점보다 뒤에 오면
        // 겹칠 수 있는 지점이 없다.
        if (maxX1 <= minX2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}