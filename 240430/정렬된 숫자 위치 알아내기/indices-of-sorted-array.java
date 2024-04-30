import java.util.*;
public class Main {
    static class Num {
        int value;
        int index;

        Num(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Num[] arr = new Num[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = new Num(a, i);
        }

        Arrays.sort(arr, (n1, n2) -> n1.value - n2.value); // 정렬 이전, 이후의 위치를 출력하라.
        // 우리가 정렬하려는 값, 정렬 이전의 위치를 기억하고 있는 데이터가 있으면 된다. 

        // 원래 등록된 순서가 저장되어 있다.
        int[] prevPosition = new int[n];
        for (int i = 0; i < n; i++) {
            prevPosition[arr[i].index] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(prevPosition[i] + " ");
        }
    }
}