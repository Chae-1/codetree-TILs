import java.util.*;

public class Main {
    static int[] arr = new int[5];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int diff = -1; // -1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // i, j가 한팀, k, l이 한팀
                // 중복을 허용하지 않고 모든 조합에 대해서 확인
                for (int k = 0; j < 5; j++) {
                    for (int l = 0; l < 5; l++) {
                        if (i != k && j != l && i != l && j != k) {
                            int team1 = arr[i] + arr[j];
                            int team2 = arr[k] + arr[l];
                            int team3 = totalSum() - team1 - team2;
                            if (team1 != team2 && team2 != team3 && team1 != team3) {
                                if (diff == -1) {
                                    diff = getDiff(team1, team2, team3);
                                } else {
                                    diff = Math.min(getDiff(team1, team2, team3), diff);
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(diff);
    }

    private static int getDiff(int team1, int team2, int team3) {
        int min = Math.min(Math.min(team1, team2), team3);
        int max = Math.max(Math.max(team1, team2), team3);
        return max - min;
    }

    private static int totalSum() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}