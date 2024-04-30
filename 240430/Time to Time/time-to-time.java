import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();

        int startMinute = a * 60 + b;
        int endMinute = c * 60 + d;
        System.out.println(endMinute - startMinute);
    }
}