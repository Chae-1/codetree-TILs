import java.util.*;
public class Main {
     public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] rooms = new int[n];
        for (int i = 0; i < n; i++) {
            rooms[i] = sc.nextInt();
        }


        int minDistance = Integer.MAX_VALUE;
        // 시작 방 위치
        for (int i = 0; i < n; i++) {
            int distance = 0;
            for (int j = 0; j < n; j++) {
                // i에서 j라는 방으로 이동하기 위해서 사람들이 총 이동한 거리
                // 사람의 수 * 거리
                distance += rooms[(i + j) % n] * j;
            }
            minDistance = Math.min(distance, minDistance);
        }

        System.out.println(minDistance);
    }
}