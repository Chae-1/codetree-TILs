import java.util.*;
public class Main {
    
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] arr;
    static int elapsedTime;
    static int x;
    static int y;

    private static boolean move(int dir, int dist) {
        while (dist-- > 0) {
            x += dx[dir];
            y += dy[dir];
            
            elapsedTime++;
            if (x == 0 && y == 0)
                return true;      
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstTimeToZero = -1;
       
        for (int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();
            int dirNum = 0;
            if (dir == 'N') {
                dirNum = 0;
            } else if (dir == 'S') {
                dirNum = 1;
            } else if (dir == 'E') {
                dirNum = 2;
            } else {
                dirNum = 3;
            }

            boolean done = move(dirNum, dist);
            if (done) {
                firstTimeToZero = elapsedTime;
                break;
            }
        }
        System.out.println(firstTimeToZero);
    }
}