import java.util.*;
public class Main {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i= 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int overThree = 0;
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                int count = 0;
                for (int k = 0; k < 4; k++) {
                    int nx = x + dx[k];
                    int ny = y + dy[k];
                    if (inRange(nx, ny, n) && arr[ny][nx] == 1) {
                        count++;
                    }
                }

                if (count >= 3) {
                    overThree++;
                }
            }
        }
        System.out.println(overThree);
    }

    private static boolean inRange(int x, int y, int n) {
        if (x < 0 || x >= n || y < 0 || y >= n)
            return false;
        return true;
    }
}