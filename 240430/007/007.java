import java.util.*;
public class Main {
    static class Secret {
        String secretCode;
        String meetingPoint;
        int time;

        Secret(String secretCode, String meetingPoint, int time) {
            this.secretCode = secretCode;
            this.meetingPoint = meetingPoint;
            this.time = time;
        }    
    }
    

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String secretCode = sc.next();
        String address = sc.next();
        int time = sc.nextInt();
        Secret secret = new Secret(secretCode, address, time);
        System.out.println("secret code : " + secret.secretCode);
        System.out.println("meeting point : " + secret.meetingPoint);
        System.out.println("time : " + secret.time);

    }
}