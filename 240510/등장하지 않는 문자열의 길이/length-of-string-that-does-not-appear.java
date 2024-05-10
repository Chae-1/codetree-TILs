import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int minLen = 0;
        //시작 위치 인덱스가 무조건 0일때
        for (int i = 1; i <= n; i++) {
            String substring = s.substring(0, i);
            int matchCount = 0;
            for (int j = i; j <= n - i; j++) {
                String compString = s.substring(j, j + i);
                if (substring.equals(compString)) {
                    matchCount++;
                }
            }

            if (matchCount == 0) {
                minLen = i;
                break;
            }
        }
        System.out.println(minLen);
    }
}