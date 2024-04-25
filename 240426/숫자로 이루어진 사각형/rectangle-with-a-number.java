import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printConsistNumRect(n);    
    }

    public static void printConsistNumRect(int n) {
        int start = 1;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(start + " ");
                start = start == 9 ? 1 : start + 1;
            }
            System.out.println();
        }
    } 
}