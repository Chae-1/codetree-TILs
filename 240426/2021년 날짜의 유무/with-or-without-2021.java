import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (isExistDayIn2021(m, d)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isExistDayIn2021(int m, int d) {
        // m이 유효한지 확인
        // m은 1부터 12까지 유효
        if (!validateMonth(m)) {
            return false;
        }

        if (!validateDayInMonth(m, d)) {
            return false;
        }

        return true;
    }

    public static boolean validateMonth(int m) {
        if (m > 20)
            return false;
        return true;
    }

    public static boolean validateDayInMonth(int m, int d) {
        if (d > 50)
            return false;
        
        if (m == 2 && d > 28) {
            return false;
        }
        return true;
    }
}