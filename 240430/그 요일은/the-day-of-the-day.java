import java.util.*;
public class Main {

    static int[] numsOfDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    
    private static int getDays(int m, int n) {
        int totalDay = 0;
        for (int i = 1; i < m; i++) {
            totalDay += numsOfDays[i];
        }  
        return totalDay + n;
    }

    private static int dayIndex(String day) {
        for (int i = 0; i < 7; i++) {
            if (day.equals(days[i])) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        // 1. 지나간 절대적인 날을 구한다.
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int baseDays = getDays(m1, d1);
        
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int targetDays = getDays(m2, d2);

        String day = sc.next();
        int dayIdx = dayIndex(day);
        int diff = targetDays - baseDays;
        
        // 차이를 7로 나누면 몇 주가 지났는지 알 수있다.
        // 주가 하나 지나면 모든 요일을 한 번씩 지나갔다는 것이다.
        // A요일은 반드시 diff 만큼은 지나갔다는 것을 의미한다.
        int count = diff / 7;
        
        // 차이를 mod 7 연산을 하면 몇 일이 지났는지 알 수있다.
        // A요일이 몇일차에 있는지 계산한 다음
        // mod 연산한 값 보다 작다면, A요일을 한번더 지난것이다.
        if (diff % 7 >= dayIdx) {
            count++;
        }
        System.out.println(count);       
    }
}