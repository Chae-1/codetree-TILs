import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s2Array);

        if (canMakeSameLetter(s1Array, s2Array)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    private static boolean canMakeSameLetter(char[] s1Array, char[] s2Array) {
        for (int i = 0; i < s1Array.length; i++) {
            if (s1Array[i] != s2Array[i])
                return false;
        }
        return true;
    }
}