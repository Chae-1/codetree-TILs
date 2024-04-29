import java.util.*;
public class Main {
        static class User {
        String id;
        int level;

        public User(String id, int level) {
            this.id = id;
            this.level = level;
        }

        @Override
        public String toString() {
            return "user " + id + " " + "lv " + level; 
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        User codetree = new User("codetree", 10);
        User user = new User(id, level);
        System.out.println(codetree);
        System.out.println(user);
    }
}