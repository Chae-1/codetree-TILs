import java.util.*;
public class Main {
    static String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    static int[] numOfDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int today = 0;
        for (int i = 1; i < m1; i++) {
            today += numOfDays[i];
        }
        today += d1;
        // m1, d1은 월요일
        // m1, d1의 인덱스가 1이 나온다
        // 같은 요일은 7일마다 존재한다.
        // m1 d1 월요일
        // today가 월요일
        // startToTday는 몇요일?


        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int startToToday = 0;
        for (int i = 1; i < m2; i++) {
            startToToday += numOfDays[i];
        }
        startToToday += d2;

        startToToday -= today;
        startToToday = startToToday % 7;
        System.out.println(days[startToToday < 0 ? startToToday + 7 : startToToday]);
    }
}