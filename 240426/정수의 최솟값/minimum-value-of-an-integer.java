import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(min(a, b, c));
    }

    public static int min(int a, int b, int c) {
        // a, b, c
        int min = a;
        if (min > b) {
            min = b;
        }

        if (min > c) {
            min = c;
        }
        return min;
    }
}