import java.util.Scanner;

public class Main {
    static int[] a = new int[10001];
    static int[] b = new int[10001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int x = 1; x < 10000; x++) {
            // x의 시작 값은 모르지만
            int result = x;
            boolean allMatch = true;
            for (int i = 0; i < n; i++) {
                result *= 2;
                if (a[i] > result || b[i] < result) {
                    allMatch = false;
                }
            }

            if (allMatch) {
                min = x;
            }
        }

        System.out.println(min);
    }
}