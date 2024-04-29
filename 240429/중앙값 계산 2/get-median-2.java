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

        for (int i = 0; i < n; i += 2) {
            // 0 ~ i까지의 배열 원소 중에서 중앙 값을 구한다.
            int[] iClosed = Arrays.copyOfRange(arr, 0, i + 1);
            Arrays.sort(iClosed);
            int mid = i / 2;
            System.out.print(iClosed[mid] + " ");
        }
    }
}