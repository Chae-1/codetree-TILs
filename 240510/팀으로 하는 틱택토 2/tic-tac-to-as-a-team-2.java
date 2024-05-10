import java.util.*;
import java.util.*;

public class Main {
    static int[][] tictac = new int[3][3];
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            tictac[i] = Arrays.stream(sc.next().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int winCount = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = i + 1; j <= 9; j++) {
                if (isWin(i, j)) {
                    winCount++;
                }
            }
        }
        System.out.println(winCount);
    }

    private static boolean isWin(int i, int j) {
        int iMatchCounts;
        int jMatchCounts;
        for (int k = 0; k < 3; k++) {
            iMatchCounts = 0;
            jMatchCounts = 0;
            for (int l = 0; l < 3; l++) {
                if (i == tictac[k][l]) {
                    iMatchCounts++;
                }

                if (j == tictac[k][l]) {
                    jMatchCounts++;
                }
            }

            if (isWinCondition(jMatchCounts, iMatchCounts)) {
                return true;
            }
        }

        // 2. 세로 3개 확인
        for (int k = 0; k < 3; k++) {
            iMatchCounts = 0;
            jMatchCounts = 0;
            for (int l = 0; l < 3; l++) {
                if (i == tictac[l][k]) {
                    iMatchCounts++;
                }

                if (j == tictac[l][k]) {
                    jMatchCounts++;
                }
            }

            if (isWinCondition(jMatchCounts, iMatchCounts)) {
                return true;
            }
        }

        // 3. 대각선 두개 확인
        iMatchCounts = 0;
        jMatchCounts = 0;
        for (int k = 0; k < 3; k++) {
            if (tictac[k][k] == i) {
                iMatchCounts++;
            }

            if (tictac[k][k] == j) {
                jMatchCounts++;
            }
        }

        if (isWinCondition(iMatchCounts, jMatchCounts)) {
            return true;
        }

        iMatchCounts = 0;
        jMatchCounts = 0;
        for (int k = 0; k < 3; k++) {
            if (tictac[k][2 - k] == i) {
                iMatchCounts++;
            }

            if (tictac[k][2 - k] == j) {
                jMatchCounts++;
            }
        }

        if (isWinCondition(iMatchCounts, jMatchCounts)) {
            return true;
        }
        
        return false;
    }

    private static boolean isWinCondition(int jMatchCounts, int iMatchCounts) {
        return jMatchCounts > 0 && iMatchCounts > 0 && iMatchCounts + jMatchCounts == 3;
    }
}