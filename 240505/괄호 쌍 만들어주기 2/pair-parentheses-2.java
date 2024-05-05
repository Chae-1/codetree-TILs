import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int result = 0;
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) != '(' || a.charAt(i + 1) != '(') continue;

            for (int j = i + 1; j < a.length() - 1; j++) {
                if (a.charAt(j) == ')' && a.charAt(j + 1) == ')')
                    result++;
            }
        }
        System.out.println(result);
    }
}