import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(makingOne(n));
    }

    public static int makingOne(int n) {
        if (n == 1)
            return 0;

        if (n % 2 == 0) {
            return 1 + makingOne(n / 2);
        } else {
            return 1 + makingOne(n / 3);
        }
    }
}