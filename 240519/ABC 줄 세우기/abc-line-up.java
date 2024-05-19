import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }

        char[] source = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        // A C D B
        //   B를 위치시켜주는 최선
        //
        int dist = 0;
        // A
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == source[j]) {
                    if (i != j) {
                        dist += Math.abs(j - i);
                        swap(source, i, j);
                    }
                }
            }
        }
        System.out.println(dist);
    }

    private static void swap(char[] source, int i, int j) {
        for (int k = i + 1; k <= j; k++) {
            char temp = source[k];
            source[k] = source[k - 1];
            source[k - 1] = temp;
        }
    }
}