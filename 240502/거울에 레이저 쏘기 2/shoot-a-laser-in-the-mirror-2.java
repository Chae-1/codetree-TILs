import java.util.*;

// / 는
public class Main {
    // 하, 좌, 상, 우
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};
    static char[][] arr;
    static int x, y;
    static int dirNum;
    static int ans = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            if (arr == null) {
                arr = new char[n][line.length()];
            }
            for (int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        int k = sc.nextInt();
        // 시작 위치를 구한다.
        findStartPosition(k, n);
        dirNum = k / 4; // 시작 방향
        while (inRange(x, y, n)) {
            ans++;
            if (arr[y][x] == '\\') {
                if (dirNum == 0 || dirNum == 2) {
                    dirNum = (dirNum - 1 + 4) % 4;
                } else {
                    dirNum = (dirNum + 1) % 4;
                }
            } else if (arr[y][x] == '/') {
                if (dirNum == 0 || dirNum == 2) {
                    dirNum = (dirNum + 1) % 4;
                } else {
                    dirNum = (dirNum - 1 + 4) % 4;
                }
            }
            x += dx[dirNum];
            y += dy[dirNum];
        }

        System.out.println(ans);
    }

    private static void findStartPosition(int k, int n) {
        x = 0;
        y = 0;
        dirNum = 3;
        // 시작 위치 다음 위치 부터 탐색하기 때문에 k - 1번 순회한다.
        for (int i = 0; i < k - 1; i++) {
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];
            if (inRange(nx, ny, n)) {
                x = nx;
                y = ny;
            } else {
                dirNum = (dirNum + 1) % 4;
            }
        }
    }

    private static boolean inRange(int x, int y, int n) {
        if (x < 0 || x >= n || y < 0 || y >= n) {
            return false;
        }
        return true;
    }
}