import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;
        for (int i = x; i <= y; i++) {
            int temp = i;
            int curSum = 0;
            while (temp != 0) {
                curSum += temp % 10;
                temp /= 10;
            }
            sum = Math.max(sum, curSum);
        }

        System.out.println(sum);
    }
}