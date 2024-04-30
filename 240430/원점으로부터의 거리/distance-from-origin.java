import java.util.*;
public class Main {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int no;

        Point(int x, int y,int no) {
            this.x = x;
            this.y = y;
            this.no = no;
        }

        @Override
        public int compareTo(Point p) {
            int sumThis = Math.abs(this.x)  + Math.abs(this.y);
            int sumP = Math.abs(p.x) + Math.abs(p.y);
            if (sumThis == sumP)
                return this.no - p.no;
            return sumThis - sumP;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Point(x, y, i + 1);
        }

        Arrays.sort(points);
        for (Point p : points) {
            System.out.println(p.no);
        }

    }
}