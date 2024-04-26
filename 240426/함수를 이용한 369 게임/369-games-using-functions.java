import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isMagicNumber(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isMagicNumber(int n) {
        return n % 3 == 0 || isContainsThreeToNine(n);    
    }

    public static boolean isContainsThreeToNine(int n) {
        while (n != 0) {
            int lastNum = n % 10;
            if (lastNum % 3 == 0)
                return true;
        }
        return false;
    }
}