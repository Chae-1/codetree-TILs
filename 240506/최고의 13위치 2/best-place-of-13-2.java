import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 격자 두개를 잡아야한다.
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 2; j++) {
                int pick1 = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                for (int k = i; k < n; k++) {
                    for (int l = 0; l < n - 2; l++) {
                        if (k == i && l + 2 == j) {
                            l += 5;
                            continue;
                        }

                        if (k == i && l == j) {
                            l += 3;
                            continue;
                        }

                        max = Math.max(pick1 + arr[k][l] + arr[k][l + 1] + arr[k][l + 2], max);
                    }
                }
            }
        }
        System.out.println(max);

    }
}