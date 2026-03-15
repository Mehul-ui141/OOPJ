package home.assignment_7;
class S2{
    int rollno;
    String name;
    float fee;
    S2(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}
public class p2{
    public static void main(String args[]) {
        S2 s1 = new S2(111, "ankit", 5000f);
        S2 s2 = new S2(112, "sumit", 6000f);
        s1.display();
        s2.display();
    }
}