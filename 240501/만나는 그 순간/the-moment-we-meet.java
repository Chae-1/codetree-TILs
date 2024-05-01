import java.util.*;

public class Main {

    // a, b가 이동한 거리는 똑같다.
    // n, m 만큼 방향이 결정된다.
    static int[] A = new int[2_000_001];
    static int[] B = new int[2_000_001];
    static int[] dir = new int[] {-1, 1};
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       int time = 0;
       int stopCount = 0;
       for (int i = 0; i < n; i++) {
            String direc = sc.next();
            int step = sc.nextInt();
            int dir = direc.equals("L") ? -1 : 1;
            for (int j = 0; j < step; j++) {
                A[++time] = A[time - 1] + dir;
                stopCount++;
            }
        }
        
        time = 0;
        for (int i = 0; i < m; i++) {
            String direc = sc.next();
            int step = sc.nextInt();
            int dir = direc.equals("L") ? -1 : 1;
            for (int j = 0; j < step; j++) {
                B[++time] = B[time - 1] + dir;
            }
        }

        for (int i = 1; i < stopCount; i++) {
            if (A[i] == B[i]) {
                System.out.println(i);
            } else {
                if (i - 1 == stopCount) {
                    System.out.println(-1);
                }
            }
        }
    }
}