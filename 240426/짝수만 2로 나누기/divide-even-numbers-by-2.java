import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        evenDivide(arr);
        printArr(arr);
    }

    public static void evenDivide(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                arr[i] = arr[i] / 2;  
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " "); 
        }
        System.out.print(arr[arr.length - 1]);
        
    }
}