import java.util.*;
public class Main {
    static int MAX_N = 101;
    static char[] arr = new char[MAX_N];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            char c = sc.next().charAt(0);
            arr[p] = c;
        }

        int size = 0;
        for (int i = 1; i < MAX_N; i++) {
            // 뒤에서 앞으로 확인
            int countG = 0;
            int countH = 0;
            if (arr[i] == 'G' || arr[i] == 'H') {
                for (int j = i; j > 0; j--) {
                    if (arr[j] != 'G' && arr[j] != 'H')
                        continue;

                    if (arr[j] == 'G')
                        countG++;
                    if (arr[j] == 'H')
                        countH++;

                    if (countG != 0 && countH != 0 && countH == countG) {
                        size = Math.max(i - j, size);
                    }

                    if (countG == 0 && countH != 0) {
                        size = Math.max(i - j, size);
                    }

                    if (countG != 0 && countH == 0) {
                        size = Math.max(i - j, size);
                    }
                }
            }
        }
        System.out.println(size);
    }
}