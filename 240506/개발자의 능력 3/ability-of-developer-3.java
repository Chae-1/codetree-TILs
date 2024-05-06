import java.util.*;
public class Main {
    static int[] arr = new int[6];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    diff = Math.min(diff, getDiff(i, j, k));
                }
            }
        } 
        System.out.println(diff);
    }

    private static int getDiff(int i, int j, int k) {
        int totalSum = 0;
        for (int l = 0; l < 6; l++) {
            totalSum += arr[l];
        }

        int sum1 = arr[i] + arr[j] + arr[k];
        int sum2 = totalSum - sum1;
        return Math.abs(sum1 - sum2);
    }
}