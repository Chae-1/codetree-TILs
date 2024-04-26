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

    public static boolean isExistDayIn2021(int m, int n) {
        // m이 유효한지 확인
        // m은 1부터 12까지 유효
        if (!validateMonth(m)) {
            return false;
        }

        if (!validateDayInMonth(m, n)) {
            return false;
        }

        return true;
    }

    public static boolean validateMonth(int m) {
        if (m > 12)
            return false;
        return true;
    }

    public static boolean validateDayInMonth(int m, int n) {
        if (n > 31)
            return false;

        if (m == 2 && n > 28) {
            return false;
        }

        if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (n > 30)
                return false;
        }
        return true;
    }   
}