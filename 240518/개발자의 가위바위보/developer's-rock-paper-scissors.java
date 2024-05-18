import java.util.Scanner;

public class Main {
    static int MAX_N = 101;
    static int maxWinCount;
    // a가 b를 이길 수 있는 최대 값
    static int a[] = new int[MAX_N];
    static int b[] = new int[MAX_N];
    // 가위 > 바위 > 보
    // 바위 > 가위 > 보
    //
    // 보 > 바위 > 가위
    // 1    2      3


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        // 내가 낸 숫자가 클 때 이기는 경우
        // 내가 낸 숫자가 작을 때 이기는 경우
        // 같으면 비긴다. 절대값 차이가 1 차이 날 떄 이기는 경우 2 차이가 날때
        int maxCount = 0;
        for (int i = 1; i <= 3; i++) {
            // 작다, 크다
            // 1 2 3
            // 차이가 2가 날때 이기는 경우
            int diffTwo = 0;
            // 차이가 1이 날때 이기는 경우
            int diffOne = 0;
            for (int j = 0; j < n; j++) {
                int afterOne = (a[j] + 1) % 3 == 0 ? 1: (a[j] + 1) % 3;
                if (afterOne == b[j]) {
                    diffOne++;
                }

                int afterTwo = (a[j] + 2) % 3 == 0 ? 1 : (a[j] + 2) % 3;
                if (afterTwo == b[j]) {
                    diffTwo++;
                }
            }
            maxCount = Math.max(diffTwo, diffOne);
        }
        System.out.println(maxCount);
    }
}