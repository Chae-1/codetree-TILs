import java.util.*;
public class Main {
    static class BoomPassword {
        String passCode;
        String color;
        int sec;

        public BoomPassword(String passCode, String color, int sec) {
            this.passCode = passCode;
            this.color = color;
            this.sec = sec;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String passCode = sc.next();
        String color = sc.next();
        int sec = sc.nextInt();
        BoomPassword passcode = new BoomPassword(passCode, color, sec);
        System.out.println("code : "+ passcode.passCode);
        System.out.println("color : "+ passcode.color);
        System.out.println("second : "+ passcode.sec);
    }
}