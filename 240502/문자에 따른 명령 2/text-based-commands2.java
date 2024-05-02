import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String command = sc.next();
        int dx[] = {0, 1, 0, -1};
        int dy[] = {1, 0, -1, 0};

        int dir = 0; // 방향, 처음에는 북쪽으로 향하게 만들었다.
        int x = 0;
        int y = 0;

        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            // 반시계 방향으로 90도 회전
            if (c == 'L')
                dir = (dir - 1 + 4) % 4;
            if (c == 'R')
                dir = (dir + 1) % 4;
            if (c == 'F') {
                x += dx[dir];
                y += dy[dir];
            }
        }

        System.out.println(x + " " + y);
    }
}