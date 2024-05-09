import java.util.*;

public class Main {
    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        // 선이 동일할 필요가 전혀 없음.

        // 동일하지 않은 조합을 선택한다.
        // 선이 총 3개 존재한다.
        int count = 0;
        boolean match = false;


        for (int i = 0; i <= 10; i++) {
            boolean allMatch = true;
            for (int j = i + 1; j <= 10; j++) {
                for (int k = j + 1; k <= 10; k++) {
                    /**
                     * 경우의 수는 4가지이다.
                     * 1. x축과 평행한 직선 3개
                     * 2. x축과 평행한 직선 2개와 y축과 평행한 직선 1개
                     * 3. x축과 평행한 직선 1개와 x축과 평행한 직선 2개
                     * 4. y축과 평행한 직선 3개
                     */
                    for (int l = 0; l < n; l++) {
                        // 1. y축과 평행한 직선 3개
                        if (j != points[l].x && k != points[l].x && i != points[l].x) {
                            // 점이 세 직선 중 하나도 일치하지 않는 경우
                            allMatch = false;
                            break;
                        }
                    }

                    if (allMatch) {
                        match = true;
                    }

                    allMatch = true;
                    for (int l = 0; l < n; l++) {
                        // 1. y축과 평행한 직선 3개
                        if (j != points[l].x && k != points[l].x && i != points[l].y) {
                            // 점이 세 직선 중 하나도 일치하지 않는 경우
                            allMatch = false;
                            break;
                        }
                    }

                    if (allMatch) {
                        match = true;
                    }


                    allMatch = true;
                    for (int l = 0; l < n; l++) {
                        // 1. y축과 평행한 직선 3개
                        if (j != points[l].x && k != points[l].y && i != points[l].y) {
                            // 점이 세 직선 중 하나도 일치하지 않는 경우
                            allMatch = false;
                            break;
                        }
                    }

                    if (allMatch) {
                        match = true;
                    }


                    allMatch = true;
                    for (int l = 0; l < n; l++) {
                        // 1. y축과 평행한 직선 3개
                        if (j != points[l].y && k != points[l].y && i != points[l].y) {
                            // 점이 세 직선 중 하나도 일치하지 않는 경우
                            allMatch = false;
                            break;
                        }
                    }

                    if (allMatch) {
                        match = true;
                    }
                }
            }
        }
        System.out.println(match ? "1" : 0);

    }
}