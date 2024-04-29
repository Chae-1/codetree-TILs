import java.util.*;
public class Main {
        public static void main(String[] args) {
            // 여기에 코드를 작성해주세요.
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(nMcm(arr, 0));
        }

        public static int gcd(int a, int b) {
            if(b == 0)
                return a;
            return gcd(b, a % b);
        }

        public static int mcn(int n, int m) {
            int gcd = gcd(n, m);
            
            return n * m / gcd;
        }
        
        public static int nMcm(int[] arr, int current) {
            if (current == arr.length - 1) {
                return arr[current];
            }
            return mcn(arr[current], nMcm(arr, current + 1));
        }
}