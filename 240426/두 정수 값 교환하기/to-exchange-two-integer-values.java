import java.util.*;
public class Main {
    static class IntHolder {
        int value;

        public IntHolder(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntHolder a = new IntHolder(sc.nextInt());
        IntHolder b = new IntHolder(sc.nextInt());
        swap(a, b);
        System.out.println(a.value + " " + b.value);
    }

    public static void swap(IntHolder a, IntHolder b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}