import java.util.*;
public class Main {
    public static void main(String[] args) {
            // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String prefix = sc.next();
        String[] letters = new String[n];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = sc.next();
        }
        Arrays.sort(letters);
        int prefixStartIdx = -1;
        for (int i = 0; i < letters.length && prefixStartIdx == -1; i++) {
            if (letters[i].startsWith(prefix)) {
                prefixStartIdx = i;
            }
        }
        
        System.out.println(letters[prefixStartIdx + k - 1]);
        
    }
}