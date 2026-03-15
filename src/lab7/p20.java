// 20. Create a custom unchecked exception for insufficient balance.
package lab7;
class InsufficientBalanceException extends RuntimeException {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}
class something20 {
    static void withdraw(int balance, int amount) {
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient balance");
        System.out.println("Withdrawal successful");
    }
}
public class p20 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        something20.withdraw(5000, 7000);
    }
}