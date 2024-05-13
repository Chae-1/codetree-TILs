import java.util.Scanner;

public class Main {

    static int[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            // n == 1이면 수열은 한개 존재한다.
            // n을 가지는 수열 하나
            System.out.println(n);
            return ;
        }

        a = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
        }

        int[] result = new int[n];
        for (int i = n; i >= 1; i--) {
            // 첫번째 숫자를 결정할 수 있다면
            // 그 뒤의 조합을 확인 할 수 있다.
            boolean isEnd = true;
            if (a[0] > i) {
                result[0] = i;
                result[1] = a[0] - result[0];
                for (int j = 2; j < n; j++) {
                    int candidate = a[j - 1] - result[j - 1];
                    if (candidate >= 0) {
                        result[j] = candidate;
                    } else {
                        isEnd = false;
                        break;
                    }
                }

                if (isEnd) {
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}