import java.util.*;

public class Main {
    static String s;
    static String substring;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        substring = sc.next();
        int index = findSubSringIndex();
        System.out.println(index);
    }

    public static int findSubSringIndex() {
        int left = 0;
        while (left < s.length() - substring.length() + 1) {
            if (isMatch(left)) {
                return left;
            }
            left++;
        }
        return -1;
    }

    public static boolean isMatch(int left) {
        for (int i = 0; i < substring.length(); i++) {
            if (s.charAt(left + i) != substring.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}