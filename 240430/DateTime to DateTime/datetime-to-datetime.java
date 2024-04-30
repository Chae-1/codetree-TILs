import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int startDay = 11;
        int startHour = 11;
        int startMin = 11;

        int a = sc.nextInt(); // 일
        int b = sc.nextInt(); // 시
        int c = sc.nextInt(); // 분

        int result = (a - startDay) * 1440 + (b - startHour) * 60 + (c - startMin);
        System.out.println(result);
    }
}