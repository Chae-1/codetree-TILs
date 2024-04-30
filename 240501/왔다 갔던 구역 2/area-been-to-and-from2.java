import java.util.*;
public class Main {
    private static int MAX_LEN = 2001;
    private static int[] arr = new int[MAX_LEN];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int current = 1000;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            String command = sc.next();
            if (command.equals("L")) {
                while (x != 0) {
                    arr[current--]++;
                    x--;
                }
            } else {
                while (x != 0) {
                    arr[current++]++;
                    x--;
                }
            }
        }

        int count = 0;
        for (int i = 0; i <= 2000; i++) {
            int area = 0;
            while (arr[i] >= 2) {
                area++;
                i++;
            }
            if (area > 0) {
                count += area;
            }
        }
        System.out.println(count);
    }
}