import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();    
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(sumTillOne(arr, n, m));
    }

    public static int sumTillOne(int[] arr, int n, int m) {
        int sum = 0;
        while (m != 1) {
            sum += arr[m - 1];// 4 // 2 // 1 
            if (m % 2 == 1) {
                m -= 1;
            } else if (m % 2 == 0) {
                m /= 2;
            }
        }
        sum += arr[0];
        return sum;
    }
}