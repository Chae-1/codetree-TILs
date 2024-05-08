import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        char[] arr = new char[1001];

        for (int i = 0; i < t; i++) {
            // c
            char c = sc.next().charAt(0);
            // index
            int idx = sc.nextInt();
            arr[idx] = c;
        }

        int specialPosition = 0;
        for (int i = a; i <= b; i++) {
            // d1 k로부터 가장 가까이에 있는 알파벳 S까지의 거리
            int d1 = 1001;
            // d2 k로부터 가장 가까이에 있는 알파벳 N까지의 거리
            int d2 = 1001;

            // 현재 위치 i에서 가장 가까운 d1, d2
            for (int j = a; j <= b; j++) {
                if (arr[j] == 'S') {
                    d1 = Math.min(Math.abs(i - j), d1);
                } else if (arr[j] == 'N'){
                    d2 = Math.min(Math.abs(i - j), d2);
                }
            }


            if (d1 <= d2) {
                specialPosition++;
            }
        }
        System.out.println(specialPosition);
    }
}