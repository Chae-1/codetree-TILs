import java.util.Scanner;
public class Main {
    static int midX;
    static int midY;
    static int[][] board = new int[20][20];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 0이면 pass,
        // 1이면 검은색
        // 2이면 흰색
        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= 19; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int result = simulate();
        System.out.println(result);
        if (result != 0) {
            System.out.println(midY + " " + midX);
        }
    }

    private static int simulate() {
        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= 19; j++) {
                if (isWin(i, j)) {
                    return board[i][j];
                }
            }
        }
        return 0;
    }

    private static boolean isWin(int y, int x) {
        if (board[y][x] == 0)
            return false;

        if (toRight(y, x) || toBottom(y, x) || toLeftDiagonal(y, x) || toRightDiagonal(y, x)) {
            return true;
        }

        return false;
    }

    // 현재위치에서 대각선, 아래, 오른쪽에서 5칸 연속해서 start

    private static boolean inRange(int y, int x) {
        return x >= 1 && x < 20 && y >= 1 && y < 20;
    }

    private static boolean toRightDiagonal(int y, int x) {
        for (int i = 1; i < 5; i++) {
            if (!inRange(y + i, x + i) || board[y][x] != board[y + i][x + i]) {
                return false;
            }
        }
        midY = y + 2;
        midX = x + 2;
        return true;
    }

    private static boolean toLeftDiagonal(int y, int x) {
        for (int i = 1; i < 5; i++) {
            if (!inRange(y + i, x - i) || board[y][x] != board[y + i][x - i]) {
                return false;
            }
        }
        midY = y + 2;
        midX = x - 2;
        return true;
    }



    private static boolean toBottom(int y, int x) {
        for (int i = 1; i < 5; i++) {
            if (!inRange(y + i, x) || board[y][x] != board[y + i][x]) {
                return false;
            }
        }
        midY = y + 2;
        midX = x;
        return true;
    }

    private static boolean toRight(int y, int x) {
        for (int i = 1; i < 5; i++) {
            if (!inRange(y, x + i) || board[y][x] != board[y][x + i]) {
                return false;
            }
        }
        midY = y;
        midX = x + 2;
        return true;
    }

}