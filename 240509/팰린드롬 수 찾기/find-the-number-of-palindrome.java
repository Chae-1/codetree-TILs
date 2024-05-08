import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = 0;
        for (int i = x; i <= y; i++) {
            String s = String.valueOf(i);
            int start = 0;
            int end = s.length() - 1;

            while (start < end) {
                if (s.charAt(start) != s.charAt(end))
                    break;
                start++;
                end--;
            }

            if (start >= end) {
                result++;
            }
        }

        System.out.println(result);
    }
}