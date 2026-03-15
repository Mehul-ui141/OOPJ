package home.assignment_9;
class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class p5 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha \n2405287n");
        try {
            throw new MyException("This is a custom error message");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}