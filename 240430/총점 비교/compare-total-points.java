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

        public int sum() {
            return kor + eng + math;
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
            int s1Sum = s1.sum();
            int s2Sum = s2.sum();
            return s1Sum - s2Sum;
        });
        
        for (Student s : students) {
            System.out.println(s);
        }
    }
}