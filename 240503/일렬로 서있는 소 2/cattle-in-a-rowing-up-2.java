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

        System.out.println(preceedingThreeCow(arr, n));
    }

    private static int preceedingThreeCow(int[] arr, int n) {
        int count = 0; 
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] > arr[j])
                        continue;
                    if (arr[j] > arr[k])
                        continue;
                    count++;
                }
            }
        }
        return count;
    }
}