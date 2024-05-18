import java.util.Arrays;
import java.util.Scanner;

/**
 * 신종 전염병이 퍼짐으로써 리브로스 독서실은 이용자들의 좌석 간의 거리를 두려고 합니다. 새로 한 명을 더 받으려고 하는데, 현재 있는 사람들은 원래 있던 자리에 그대로 두고 최대한 거리를 두면서 자리배치를
 * 해주려고 합니다. 여기서 거리라 함은, 두 사람이 몇 칸 떨어져 있는지를 의미합니다. 리브로스 독서실에 있는 모든 좌석의 개수가 N개이고, 현재 좌석의 공석 여부가 주어지면, 한 명의 인원을 배치한 후 최대한의
 * 거리두기를 실행한 간격을 출력하는 프로그램을 작성해보세요. 최대한의 거리두기를 한다는 것은, 한 명을 더 집어넣었을 때 가장 가까운 두 사람 간의 거리를 최대로 하고 싶다는 뜻입니다. 단, 양쪽 끝자리에는 항상
 * 사람이 앉아있는 상태로 주어짐을 가정해도 좋습니다.
 * <p>
 * 첫 번째 줄에 좌석의 개수 N이 주어집니다.
 * <p>
 * 두 번째 줄에 길이가 N이며 ‘0'과 ‘1’로만 이루어진 문자열이 하나 주어집니다. N개의 좌석 중 ‘0’인 곳은 비어있음을, '1’인 곳은 이미 차 있음을 뜻합니다.
 * <p>
 * 3 ≤ N ≤ 1,000
 */
public class Main {
    static int MAX_N = 1001;
    static int[] sits = new int[MAX_N];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sits = Arrays.stream(sc.next().split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        // 멀리 떨어져 있는 둘 사이에 인원을 배치한다.
        // 최대한 거리를 띄우면서 앉힌 후, 가장 가까운 사이의 거리를 구한다.
        posmid(n);
        int minDistanceWithTwo = calMinDistanceWithTwo(n);
        System.out.println(minDistanceWithTwo);
    }

    private static int calMinDistanceWithTwo(int n) {
        int minDist = Integer.MAX_VALUE;
        int prev = 0;
        for (int cur = 1; cur < n; cur++) {
            if (sits[cur] == 1) {
                if (sits[prev] == 1) {
                    minDist = Math.min(minDist, cur - prev);
                }
                prev = cur;
            }
        }
        return minDist;
    }

    private static void posmid(int n) {
        int maxDistanceWithTwo = 0, maxPos = 0;
        // 마지막으로 1이 등장한 위치
        int lastOnePos = 0;

        // i는 현재 위치
        for (int i = 1; i < n; i++) {
            // 1이 등장하는 위치에서 탐색한다.
            if (sits[i] == 1) {
                // 이전 위치도 만약 1 이었다면, 거리를 계산한다.
                if (sits[lastOnePos] == 1) {
                    // 만약, 거리가 최대라면 해당 위치를 기억하고, 그 길이를 기억한다.
                    if (i - lastOnePos > maxDistanceWithTwo) {

                        maxDistanceWithTwo = Math.max(maxDistanceWithTwo, i - lastOnePos);
                        maxPos = lastOnePos;
                    }
                    lastOnePos = i;
                }
            }
        }

        // 2. 1을 가운데에 둔다.
        // 최대한 거리를 두게 된다.
        int mid = ((maxPos) + (maxPos + maxDistanceWithTwo)) / 2;
        sits[mid] = 1;
    }
}