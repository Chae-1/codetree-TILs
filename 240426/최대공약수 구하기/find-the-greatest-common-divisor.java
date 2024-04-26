public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(gcd(n, m));
    }

    public static int gcd(int a, int b) {
        int max = 1;
        int select = a > b ? b : a;
        
        for (int i = 2; i <= select; i++) {
            if (a % i == 0 && b % i == 0) {
                max = i;
            }
        }
        return max;
    }
}