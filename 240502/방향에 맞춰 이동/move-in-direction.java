import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};
        map.put("W", 0);
        map.put("S", 1);
        map.put("N", 2);
        map.put("E", 3);

        int n = sc.nextInt();
        int nx = 0;
        int ny = 0;

        for (int i = 0; i < n; i++) {
            String dir = sc.next();
            int dist = sc.nextInt();
            for (int j = 0; j < dist; j++) {
                nx += dx[map.get(dir)];
                ny += dy[map.get(dir)];
            }
        }

        System.out.println(nx + " " + ny);
    }
}