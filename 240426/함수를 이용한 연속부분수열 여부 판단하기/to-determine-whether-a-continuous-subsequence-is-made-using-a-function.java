import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] a = makeArr(sc, n1);
        int[] b = makeArr(sc, n2);
        if (isSubSequence(a, b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static int[] makeArr(Scanner sc, int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static boolean isSubSequence(int[] sequence, int[] subsequence) {
        int left = 0;
        int sequenceLength = sequence.length;
        while (left < sequenceLength) {
            int count = 0;
            for (int i = 0; i < subsequence.length; i++) {
                if (sequence[left + i] != subsequence[i]) {
                    break;
                }
                count++;
            }

            if (count == subsequence.length)
                return true;

            left++;
        }
        return true;
            
    }
}