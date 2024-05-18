import java.util.Scanner;

public class Main {
    static char a[];

    private static int getMinDistBetweenTwo(int n) {
        int prev = 0;
        int dist = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (a[i] == '1') {
                if (a[prev] == '1') {
                    dist = Math.min(i - prev, dist);
                }
                prev = i;
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = sc.next().toCharArray();

        // 1. 1의 쌍의 거리가 가장 긴 위치를 찾자.
        int maxDistBetweenTwo = Integer.MIN_VALUE;
        int longI = 0;
        int longJ = 0;
        int lastOnePos = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == '1') {
                // 가장 가까운 1의 쌍을 찾는다.
                for (int j = i + 1; j < n; j++) {
                    if (a[j] == '1') {
                        // 쌍을 찾았다.
                        // 이 두 자리의 위치를 기억한다.
                        // 이전 거리보다 최대여야 한다.
                        int dist = j - i; // 거리
                        if (dist > maxDistBetweenTwo) {
                            longI = i;
                            longJ = j;
                            maxDistBetweenTwo = dist;
                        }
                        break;
                    }
                }
                // 가장 마지막에 등장한 1의 위치를 기억한다.
                lastOnePos = i;
            }
        }
        int mid = (longI + longJ) / 2;
        a[mid] = '1';
        int minDistBetweenTwo = getMinDistBetweenTwo(n);
        a[mid] = '0';
        
        // 마지막 위치가 0이라면, 그 자리에 1을 두고 비교한다.
        if (a[n - 1] == '0') {
            a[n - 1] = '1';
            minDistBetweenTwo = Math.max(minDistBetweenTwo, getMinDistBetweenTwo(n));
        }
        System.out.println(minDistBetweenTwo);
    }
}