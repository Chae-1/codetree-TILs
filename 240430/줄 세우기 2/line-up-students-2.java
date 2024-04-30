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

        public String toString() {
            return h + " " + w + " " + no;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < students.length; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            students[i] = new Student(h, w, i + 1);
        }

        Arrays.sort(students, (s1, s2) -> {
            if (s1.h == s2.h) {
                return s2.w - s1.w;
            }
            return s1.h - s2.h;
        });

        for (Student s : students) {
            System.out.println(s);
        }

    }
}