import java.util.*;
public class Main {

    static class IntHolder {
        int value;

        IntHolder(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        IntHolder aHolder = new IntHolder(a);
        IntHolder bHolder = new IntHolder(b);
        lessNumPlusTwentyAndGraterNumMultiple(aHolder, bHolder);

        System.out.println(aHolder.value + " " +bHolder.value);
    }

    public static void lessNumPlusTwentyAndGraterNumMultiple(IntHolder aHolder, IntHolder bHolder) {
        if (aHloder.value > bHloder.value) {
            aHolder.value += 10;
            bHolder.value *= 2;
            return;
        }
        
        aHolder.value *= 2;
        bHolder.value += 10;
    }
}