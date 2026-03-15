package home.assignment_9;
class MyExcept extends Exception {
    MyExcept(String msg) {
        super(msg);
    }
}
class Test {
    static void demo() throws MyExcept {
        throw new MyExcept("Error occurred");
    }
}
public class p7 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha \n2405287\n");
        try {
            Test.demo();
        } catch (MyExcept e) {
            System.out.println(e.getMessage());
        }
    }
}