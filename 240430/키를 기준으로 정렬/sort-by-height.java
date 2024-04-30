import java.util.*;

public class Main {
    static class Person implements Comparable<Person>{
        String name;
        int height;
        int weight;

        Person(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Person o1) {
            int result = this.height - o1.height; 
            if (result > 0) {
                return 1;
            } else if (result < 0) {
                return -1;
            }
            return 0;
        }

    }


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            persons[i] = new Person(name, height, weight);
        }
        Arrays.sort(persons);
        printPersons(persons);
    }

    public static void printPersons(Person[] persons) {
        for (Person p : persons) {
            System.out.println(p.name + " " + p.height + " " + p.weight);
        }
    }
}