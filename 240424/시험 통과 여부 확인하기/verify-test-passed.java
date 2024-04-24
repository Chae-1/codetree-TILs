import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int passScore = 80;
        if (n >= passScore) {
            Sysetm.out.println("pass");
        } else {
            System.out.println(passScore - n + " more score");
        }
     }
}