import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static char[] source;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        source = new char[n];
        for (int i = 0; i < n; i++) {
            source[i] = sc.next().charAt(0);
        }

        // 맨 뒤에서 부터 자기 순서를 찾아가면, 저절로 제자리를 찾아 갈 것이다
        // 역순 쌍의 개수를 구하면 된다.
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (source[i] > source[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}