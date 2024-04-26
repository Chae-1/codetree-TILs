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
        addOrMutiple(aHolder, bHolder);
        System.out.println(aHolder.value + " " + bHolder.value);
    }

    public static void addOrMutiple(IntHolder a, IntHolder b) {
        if (a.value > b.value) {
            a.value += 25;
            b.value *= 2;
        } else {
            b.value += 25;
            a.value *= 2;
        }
    }
}