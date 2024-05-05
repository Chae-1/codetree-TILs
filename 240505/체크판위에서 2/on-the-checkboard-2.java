import java.util.*;

public class Main {
    
    static char[][] rect;

    public static void main(String[] args) {    

        Scanner sc = new Scanner(System.in);
        // r * c 크기의 직사각형을 입력
        int r = sc.nextInt();
        int c = sc.nextInt();
        rect = new char[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                rect[i][j] = sc.next().charAt(0);
            }
        }

        // 현재 위치의 격자와 같지 않아야 한다.
        // 점프의 조건이 맞아야 점프를 할 수있다.

        int count = 0;

        // 시행 횟수가 몇번인가?
        // row 만큼
        int x = 0; // 위치는 항상 0, 0에서 시작한다.
        int y = 0;
        int jumpCount = 0;
        // 시작 위치는 고정
        // 점프를 한 위치에서는 가능한 모든 위치를 탐색해야한다.
        // 점프는 두 번만 사용할 수 있다.

        // 첫 번째 점프를 할 위치를 선택한다.
        for (int i = y + 1; i < r; i++) {
            for (int j = x + 1; j < c; j++) {
                // 첫번째로 점프를 할 위치를 선택하고
                if (!canJump(0, 0, j , i)) {

                    continue;
                }

                // 두번쨰로 점프를 할 위치를 선택
                // 점프할 수 있다면 r,c로 이동할 수 있는지 확인
                for (int pickY =  i + 1; pickY < r; pickY++) {
                    for (int pickX = j + 1; pickX < c; pickX++) {
                        // 두번째 위치로 jump를 수행한다.
                        if (!canJump(j, i, pickX, pickY)) {
                            continue;
                        }

                        if (canJump(pickX, pickY, c - 1, r - 1)) {
                            jumpCount++;
                        }
                    }
                }
            }
        }
        System.out.println(jumpCount);

    }

    // 해당 위치에서 타겟 위치까지 점프를 할 수 있다면
    // 해당 위치로 점프를 한다.
    private static boolean canJump(int x, int y, int afterX, int afterY) {
        // 1. 현재 위치에서 우, 하로 한칸씩 이상 전진하지 않으면 점프를 하지 못한다.
        if (afterX <= x || afterY <= y) {
            return false;
        }

        if (rect[y][x] == rect[afterY][afterX]) {
            return false;
        }

        return true;
    }
}