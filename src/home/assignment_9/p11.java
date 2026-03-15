package home.assignment_9;
class SubjectLimitException extends Exception {
    SubjectLimitException(String msg) {
        super(msg);
    }
}
class University {
    static void registerSubjects(int count) throws SubjectLimitException {
        if (count > 6) {
            throw new SubjectLimitException(
                    "Cannot register for more than 6 subjects"
            );
        }
        System.out.println("Subjects registered successfully");
    }
}
public class p11 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha \n2405287");

        try {
            University.registerSubjects(8);
        } catch (SubjectLimitException e) {
            System.out.println(e.getMessage());
        }
    }
}