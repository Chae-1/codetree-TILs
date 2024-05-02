import java.util.*;
public class Main {
    // L, U, D, R
    static int[] dc = new int[]{-1, 0, 0, 1};
    static int[] dr = new int[]{0, 1, -1, 0};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        // 격자 크기
        int n = sc.nextInt();
        // 반복 횟수
        int t = sc.nextInt();
        // 초기 위치
        int r = sc.nextInt();
        int c = sc.nextInt();
        char dir = sc.next().charAt(0);
        int dirNum = 0;

        if (dir == 'L') {
            dirNum = 0;
        } else if (dir == 'R') {
            dirNum = 3;
        } else if (dir == 'U') {
            dirNum = 1;
        } else {
            dirNum = 2;
        }


        for (int i = 0; i < t; i++) {
            int nr = r + dr[dirNum];
            int nc = c + dc[dirNum];
            if (inRange(nc, nr, n)) {
                r = nr;
                c = nc;
            } else {
                dirNum = 3 - dirNum; 
            }
            
        }

        System.out.println(r + " " + c);
    }

    private static boolean inRange(int c, int r, int n) {
        if (c < 1 || c > n || r < 1 || r > n)
            return false;
        return true;
    }
}