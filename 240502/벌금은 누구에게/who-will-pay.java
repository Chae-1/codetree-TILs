import java.util.*;
    public class Main {
        public static void main(String[] args) {
            // 여기에 코드를 작성해주세요.
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); // 학생의 명수
            int m = sc.nextInt();   
            int k = sc.nextInt();
            int[] arr = new int[n];
            int result = -1;
            
            // 선택된 학생은 벌칙을 받을 것이다.
            for (int i = 1; i <= m && result == -1; i++) {
                int pick = sc.nextInt();
                arr[pick-1]++;
                // 가장 처음 k번 벌칙을 받은 학생이라면, 이를 result에 담는다.
                if (arr[pick-1] >= k) {
                    result = pick;
                }
            }   

            System.out.println(result);

        }
    }