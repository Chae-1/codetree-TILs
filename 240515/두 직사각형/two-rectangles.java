import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        if (isOverlapped(x1, x2, y1, y2, a1, b1, a2, b2)) {
            System.out.println("overlapping");
        } else {
            System.out.println("nonoverlapping");
        }
    }

    private static boolean isOverlappedLine(int x1, int x2, int a1, int a2) {
        if (a1 > x2) {
            return false;
        }

        if (a2 < x1) {
            return false;
        }
        return true;
    }

    private static boolean isOverlapped(int x1, int y1, int x2, int y2, int a1, int b1, int a2, int b2) {

        // x축, y축 직선 두개가 겹처야 사각형이 겹친다.
        return isOverlappedLine(x1, x2, a1, a2) && isOverlappedLine(y1, y2, b1, b2);
    }
}