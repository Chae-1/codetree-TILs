import java.util.*;
public class Main {
    static int OFFSET = 100;
    static int[][] board = new int[201][201]; // x: 0 ~ 200, y: 0 ~ 200

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // -일 가능성이 존재한다.
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    board[j][k]++;
                }
            }
        }
        
        int size = 0;
        for (int i = 0; i <= 200; i++) {
            for (int j = 0; j <= 200; j++) {
                if (board[i][j] > 0)
                    size++;
            }
        }
        System.out.println(size);
    }
}