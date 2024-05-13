import java.util.*;
public class Main {
    static int[] comb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        comb = new int[15];
        for (int i = 0; i < 15; i++) {
            comb[i] = sc.nextInt();
        }

        int a = comb[0];
        int b = comb[1];
        int c = comb[2];
        int d = comb[3];
        for (int i = 1; i <= a; i++) {

            for (int j = i; j <= b; j++) {
                for (int l = j; l <= c; l++) {
                    for (int m = l; m <= d; m++) {
                        if (isMatch(i, j, l, m)) {
                            System.out.println(i + " " + j + " " + l + " " + m);
                        }
                    }
                }
            }
        }

    }

    private static boolean isMatch(int a, int b, int c, int d) {
        int[] arr = {a,b,c,d};
        int[] comp = new int[15];
        int cur = 0;
        for (int i = 0; i < 4; i++) {
            comp[cur++] = arr[i];
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                comp[cur++] = arr[i] + arr[j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 4; k++) {
                    comp[cur++] = arr[i] + arr[j] + arr[k];
                }
            }
        }

        comp[cur++] = arr[0] + arr[1] + arr[2] + arr[3];
        Arrays.sort(comb);
        Arrays.sort(comp);
        return Arrays.equals(comb, comp);
    }
}