import java.util.Scanner;
public class Main {
    static int MAX_N = 101;
    static int BOOM_COUNT = 1000000;
    static int[] booms = new int[MAX_N];
    static boolean[] explode = new boolean[MAX_N];
    static int[] boomNum = new int[BOOM_COUNT];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            booms[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            // 연쇄적으로 터진 폭탄의 횟수를 카운트 할 수 있다.
            for (int j = i + 1; j < n; j++) {
                // 거리가 k 이상이 되는 경우 바로 빠져나간다.
                if (j - i > k)
                    break;
                // i, j가 k거리 안에 있으면 같은 폭탄이 아니면
                if (booms[i] != booms[j]) {
                    continue;
                }

                // i번째 폭탄이 터질 수 있으면
                // 해당 폭탄 번호의 터짓 횟수를 증가시킨다.
                if (explode[i] == false) {
                    boomNum[booms[i]]++;
                    explode[i] = true;
                }

                // j번째 폭탄이 터질 수 있으면
                // 해당 폭탄 번호의 터진 횟수를 증가시킨다.
                if (explode[j] == false) {
                    boomNum[booms[j]]++;
                    explode[j] = true;
                }
            }
        }

        // boomCount가 가장 큰 숫자를 선택한다.
        int maxIdx = 0;
        int maxValue = booms[maxIdx];
        for (int i = 1; i < BOOM_COUNT; i++) {
            // 터진 횟수가 크거나 같으면
            // 갱신한다.
            if (boomNum[i] >= maxValue) {
                maxIdx = i;
                maxValue = boomNum[i];
            }
        }
        System.out.println(maxIdx);
    }
}