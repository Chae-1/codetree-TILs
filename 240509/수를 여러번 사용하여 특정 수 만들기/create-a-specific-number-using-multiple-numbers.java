import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int aMaxCount = c / a;
        int bMaxCount = c / b;
        int closedC = 0;
        for (int i = 0; i <= aMaxCount; i++) {
            for (int j = 0; j <= bMaxCount; j++) {
                int result = a * i + j * b;
                if (result <= c) {
                    closedC = Math.max(closedC, result);
                }
            }
        }
        System.out.println(closedC);
    }
}