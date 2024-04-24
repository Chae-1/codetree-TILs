import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        
        int a = s.length() - 1;
        while (n != 0) {
            System.out.print(s.charAt(a));
            n--
        }
    }
}