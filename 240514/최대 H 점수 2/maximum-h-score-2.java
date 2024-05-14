import java.util.Scanner;

public class Main {
    static int MAX_N = 101;
    static int arr[] = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 최대 l개의 서로 다른 원소를 1씩 올릴 수 있는 횟수

        // 서로 다른 수열에서 l개의 원소를 하나씩 올릴 수 있다면
        // 이것을 사용하지 않고 얻을 수 있는 H 점수를 구하자.
        int l = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxH = 0;
        for (int h = 1; h <= 100; h++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] >= h) {
                    count++;
                }
            }
            // 그냥 h숫자가 될 수 있는 경우
            if (count >= h) {
                maxH = h;
            }
        }


        // maxH보다 작은 값을 전부 1씩 증가시켜보자.
        // maxH인 요소를 증가시킨다.
        if (l > 0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] >= maxH) {
                    arr[i]++;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= maxH + 1) {
                count++;
            }
        }

        maxH = count > maxH ? maxH + 1 : maxH;

        System.out.println(maxH);
    }
}