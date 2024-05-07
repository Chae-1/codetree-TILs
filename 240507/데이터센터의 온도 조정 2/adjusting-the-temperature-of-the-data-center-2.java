import java.util.*;
public class Main {
    static int[][] A;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();

        A = new int[n][2];

        int startTemp = Integer.MAX_VALUE;
        int endTemp = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();

            startTemp = startTemp > A[i][0] ? A[i][0] : startTemp;
            endTemp = endTemp < A[i][1] ? A[i][1] : endTemp;
        }
        
        int profitWork = 0;
        for (int temp = startTemp; temp < endTemp; temp++) {
            int work = 0;
            for (int j = 0; j < n; j++) {
                if (temp < A[j][0]) {
                    work += c;
                } else if (temp >= A[j][0] && temp <= A[j][1]) {
                    work += g;
                } else {
                    work += h;
                }
            }

            if (work > profitWork) {
                profitWork = work;
            }
        }

        System.out.println(profitWork);

    }
}