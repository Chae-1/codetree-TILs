import java.util.*;
public class Main {
    static class Member {
        String name;
        String addr;
        String city;

        public Member(String name, String addr, String city) {
            this.name = name;
            this.addr = addr;
            this.city = city;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Member[] members = new Member[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String addr = sc.next();
            String city = sc.next();
            members[i] = new Member(name, addr, city);;
        }

        Arrays.sort(members, Comparator.comparing(m -> m.name));
        System.out.println("name " + members[n-1].name);
        System.out.println("addr " + members[n-1].addr);
        System.out.println("city " + members[n-1].city);
    }
}