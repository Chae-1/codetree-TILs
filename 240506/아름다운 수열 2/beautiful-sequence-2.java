import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[m];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }

        
        int result = 0;
        for (int i = 0; i <= n - m; i++) {
            boolean[] check = new boolean[m];
            
            // 1. A에서 m개 만큼의 부분 수열을 구한다.
            for (int j = i; j < i + m; j++) {
                // 부분 수열에서 B 수열의 수가 존재하는 지 확인
                for (int k = 0; k < m; k++) {
                    // B 수열의 중복을 허용하지 않고, 포함되어있는 수라면
                    if (B[k] == A[j] && !check[k]) {
                        check[k] = true;
                    }
                }
            }
            
            // 전부 들어가 있다면, result ++;
            if (isAllMatch(check)) {
                result++;
            }
        }
        System.out.println(result);

    }

    private static boolean isAllMatch(boolean[] check) {
        for (int i = 0; i < check.length; i++) {
            if (!check[i]) {
                return false;
            }
        }
        return true;
    }
}