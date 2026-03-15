// Demonstrate default and static methods in interfaces.
package lab6;
public class p17 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Account a = new Account();
        a.check();
        Banks.info();
    }
}
interface Banks{
    default void check() {
        System.out.println("Account checked");
    }
    static void info() {
        System.out.println("Bank info");
    }
}
class Account implements Banks {
}