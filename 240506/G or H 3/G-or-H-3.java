import java.util.*;
public class Main {
    static int[] arr = new int[10001];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // k는 구간
        int k = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int idx = sc.nextInt();
            char alpha = sc.next().charAt(0);

            arr[idx] = alpha == 'G' ? 1 : 2;
        }

        int max = 0;
        // 0 ~ 10 -> 
        for(int i = 0; i < arr.length - k; i++) {
            // i -> 시작 위치
            // 이 위치에서 k개를 선택해서 최대로 얻을 수 있는 점수의 합을 구한다.
            int sum = 0;
            for (int j = i; j <= i + k; j++) {
                sum += arr[j];
            }
            max = Math.max(sum, max);
        } 

        System.out.println(max);
    }
}