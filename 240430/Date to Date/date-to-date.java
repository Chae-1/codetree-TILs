import java.util.*;
public class Main {
    static int[] numOfDays = {0 , 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int totalDay = 0;
        // m1 ~ m2까지 몇일 걸리는지
        for (int i = m1; i < m2; i++) {
            totalDay += numOfDays[i];
        }
        totalDay = totalDay - d1 + 1;
        totalDay += d2;

        System.out.println(totalDay);
    }
}