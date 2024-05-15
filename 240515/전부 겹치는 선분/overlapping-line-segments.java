import java.util.Scanner;

public class Main {
    static int MAX_N = 101;
    static int[] x1 = new int[MAX_N];
    static int[] x2 = new int[MAX_N];
    static int[] overlapped = new int[MAX_N];
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        System.out.println(allOverlapped() ? "Yes" : "No");
    }

    public static boolean allOverlapped() {
        int baseX1 = x1[0];
        int baseX2 = x2[0];
        for (int i = 1; i < n; i++) {
            if (baseX2 < x1[i]) return false;
            if (baseX1 > x2[i]) return false;
        }
        return true;
    }

}