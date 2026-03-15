package home.assignment_7;
class S3 {
    int rollno;
    String name, course;
    float fee;
    S3(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }
    S3(int rollno, String name, String course, float fee) {
        this.fee = fee;
        // this(rollno, name, course);// C.T.Error
    }
}
public class p5{
    public static void main(String[] args) {
        S3 s1 = new S3(111, "ankit", "java");
        S3 s2 = new S3(112, "sumit", "java", 6000f);
    }
}
