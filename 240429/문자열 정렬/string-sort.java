import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String sorted = String.valueOf(c);

        System.out.println(sorted);
    }
}