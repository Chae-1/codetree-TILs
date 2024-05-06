import java.util.Scanner;
public class Main {
    // 8방향으로 LEE라는 문자열이 나오는 횟수를 구하라.
    // L이 등장하는 위치에서 8방향으로 탐색

    // 오른쪽 위 대각선,
    // 오른쪽 아래 대각선
    // 왼쪽 위 대각선
    // 왼쪽 아래 대각선
    static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
    static int DIR_NUM = 8;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] letters = new char[n][];
        for (int i = 0; i < n; i++) {
            letters[i] = sc.next().toCharArray();
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (letters[i][j] != 'L')
                    continue;

                for (int k = 0; k < DIR_NUM; k++) {
                    // E가 두번 등장하면 된다.
                    // count가 증가한다.

                    // 현재위치를 임시 저장
                    // 다음위치와 비교를 위해서
                    int curX = j;
                    int curY = i;
                    int cnt = 1;
                    while (true) {
                        // 이동 후 위치
                        int ny = curY + dy[k];
                        int nx = curX + dx[k];
                        // 진행하지 못하면 다른 방향으로 탐색
                        if (!inRange(nx, ny, n, m))
                            break;
                        // E가 아니라면 다른 방향으로 탐색
                        if (letters[ny][nx] != 'E') {
                            break;
                        }
                        curX = nx;
                        curY = ny;
                        cnt++;
                        // cnt가 3이면 LEE라는 문자열을 찾았다.
                        if (cnt == 3) {
                            result++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }

    private static boolean inRange(int x, int y, int n, int m) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }
}