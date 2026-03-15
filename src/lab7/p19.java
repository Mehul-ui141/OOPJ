// 19. Create a custom checked exception and use it in a validation program.
package lab7;
class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}
class something19 {
    static void validate(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("Not eligible to vote");
        else
            System.out.println("Eligible to vote");
    }
}
public class p19 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        try {
            something19.validate(16);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}