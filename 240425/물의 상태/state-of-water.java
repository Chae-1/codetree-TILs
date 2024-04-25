import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 100) {
            System.out.println("vapor");
        } else if(n >= 0) {
            System.out.println("water");
        } else {
            System.out.println("ice");
        }
        
    }
}