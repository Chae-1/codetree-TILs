import java.util.Scanner;

public class Main {

    static int[] a;
    static int[] result;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n == 1) {
            // n == 1이면 수열은 한개 존재한다.
            // n을 가지는 수열 하나
            System.out.println(n);
            return;
        }

        a = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
        }

        result = new int[n];
        for (int i = n; i >= 1; i--) {
            // 첫번째 숫자를 결정할 수 있다면
            // 그 뒤의 조합을 확인 할 수 있다.
            if (isPossible(i)) {
                for (int j = 0; j < n; j++) {
                    System.out.print(result[j] + " ");
                }
                return;
            }
        }


    }

    private static boolean isPossible(int first) {
        if (a[0] <= first) {
            return false;
        }
        boolean[] alreadyInSequence = new boolean[n + 1];
        result[0] = first;
        result[1] = a[0] - result[0];
        alreadyInSequence[result[0]] = true;
        alreadyInSequence[result[1]] = true;
        for (int j = 2; j < n; j++) {
            int candidate = a[j - 1] - result[j - 1];
            // 숫자들이 단 한번 씩만 등장한다.
            // 등장하는 숫자를 확인하면 끝
            if (candidate > 0 && !alreadyInSequence[candidate]) {
                alreadyInSequence[candidate] = true;
                result[j] = candidate;
            } else {
                return false;
            }
        }
        return true;
    }
}