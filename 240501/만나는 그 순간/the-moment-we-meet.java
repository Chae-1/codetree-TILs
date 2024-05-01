import java.util.*;

public class Main {

    // a, b가 이동한 거리는 똑같다.
    // n, m 만큼 방향이 결정된다.
    static int[] A = new int[2_000_001];
    static int[] B = new int[2_000_001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int totalTime = 0;
        int time = 1;
        for (int i = 0; i < n; i++) {
            String dir = sc.next();
            int t = sc.nextInt();
            int step = dir.equals("L") ? -1 : 1;
            for (int j = 0; j < t; j++) {
                A[time] = A[time - 1] + step;
                time++;
            }
            totalTime += t;
        }

        time = 1;
        for (int i = 0; i < m; i++) {
            String dir = sc.next();
            int t = sc.nextInt();
            int step = dir.equals("L") ? -1 : 1;
            for (int j = 0; j < t; j++) {
                B[time] = B[time - 1] + step;
                time++;
            }
        }

        int meet = -1;
        for (int i = 1; i <= totalTime; i++) {
            if (A[i] == B[i]) {
                meet = i;
                break;
            }
        }

        System.out.println(meet);
    }
}