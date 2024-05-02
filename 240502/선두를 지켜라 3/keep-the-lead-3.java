import java.util.*;
public class Main {
    static int[] A = new int[1_000_001];
    static int[] B = new int[1_000_001];

    public static void main(String[] args) {
    // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int timeA = 1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                A[timeA] = A[timeA - 1] + v;
                timeA++;
            }
        }

        int timeB = 1;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                B[timeB] = B[timeB - 1] + v;
                timeB++;
            }
        }

        // comb = 1, A가 명전
        int comb = -1;
        // 처음 명예의 전당은 고정
        int result = 1;
        for (int i = 1; i < timeB; i++) {
            // A, B가 둘다 명전
            int currentComb = -1;
            if (A[i] == B[i]) {
                currentComb = 0;
            } else if (A[i] > B[i]) {
                currentComb = 1;
            } else {
                currentComb = 2;
            }

            // 처음시행이 아니고, 현재 조합과 다르다면
            if (comb != -1 && currentComb != comb) {
                result++;
            }
            comb = currentComb;
        }
        System.out.println(result);
    }
}