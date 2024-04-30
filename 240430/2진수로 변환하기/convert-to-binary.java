import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[20];
        int count = 0;
        while (n != 0) {
            int current = n % 2;
            arr[count++] = current;
            n /= 2;
        }

        String result = "";
        for (int i = count - 1; i >= 0; i--) {
            result += arr[i];
        }

        if (n != 0) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}