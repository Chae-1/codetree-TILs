import java.util.*;

public class Main {
    static class Product {
        int code;
        String name;

        public Product(int code, String name) {
            this.code = code;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int code = sc.nextInt();
        Product codetree = new Product(50, "codetree");
        Product product = new Product(code, name);

        System.out.println("product " + codetree.code + " is " + codetree.name);
        System.out.println("product " + product.code + " is " + product.name);
    }
}