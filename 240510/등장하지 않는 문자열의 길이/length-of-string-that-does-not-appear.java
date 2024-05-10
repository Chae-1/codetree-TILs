import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int minLen = 0;
        // 부분 문자열의 길이 1 ~ n
        for (int i = 1; i <= n; i++) {
            boolean anyMatch = false;

            // 시작 위치를 지정
            for (int start = 0; start <= n - i; start++) {
                // 시작 위치에서 시작하는 부분 문자열
                String substring = s.substring(start, start + i);
                // 부분 문자열의 마지막 인덱스부터 확인한다.
                for (int j = start + i; j <= n - i; j++) {
                    String matchString = s.substring(j, j + i);
                    if (substring.equals(matchString)) {
                        anyMatch = true;
                    }
                }
            }
            // 단 하나도 매칭되지 않았다면
            // 최소 길이가 i
            if (!anyMatch) {
                minLen = i;
                break;
            }
        }
        System.out.println(minLen);
    }
}