import java.util.*;
public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    // 걸린 시간
    static int elapsedTime;
    static int ans = -1;
    // 북쪽을 향해 처음 시작한다.
    static int dir = 0;
    static int x, y ;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String entireCommand = sc.next();
        for (int i = 0; i < entireCommand.length(); i++) {
            char command = entireCommand.charAt(i);
            elapsedTime++;
            if (command == 'L') {
                dir = (dir - 1 + 4) % 4;
            } else if (command == 'R') {
                dir = (dir + 1) % 4;
            } else if (command == 'F') {
                // dir 방향으로 한칸 이동
                x += dx[dir];
                y += dy[dir];
            }
            if (x == 0 && y == 0) {
                ans = elapsedTime;
                break;
            }
        }

        System.out.println(ans);
    }
}