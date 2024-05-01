import java.util.*;
public class Main {
    static int OFFSET = 1000;

    static int SIZE_X = 8;
    static int SIZE_Y = 8;

    static int MAX_N = 2001;
    static int[] X1 = new int[2];
    static int[] Y1 = new int[2];
    static int[] X2 = new int[2];
    static int[] Y2 = new int[2];

    static int[][] board = new int[MAX_N][MAX_N];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            X1[i] = x1 + OFFSET;
            Y1[i] = y1 + OFFSET;

            X2[i] = x2 + OFFSET;
            Y2[i] = y2 + OFFSET;
        }

        for (int i = 0; i < 2; i++) {
            for (int x = X1[i]; x < X2[i]; x++) {
                for (int y = Y1[i]; y < Y2[i]; y++) {
                    board[x][y] = i + 1;
                }
            }
        }


        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;


        for (int x = 0; x < MAX_N; x++) {
            for (int y = 0; y < MAX_N; y++) {
                if (board[x][y] == 1) {
                    minX = Math.min(minX, x);
                    maxX = Math.max(maxX, x);
                    minY = Math.min(minY, y);
                    maxY = Math.max(maxY, y);
                }
            }
        }
        int result = (maxX - minX + 1) * (maxY - minY + 1);
        System.out.println(result);
    }
}