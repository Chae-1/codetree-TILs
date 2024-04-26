import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towardN(n);
        System.out.println();
        towardZero(n);
        System.out.println();

    }

    public static void towardN(int n) {
        if (n < 1)
            return ;
        towardN(n - 1);
        System.out.print(n + " "); 
    }

    public static void towardZero(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        towardZero(n - 1);
    }
}