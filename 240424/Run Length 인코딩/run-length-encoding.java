import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String encoded = "";
        char c = s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
                continue;
            }
            encoded += c + "" + count;
            c = s.charAt(i);
            count = 1;
        }

        encoded += c + "" + count;
        System.out.println(encoded.length());
        System.out.println(encoded);
    }
}