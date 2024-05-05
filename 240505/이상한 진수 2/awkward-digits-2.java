import java.util.*;
public class Main {
    private static int binaryToDecimal(String a) {
        int result = 0;
        int base = 1;
        int length = a.length();
        for (int j = 0; j < length; j++) {
            int radix = a.charAt(length - j - 1) - '0';
            result += radix * base;
            base *= 2;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        for (int i = 0; i < a.length; i++) {
            // 앞에서 부터 탐색을 진행하고, 0이 등장하는 첫번째 위치를 탐색한다.
            // 해당 인덱스를 1로 전환시킨다.
            if (a[i] == '0') {
                a[i] = '1';
                break;
            }
        }

        System.out.println(binaryToDecimal(String.valueOf(a)));
    }
}