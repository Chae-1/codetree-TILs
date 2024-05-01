import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }

        int maxCount = 1;
        int count = 1;
        // 부분 수열은 무조건 하나의 원소는 가지고 있을 것이다.
        // 인덱스 1부터 시작한다. 그렇기 때문에 count가 1임은 보장한다.
        for (int i = 1; i < n; i++) {
            if (sequence[i - 1] != sequence[i]) {
                if (maxCount < count)
                    maxCount = count;
                count = 1;
                continue;
            }
            count++;
        }
        System.out.println(maxCount);
    }
}