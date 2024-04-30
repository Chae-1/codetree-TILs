import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next(); // a진수로 표현된 수
        // a -> toDecimal..
        // decimal -> b 진수

        int decimal = 0;
        for (int i = 0; i < n.length(); i++) {
            decimal = decimal * a + (n.charAt(i) - '0');
        }

        int[] arr = new int[20];
        int cnt = 0;
        while (true) {
            if (decimal < b) {
                arr[cnt++] = decimal;
                break;
            }

            arr[cnt++] = decimal % b;
            decimal /= b;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

    }
}