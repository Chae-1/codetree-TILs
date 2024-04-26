import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(mcm(n, m));
    }

    public static int mcm(int n, int m) {
        int maximumMultiple = n * m;
        int max = Math.max(n, m); // 18
        int min = Math.min(n, m); // 12
        
        int start = min; // 12
        int i = 1; 
        while (start < maximumMultiple) {
            if (start < max) {
                start = min * ++i;
            }

            if (start % max == 0 && start % min == 0) {
                return start;
            }
            
            start = min * ++i;
        }

        return maximumMultiple;
    }
}