import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
    static char[] source;
    static char[] sorted;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        source = new char[n];
        for (int i = 0; i < n; i++) {
            source[i] = sc.next().charAt(0);
        }

        sorted = Arrays.copyOf(source, n);
        Arrays.sort(sorted);

        // 맨 뒤에서 부터 자기 순서를 찾아가면, 저절로 제자리를 찾아 갈 것이다
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {

                if (source[j] == sorted[i]) {
                    // j != i 라면
                    // i - j번 스왑하면 된다.
                    for (int k = j; k < i; k++) {
                        swap(k, k + 1);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    private static void swap(int j, int i) {
        char temp = source[i];
        source[i] = source[j];
        source[j] = temp;
    }
}