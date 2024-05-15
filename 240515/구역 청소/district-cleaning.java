import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(cleanArea(a, b, c, d));

    }

    public static int cleanArea(int a, int b, int c, int d) {
        if (b < c || d < a) {
            return b - a + d - c;
        }
        return Math.max(b, d) - Math.min(a, c);
    }

}