package home.assignment_9;
class CheckedEx extends Exception {
    CheckedEx(String msg) {
        super(msg);
    }
}
class UncheckedEx extends RuntimeException {
    UncheckedEx(String msg) {
        super(msg);
    }
}
class Demo {
    static void checkedMethod() throws CheckedEx {
        throw new CheckedEx("Checked Exception occurred");
    }
    static void uncheckedMethod() {
        throw new UncheckedEx("Unchecked Exception occurred");
    }
}
public class p6 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha \n2405287\n");
        try {
            Demo.checkedMethod();
        } catch (CheckedEx e) {
            System.out.println(e.getMessage());
        }
        Demo.uncheckedMethod();
    }
}