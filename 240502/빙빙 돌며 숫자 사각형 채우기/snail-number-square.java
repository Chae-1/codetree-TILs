import java.util.*;
public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] arr;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int nx = 0;
        int ny = 0;
        int dir = 0;
        arr = new int[n][m];
        for (int i = 0 ; i < n * m; i++) {
            arr[ny][nx] = i+ 1;
            if (!canMove(nx + dx[dir], ny + dy[dir], m, n)) {
                dir = (dir + 1) % 4;
            }
            ny += dy[dir];
            nx += dx[dir];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean canMove(int x, int y, int m, int n) {
        if (x < 0 || x >= m || y < 0 || y >= n || arr[y][x] != 0)
            return false;
        return true;
    }
}