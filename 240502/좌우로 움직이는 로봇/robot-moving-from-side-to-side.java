import java.util.*;
public class Main {
    static int A[] = new int[1_000_001];
    static int B[] = new int[1_000_001];
    static int OFFSET = 1_000_000;
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
            if (dir.equals("L")) {
                A[timeA] = A[timeA - 1] - 1;
            } else {
                A[timeA] = A[timeA - 1] + 1;    
            }
            timeA++;
        }

        int timeB = 1;
        for (int i = 0; i < n; i++) {
            int dist = sc.nextInt();
            String dir = sc.next();
            // L이라면 - 방향으로 이동한다.
            if (dir.equals("L")) {
                B[timeB] = B[timeB - 1] - 1;
            } else {
                B[timeB] = B[timeB - 1] + 1;    
            }
            timeB++;
        }
        // 두 로봇이 움직이고 있는 동안에 마주친 횟수를 구한다.
        // -> 이전 위치와 동일한 위치에 있다는 것은 거리가 0이거나 정지했다는 것


        int count = 0;
        int time = timeA > timeB ? timeB : timeA;
        for (int i = 1; i < time; i++) {
            // 두 로봇이 마주쳤을 때
            if (A[i] == B[i]) {
                // 로봇이 이전 위치에서 움직였다면
                if (A[i] != A[i - 1] && B[i] != B[i - 1]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}