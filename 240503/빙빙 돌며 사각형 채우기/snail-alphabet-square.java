import java.util.*;
import java.util.*;
public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0 ,1, 0, -1};
    static int dir = 0;
    static String[] Arrs;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Arrs = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".split(" ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        simul(arr, n, m);
        print(arr);
    }

    private static void simul(char[][] arr, int n, int m) {
        int size = n * m;
        int mark = 0;
        int x = 0;
        int y = 0;
        while (size-- != 0) {
            arr[y][x] = Arrs[mark].charAt(0);
            mark = (mark + 1) % 26;
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (inRange(nx, ny, n, m) || arr[ny][nx] != 0) {
                dir = (dir + 1) % 4;
            }

            y += dy[dir];
            x += dx[dir];
        }
    }

    private static boolean inRange(int x, int y, int n, int m) {
        return x < 0 || x >= m || y < 0 || y >= n;
    }

    private static void print(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}