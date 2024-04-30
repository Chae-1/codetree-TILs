import java.util.*;
public class Main {
    public static void main(String[] args) {
        String n = new Scanner(System.in).next();
        int result = 0;
        for (int i = 0; i < n.length(); i++) {
            int a = n.charAt(i) - '0';
            result = result * 2 + a;
        }
        System.out.println(result);
    }
}