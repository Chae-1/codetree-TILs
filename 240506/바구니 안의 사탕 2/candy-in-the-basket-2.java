import java.util.*;
public class Main {
    static int MAX_N = 101;
    static int[] pos = new int[MAX_N];
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int piece = sc.nextInt();
            int p = sc.nextInt();
            pos[p] = piece;
        }

        // 2 5 8
        // i  ~ i + 2k
        int max = 0;
        for (int i = 1; i < MAX_N - 2 * k; i++) {
            int sum = 0;
            for (int j = i; j <= i + 2 * k; j++) {
                sum += pos[j];
            }
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}