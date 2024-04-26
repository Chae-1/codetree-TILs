import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (!isConsistSameAlpha(a)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isConsistSameAlpha(String a) {
        char c = a.charAt(0);
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) != c) {
                return false;
            }
        }
        return true;
    }
}