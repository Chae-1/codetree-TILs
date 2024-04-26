import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.println(isLeapYear(y));
    }

    public static boolean isLeapYear(int y) {
        if (y % 4 != 0)
            return false;
        if (y % 100 == 0 && y % 400 != 0)
            return false;
        
        return true;
    }
}