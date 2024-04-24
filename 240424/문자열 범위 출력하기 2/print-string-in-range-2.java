import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        int size = s.length();
        if (size >= n) {
            for (int i = s.length() - 1; i >= size - n; i--) {
                System.out.print(s.charAt(i));
            }
        } else {
            System.out.println(s);
        }
    }
}