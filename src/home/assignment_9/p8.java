package home.assignment_9;
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}
class Bank {
    double balance = 5000;
    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful");
    }
}
public class p8 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha \n2405287\n");
        Bank b = new Bank();
        try {
            b.withdraw(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}