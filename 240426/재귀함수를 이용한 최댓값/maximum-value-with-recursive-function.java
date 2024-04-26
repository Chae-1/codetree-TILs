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
        System.out.println(max(arr, 0));
    }

    public static int max(int[] arr, int index) {
        if (arr.length == index)
            return 0;
        
        return Math.max(arr[index], max(arr, index + 1));
    }
}