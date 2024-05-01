import java.util.*;
public class Main {
    static int OFFSET = 100;
    
    static int SIZE_X = 8;
    static int SIZE_Y = 8;
    
    static int MAX_N = 201;
    static int[] x1 = new int[MAX_N];
    static int[] y1 = new int[MAX_N];
    static int[] x2 = new int[MAX_N];
    static int[] y2 = new int[MAX_N];

    static int[][] board = new int[MAX_N][MAX_N];
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            x1[i] = x + OFFSET;
            x2[i] = x + SIZE_X + OFFSET;
            y1[i] = y + OFFSET;
            y2[i] = y + SIZE_Y + OFFSET;
        }

        for (int i = 0; i < n; i++) {
            for (int x = x1[i]; x < x2[i]; x++) {
                for (int y = y1[i]; y < y2[i]; y++) {
                    board[x][y] = 1;
                }
            }
        }


        int size = 0;
        for (int i = 0; i < MAX_N; i++) {
            for (int j = 0; j < MAX_N; j++) {
                if (board[i][j] == 1)
                    size++;
            }              
        }
        System.out.println(size);
    }
}