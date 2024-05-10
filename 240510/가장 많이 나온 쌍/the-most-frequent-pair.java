import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Pair[] pairs = new Pair[101];

    static class Pair {
        int a;
        int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {

            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return (a == pair.a && b == pair.b) || (a == pair.b && b == pair.a);
        }

        @Override
        public int hashCode() {
            return Objects.hash(a + b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            pairs[i] = new Pair(sc.nextInt(), sc.nextInt());
        }


        long count = Arrays.stream(pairs)
                .distinct()
                .count();
        System.out.println(m - count);
    }
}