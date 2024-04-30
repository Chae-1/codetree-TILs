import java.util.*;
public class Main {
    static class Student {
        String name;
        int kor;
        int eng;
        int math;
        
        Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        @Override
        public String toString() {
            return name + " " + kor + " " + eng + " " + math; 
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            students[i] = new Student(name, kor, eng, math);
        }
        Arrays.sort(students, (s1, s2) -> {
            if (s1.kor != s2.kor) {
                return s2.kor - s1.kor;
            }

            if (s1.eng != s2.eng) {
                return s2.eng - s1.eng;
            }            
            return s2.math - s1.math;
        });
        for (Student s : students) {
            System.out.println(s);
        }
    }
}