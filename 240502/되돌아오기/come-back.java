import java.util.*;
public class Main {
    // N, S, E, W
    //
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nx = 1000;
        int ny = 1000;
        int time = 0;
        int firstTimeToZero = 0;
        arr = new int[2001][2001];

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

            for (int j = 0; j < dist; j++) {
                arr[ny][nx] = time++;
                nx += dx[dirNum];
                ny += dy[dirNum];
                if (i != 0 && ny == 1000 && nx == 1000 && firstTimeToZero == 0) {
                    firstTimeToZero = time;
                }
            }
        }
        System.out.println(firstTimeToZero);
    }
}