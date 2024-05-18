import java.util.Scanner;

public class Main {
    static int MAX_N = 101;
    static int maxWinCount;
    // a가 b를 이길 수 있는 최대 값
    static int a[] = new int[MAX_N];
    static int b[] = new int[MAX_N];


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
            int diffTwo = 0;
            int diffOne = 0;
            for (int j = 0; j < n; j++) {
                int diff = a[j] + 1 >= 4 ? 1 : a[j] + 1;
                if (diff == b[j]) {
                    diffOne++;
                }
                // 3 + 2 -> 2
                int diff2 = a[j] + 2 >= 4 ? (a[j] + 2) % 4 + 1 : a[j] + 2;
                if (diff2 == b[j]) {
                    diffTwo++;
                }
            }
            maxCount = Math.max(maxCount, Math.max(diffTwo, diffOne));
        }
        System.out.println(maxCount);
    }
}