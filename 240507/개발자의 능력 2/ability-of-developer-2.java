import java.util.*;
public class Main {
    static int[] arr = new int[6];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        // 능력치를 정렬해준다.
        Arrays.sort(arr);
        // 가장 능력치가 작은 개발자와 능력치가 가장 큰 개발자를 붙여준다.
        int team1 = arr[0] + arr[5];
        int team2 = arr[1] + arr[4];
        int diff = getDiff(team1, team2);
        System.out.println(diff);
    }

    private static int getDiff(int team1, int team2) {
        int totalSum = 0;
        for (int i = 0; i < 6; i++) {
            totalSum += arr[i];
        }

        int team3 = totalSum - team1 - team2;
        int max = Math.max(team1, Math.max(team2, team3));
        int min = Math.min(team1, Math.min(team2, team3));
        return max - min;
    }
}