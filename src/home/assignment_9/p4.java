package home.assignment_9;
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}
class AgeCheck {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Eligible to vote");
    }
}
public class p4 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha \n2405287\n");
        try {
            AgeCheck.checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}