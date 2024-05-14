import java.util.Scanner;

public class Main {
    static int MAX_N = 101;
    static int[] arr = new int[MAX_N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minCost = Integer.MAX_VALUE;
        for (int base = 1; base < 10001; base++) {
            int max = base + k;
            int cost = 0;
            for (int i = 0; i < n; i++) {
                if (base > arr[i]) {
                    cost += Math.abs(arr[i] - base);
                }

                if (max < arr[i]) {
                    cost += Math.abs(max - arr[i]);
                }
            }
            minCost = Math.min(minCost, cost);
        }
        System.out.println(minCost);
    }
}