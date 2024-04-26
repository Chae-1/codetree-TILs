import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int b = sc.nextInt();
        switch (o) {
            case '+':  
                System.out.println(a + " + " + b + " = "+ add(a, b));
                break;
            case '-':
                System.out.println(a + " - "+ b + " = " + substract(a, b));
                break;
            case '*': 
                System.out.println(a + " * "+ b + " = "+ multiple(a, b));
                break;
            case '/':
                System.out.println(a + " / "+ b + " = " + divide(a, b));
                break;
            default: 
                System.out.println("False");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int multiple(int a, int b) { 
        return a * b;
    }
}