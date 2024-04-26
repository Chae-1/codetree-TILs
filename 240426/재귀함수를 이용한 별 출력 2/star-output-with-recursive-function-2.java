import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print2nStar(n);
    }

    public static void print2nStar(int n) {
        if (n < 1)
            return ;
        for (int i = 0; i < n; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        print2nStar(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
    }
}