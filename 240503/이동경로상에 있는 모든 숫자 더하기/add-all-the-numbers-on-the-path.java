import java.util.*;
public class Main {
    // 상, 우, 하, 좌
    static int dx[] = {0, 1, 0, -1};
    static int dy[] = {-1, 0, 1, 0};
    static int dir = 0;
    static int sum = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[][] arr = new int[n][n];

        // 시작 위치
        int x = n / 2;
        int y = n / 2;
        char[] commandList = sc.next().toCharArray();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sum += arr[y][x];

        // t번 만큼 반복
        for (int i = 0; i < t; i++) {
            char command = commandList[i];
            if (command == 'L') {
                dir = (dir - 1 + 4) % 4;
            }

            if (command == 'R') {
                dir = (dir + 1) % 4;
            }

            if (command == 'F') {
                int nx = dx[dir] + x;
                int ny = dy[dir] + y;
                if (inRange(nx, ny, n)) {
                    sum += arr[ny][nx];
                    x = nx;
                    y = ny;
                }
            }
        }
        System.out.println(sum);
    }

    private static boolean inRange(int x, int y, int n) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }
}