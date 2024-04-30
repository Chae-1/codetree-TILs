import java.util.*;
public class Main {
    
    static class Student {
        int h;
        int w;
        int no;

        Student(int h, int w, int no) {
            this.h = h;
            this.w = w;
            this.no = no;
        }
     }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        int[] toindex = new int[n];
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            students[i] = new Student(h, w, i + 1);
        }
        Arrays.sort(students, (s1, s2) -> {
            if (s1.h == s2.h) {
                return s2.w - s2.w;
            }
            return s2.h - s1.h;
        });

        for (Student s : students) {
            System.out.println(s.h + " " + s.w + " " + s.no);
        }    
    }
}