import java.util.*;
public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        fillContents(A);
        fillContents(B);
        if (isSameSequence(A, B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isSameSequence(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i])
                return false;
        }
        return true;
    }

    public static void fillContents(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();    
        }
    }
}