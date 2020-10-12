public class Test {
    public static int recursion(double n) {
        if (n == 1) {
            System.out.println(n);
            return 1;
        }
        else if (n > 1 && n < 2) {
            System.out.println(n);
            return 0;
        }
        else {
            System.out.println(n);
            return recursion(n / 2);
        }
    }
    public static void main(String[] args) {
        double n = 16;
        if (recursion(n) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}