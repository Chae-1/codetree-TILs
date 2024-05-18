import java.util.Scanner;

public class Main {
    static int a[] = new int[3];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(maxCount());
    }

    public static int maxCount() {
        // 이미 세 사람이 연달아 서 있는 경우
        if (a[0] + 1 == a[1] && a[1] + 1 == a[2]) {
            return 0;
        }
        // 1 3  6
        // ex) 1 5 -> 거리는 4이지만, 그 사이에 들어갈 수 있는 위치는 3이다.
        // 즉, 거리 - 1이 우리가 구하는 정답이다.
        // a[1]에서 a[0], a[2] 사이의 최대 거리를 구한다.
        // 그 거리의 -1이 최대 이동 횟수가 된다.
        int maxDistance = Math.max(a[1] - a[0], a[2] - a[1]);
        return maxDistance - 1;
    }
}