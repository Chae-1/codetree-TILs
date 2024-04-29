import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class Main {
    static int[] arr;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Integer[] ic = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        Arrays.sort(ic);
        printArr(ic);

        Arrays.sort(ic, Collections.reverseOrder());
        printArr(ic);
    }

    public static <T> void printArr(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (i == arr.length - 1)     
                System.out.println();
        }
    }
}