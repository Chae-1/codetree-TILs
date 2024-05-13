import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = Arrays
                .stream(sc.next().split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        // 두자리를 선정해서 앉힌 다음 가장 가까운 두사람의 거리의 최댓값을 구한다.
        int maxDistance = 0;
        // 한자리 선정
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
                // 이후 자리 선정
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == 0) {
                        arr[j] = 1;
                        // 앉아 있는 사람들의 거리 중 가까운 거리
                        maxDistance = Math.max(maxDistance, getMinDist());
                        arr[j] = 0;
                    }
                }
                arr[i] = 0;
            }
        }
        System.out.println(maxDistance);
    }

    // 1. 앉아 있는 사람들 중 위치에서 가장 가까운 사람을 찾는다.
    private static int getMinDist() {
        int length = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            // i 자리에 앉아 있다면 이후 위치에서 가까운 위치에 앉은 사람 한명을 찾는다.
            if (arr[i] == 1) {
                for (int j = i + 1; j < length; j++) {
                    if (arr[j] == 1) {
                        min = Math.min(min, j - i);
                        break;
                    }
                }
            }
        }
        return min;
    }

}