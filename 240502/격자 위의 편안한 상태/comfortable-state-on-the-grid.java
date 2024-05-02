import java.util.*;
public class Main {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] arr;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n+1][n+1];

        // 색칠할 횟수
        for (int i = 0; i < m; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            arr[r][c] = 1;
            if (isComportable(r, c, n)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            } 
        }
    }

    private static boolean isComportable(int r, int c, int n) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + c;
            int ny = dy[i] + r;
            if (!inRange(nx, ny, n) && arr[ny][nx] == 1) {
                count++;
            }
        }
        return count == 3;
    }

    private static boolean inRange(int x, int y, int n) {
        return y < 1 || y > n || x < 1 || x > n;
    }
}