import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(weirdSequence(n));
    }

    public static int weirdSequence(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        return weirdSequence(n / 3) + weirdSequence(n - 1);
    }
}