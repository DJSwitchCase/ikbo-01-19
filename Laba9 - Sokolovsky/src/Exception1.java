public class Exception1 {
    public static void exceptionDemo() {
        try {
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("На ноль делишь, старина");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}