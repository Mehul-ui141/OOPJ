package home.assignment_9;
class MyExceptions extends Exception {
    MyExceptions(String msg) {
        super(msg);
    }
}
public class p9 {
    public static void main(String[] args) {
        System.out.println("MEhul Jha\n2405287\n");

        try {
            int a = 10 / 0;
            throw new MyExceptions("Custom Exception");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception handled");
        }
        catch (MyExceptions e) {
            System.out.println(e.getMessage());
        }
    }
}