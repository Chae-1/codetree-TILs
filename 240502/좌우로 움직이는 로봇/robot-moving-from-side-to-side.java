import java.util.*;
public class Main {
    static int A[] = new int[1_000_001];
    static int B[] = new int[1_000_001];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int timeA = 1;
        for (int i = 0; i < n; i++) {
            int dist = sc.nextInt();
            String dir = sc.next();
            // L이라면 - 방향으로 이동한다.
            int d = dir.equals("L") ? -1 : 1;
            for (int j = 0; j < dist; j++) {
                A[timeA] = A[timeA - 1] + d;
                timeA++;
            }
        }

        int timeB = 1;
        for (int i = 0; i < m; i++) {
            int dist = sc.nextInt();
            String dir = sc.next();
            int d = dir.equals("L") ? -1 : 1;
            // L이라면 - 방향으로 이동한다.
            for (int j = 0; j < dist; j++) {
                B[timeB] = B[timeB - 1] + d;
                timeB++;
            }
        }

        // 두 로봇이 모두 정지 하고 있지 않는 동안에 마주친 횟수를 구한다.


        // 어느 하나는 time 까지 동일한 위치에 존재한다.
        // 이것을 채운다..
        int count = 0;
        int time = timeA > timeB ? timeA : timeB;
        for (int i = timeA; i < time; i++) {
            A[i] = A[i-1];
        }

        for (int i = timeB; i < time; i++) {
            B[i] = B[i-1];
        }

        // 두 로봇이 마추친 경우를 확인한다.
        for (int i = 1; i < time; i++) {
            // 두 로봇이 마주쳤을 때
            if (A[i] == B[i]) {
                // 이전에 마추지지 않은 경우
                if (A[i - 1] != B[i - 1]) {
                    count++; // count++
                }
            }
        }

        System.out.println(count);
    }
}