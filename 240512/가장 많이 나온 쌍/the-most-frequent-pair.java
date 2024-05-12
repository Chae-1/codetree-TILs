import java.util.Scanner;

public class Main {

    static int MAX_N = 101;
    static int[] x = new int[MAX_N];
    static int[] y = new int[MAX_N];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        // 1. i, j 쌍과 일치하는 순서 쌍의 최대 개수를 구하면 된다.
        int maxCount = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int count = 0;
                for (int k = 0; k < m; k++) {
                    if ((x[k] == i && y[k] == j) || (x[k] == j && y[k] == i)) {
                        count++;
                    }
                }
                maxCount = Math.max(count, maxCount);
            }
        }
        System.out.println(maxCount);
    }
}