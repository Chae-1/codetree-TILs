import java.util.*;
public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int dir = 0;
    static int num = 1;

    // 처음에 오른쪽 방향으로 나아간다.
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 처음 시작 위치는 직사각형 가운데
        int[][] arr = new int[n][n];
        int x = n / 2;
        int y = n / 2;
        arr[y][x] = num++;
        // 순회 횟수는 n * n이다.
        // 방향이 두번 전환될 때마다 전진 횟수가 1 증가 한다.
        // 전진 횟수는 n - 1이 될때까지 증가한다.
        int walkCount = 1;
        while (!(x == n-1 && y == n-1)) {
            for (int i = 0; i < walkCount; i++) {
                x += dx[dir];
                y += dy[dir];
                arr[y][x] = num++;
            }
            // 해당 방향으로 walkCount 만큼 전진했으면,
            // 방향을 바꾼다.
            dir = (dir + 1) % 4;

            // 방향 교체 횟수 2회마다 walkCount가 증가한다.
            // 단, n만큼 증가하지 않는다.
            walkCount = dir % 2 == 0 && walkCount + 1 < n ? walkCount + 1 : walkCount;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}