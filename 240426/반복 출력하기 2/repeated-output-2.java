import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printHello(n);
    }

    // Hello를 n번 출력하는 함수.
    // Hello를 출력하고 printHello(n-1)을 하면 된다.
    public static void printHello(int n) {
        if (n == 0)
            return ;
        printHello(n-1); //
        System.out.println("HelloWorld");
    }

}