import java.util.*;
public class Main {
        public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        if (validateDay(year, month, day)) {
            printSeason(month);
        } else {
            System.out.println(-1);
        }
    }

    private static boolean validateDay(int year, int month, int day) {
        // 2월일 때만, 윤년인지 아닌지 판별
        if (month == 2) {
            if (!isLeafYear(year)) {
                return day <= 29;
            }
            return day <= 28;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        }

        return day <= 31;
    }

    private static boolean isLeafYear(int year) {
        boolean multipleFour = year % 4 == 0;
        boolean multipleHundred = year % 100 == 0;
        boolean multipleFourHundred = year % 400 == 0;

        if (!multipleFour)
            return false;

        if (multipleFour && multipleFourHundred && multipleHundred)
            return true;

        if (multipleFour && multipleHundred)
            return false;

        return false;
    }

    public static void printSeason(int m) {
        if (m >= 3 && m <= 5) {
            System.out.println("Spring");
        } else if (m >= 6 && m <= 8) {
            System.out.println("Summer");
        } else if (m >= 9 && m <= 11) {
            System.out.println("Fall");
        } else {
            System.out.println("Winter");
        }
    }

}