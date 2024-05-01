import java.util.*;
public class Main {
    static int OFFSET = 1000;
    static int[][] board = new int[2001][2001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // m -> 3이라고 칠한다.
        for (int i = 0; i < 3; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    board[j][k] = i + 1;
                }
            }
        }

        int size = 0;
        for (int x = 0; x < 2001; x++) {
            for (int y = 0; y < 2001; y++) {
                if (board[x][y] > 0 && board[x][y] != 3)
                    size++;
            }
        }
        System.out.println(size);
    }
}