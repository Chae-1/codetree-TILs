import java.util.Scanner;

public class Main {
    static int MAX_N = 101;
    static int[] booms = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            booms[i] = sc.nextInt();
        }

        int maxBoomNum = 0;
        int maxBoomCount = 0;
        // 폭탄의 번호
        for (int boom = 0; boom < 1_000_001; boom++) {
            int curMaxCount = 0;
            for (int j = 0; j < n; j++) {
                // 현재 확인하고자 하는 폭탄을 만났을 때
                if (booms[j] == boom) {
                    int prev = j;
                    int cur = j;
                    // k 거리 안에 있는 동일한 폭탄을 탐색
                    int boomCount = 0;
                    while (cur <= prev + k) {
                        // 현재 탐색 위치의 폭탄 번호가 이전 폭탄 번호와 동일한 경우
                        if (booms[cur] == boom) {
                            prev = cur;
                            boomCount++;
                        }
                        cur++;
                    }
                    j = cur - 1;
                    // 확인한 범위에서 폭탄이 많이 터졌다면, 갱신
                    // 이전 범위가 더 많이 터졌다면, 유지
                    curMaxCount = Math.max(curMaxCount, boomCount);
                }
            }

            if (maxBoomCount < curMaxCount) {
                maxBoomCount = curMaxCount;
                maxBoomNum = boom;
            }

        }
        System.out.println(maxBoomNum);
    }
}