import java.util.*;
public class Main {
    static int[] arr;
    static int n;
    static int k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        arr = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // 경로상 가능한 최댓값이 최소가 되도록 한다.
        int curMin = 0;
        // max ~ arr[0] 까지 최댓값이 최소가 될 수 있다.
        for (int availableMax = max; availableMax >= arr[0]; availableMax--) {
            if (canMove(availableMax)) {
                curMin = availableMax;
            }
        }
        System.out.println(curMin);
    }

    private static boolean canMove(int availableMax) {

        int size = arr.length;
        int[] availableBlock = new int[size];
        int cnt = 0;
        for (int i = 0; i < size; i++) {
            // 지정한 경로상의 최댓값보다 크거나 같으면 해당 경로를 지나갈 수 있다.
            // 해당 경로의 위치를 저장한다.
            if (arr[i] <= availableMax) {
                availableBlock[cnt++] = i;
            }
        }

        for (int i = 1; i < cnt; i++) {
            // 이전 위치와 현재 위치를 비교해서 거리가 k 초과한다면
            // 불가능한 위치
            if (availableBlock[i] - availableBlock[i - 1] > k) {
                return false;
            }
        }
        return true;
    }
}