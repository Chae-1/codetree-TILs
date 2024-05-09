import java.util.*;

public class Main {
    // 조약돌의 위치를 임시저장하는 배열
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // i 번 시행에서 a번, b번 종이컵을 스왑하고
        // c번 종이컵에 조약돌이 있으면 true
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int maxCount = 0;
        // 조약돌의 위치
        for (int curPosition = 1; curPosition <= 3; curPosition++) {
            // 시작 위치에 조약돌을 위치
            arr = new int[4];
            arr[curPosition] = 1;
            int count = 0;
            // n번의 시행을 수행
            for (int i = 0; i < n; i++) {
                // a, b 종이컵에
                swap(a[i], b[i]);
                if (arr[c[i]] == 1) {
                    count++;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        System.out.println(maxCount);
    }


    private static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}