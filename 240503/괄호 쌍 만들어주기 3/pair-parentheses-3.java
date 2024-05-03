import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String parenthesis = sc.next();
        int count = 0;
        int length = parenthesis.length();
        for (int i = 0; i < length; i++) {
            char thesis = parenthesis.charAt(i);
            if (thesis != '(') {
                continue;
            }
            for (int j = i + 1; j < length; j++) {
                if (parenthesis.charAt(j) == ')') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}