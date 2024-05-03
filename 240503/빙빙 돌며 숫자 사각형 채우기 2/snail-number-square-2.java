import java.util.*;
public class Main {
    static int dx[] = {0, 1, 0, -1};
    static int dy[] = {1, 0, -1, 0};
    static int dir = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        simulate(arr, n, m);
        print2DArr(arr);
    }

    public static void print2DArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void simulate(int[][] arr, int n, int m) {
        int size = n * m;
        int x = 0;
        int y = 0;
        int mark = 1;
        while (size-- != 0) {
            // 다음 위치가 유효하지 않다면 방향을 전환한다.
            arr[y][x] = mark++;
            if (inRange(x + dx[dir], y + dy[dir], n, m) || arr[y + dy[dir]][x + dx[ dir]] != 0) {
                dir = (dir + 1) % 4;
            }
            y += dy[dir];
            x += dx[dir];
        }
    }

    public static boolean inRange(int x, int y, int n, int m) {
        return x < 0 || x >= m || y < 0 || y >= n;
    }
}