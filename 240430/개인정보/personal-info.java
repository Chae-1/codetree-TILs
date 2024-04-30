import java.util.*;
public class Main {
    static class Person {
        String name;
        int height;
        double weight;

        Person(String name, int height, double weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Person[] persons = new Person[5];
        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            persons[i] = new Person(name, height, weight);
        }
        Arrays.sort(persons, (s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("name");
        printPersons(persons);

        Arrays.sort(persons, (p1, p2) -> p2.height - p1.height);
        System.out.println("height");
        printPersons(persons);
    }

    public static void printPersons(Person[] persons) {
        for (Person p : persons) {
            System.out.println(p.name +" " + p.height + " " + p.weight);
        }
        System.out.println();
    }
}