import java.util.*;

public class Main {
    static int[] arr = new int[5];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }


        // 능력치가 높은 한명이 팀을 이룬다.
        // 나머지 두명의 팀을 정한다.

        // 이 인덱스를 제외하고 팀을 구성하면 된다.
        int maxIndex = getMaxValueIndex();

        int diff = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (i == maxIndex || j == maxIndex)
                    continue;
                int team1 = arr[i] + arr[j];
                int team2 = totalSum() - team1 - arr[maxIndex];
                int team3 = arr[maxIndex];

                if (team1 != team2 && team2 != team3 && team1 != team3) {
                    if (diff == -1) {
                        diff = getDiff(team1, team2, team3);
                    } else {
                        diff = Math.min(diff, getDiff(team1, team2, team3));
                    }
                }
            }
        }
        System.out.println(diff);
    }

    private static int getMaxValueIndex() {
        int max = 0;
        for (int i = 1; i < 5; i++) {
            if (arr[max] < arr[i])
                max = i;
        }
        return max;
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