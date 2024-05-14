import java.util.*;

public class Main {
    static int[] arr = new int[101];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // 100개의 숫자 모두 100인 경우
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int min = 1; min < 10001; min++) {
            // 칸막이로 구분을 하자
            int blind = 1;
            // 칸막이 안에 있는 숫자들의 합
            // 이 숫자들의 합이 min 이하 인지 확인한다.
            int tempSum = 0;
            for (int j = 0; j < n; j++) {
                // 구간 합이 min 일 수 있는 경우가 존재하지 않는다.
                if (arr[j] > min) {
                    break;
                }
                if (tempSum + arr[j] > min) {
                    blind++;
                    tempSum = arr[j];
                } else {
                    tempSum += arr[j];
                }
            }

            if (blind == m) {
                System.out.println(min);
                break;
            }
        }
    }
}