import java.util.*;
public class Main {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        // 숫자 두 개를 제외하고 s와의 차의 절대 값이 가장 작은 수를 선택한다.
        int closed = closedSumExceptTwoNumber(s, sum, arr);
        System.out.println(closed - s);
    }

    private static int closedSumExceptTwoNumber(int target, int sum, int[] arr) {

        int result = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // i, j 번째 수를 제외하고 더했을 때 target과 가장 가까운 수를 구한다.
                // 두 수를 뺐을 때 차이가 가장 적은 수
                int temp = sum - arr[i] - arr[j];
                int curDiff = Math.abs(target - temp);
                if (diff > curDiff) {
                    result = temp;
                    diff = curDiff;
                }
            }
        }
        return result;
    }
}