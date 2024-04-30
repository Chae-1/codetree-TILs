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
        int n = sc.nextInt();
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            persons[i] = new Person(name, height, weight);
        }

        Arrays.sort(persons, (p1, p2) ->{
            if (p2.height == p1.height) {
                return (int)((p2.weight - p1.weight) * 100);
            }
            return p1.height - p2.height;
        });
        printPersons(persons);

    }

    public static void printPersons(Person[] persons) {
        for (Person p : persons) {
            System.out.println(p.name +" " + p.height + " " + (int)p.weight);
        }
        System.out.println();
    }
}