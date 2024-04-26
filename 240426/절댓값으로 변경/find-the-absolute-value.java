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
        changeAbs(arr);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
        }
        System.out.println(arr[arr.length -1]);
    }

    public static void changeAbs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                arr[i] = arr[i] * -1;
        }
    }
}