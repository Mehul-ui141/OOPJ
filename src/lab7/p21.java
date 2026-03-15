// 21. Write a program that passes a message to a user-defined exception.
package lab7;
class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}
class something21 {
    static void show() throws MyException {
        throw new MyException("User-defined exception message");
    }
}
public class p21 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        try {
            something21.show();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}