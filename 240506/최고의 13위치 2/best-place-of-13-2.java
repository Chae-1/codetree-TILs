import java.util.Scanner;
public class Main {
    // 8방향으로 LEE라는 문자열이 나오는 횟수를 구하라.
    // L이 등장하는 위치에서 8방향으로 탐색

    // 오른쪽 위 대각선,
    // 오른쪽 아래 대각선
    // 왼쪽 위 대각선
    // 왼쪽 아래 대각선
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
                for (int k = i + 1; k < n; k++) {
                    for (int l = 0; l < n - 2; l++) {
                        max = Math.max(arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[k][l] + arr[k][l + 1] + arr[k][l + 2], max);
                    }
                }
            }
        }
        System.out.println(max);

    }
}