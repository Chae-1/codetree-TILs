import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sequence(n));
    }

    public static int sequence(int n) {
        if (n == 1)
            return 2;
        if (n == 2)
            return 4;
        
        return (sequence(n - 1) * sequence(n - 2)) % 100; 
    }
}