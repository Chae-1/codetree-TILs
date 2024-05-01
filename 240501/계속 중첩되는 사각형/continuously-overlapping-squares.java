import java.util.*;
public class Main {

    static int RED = 1;
    static int BLUE = 2;

    static int OFFSET = 100;
    static int MAX_R = 201;
    static int N = 10;
    static int[] x1 = new int[N];
    static int[] y1 = new int[N];
    static int[] x2 = new int[N];
    static int[] y2 = new int[N];
    
    static int[][] B = new int[MAX_R][MAX_R];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt() + OFFSET;
            y1[i] = sc.nextInt() + OFFSET;
            x2[i] = sc.nextInt() + OFFSET;
            y2[i] = sc.nextInt() + OFFSET;
        }
        
        for (int i = 0; i < n; i++) {
            for (int x = x1[i]; x < x2[i]; x++) {
                for (int y = y1[i]; y < y2[i]; y++) {
                    B[x][y] = (i % 2) + 1; 
                }
            }
        }

        int size = 0;
        for (int x = 0; x < MAX_R; x++) {
            for (int y = 0; y < MAX_R; y++) {
                if (B[x][y] == BLUE) {
                    size++;
                }
            }
        }        
        System.out.println(size);

    }
}