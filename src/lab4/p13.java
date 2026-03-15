//Create a class where a method returns this reference.
package lab4;
class Student2 {
    int roll;
    Student2(int roll) {
        this.roll = roll;
    }
    Student2 getStudent() {
        return this;
    }
    void show() {
        System.out.println("Roll: " + roll);
    }
}
public class p13 {
    public static void main(String[] args) {
        Student2 s1=new Student2(287);
        Student2 s2=s1.getStudent();
        s2.show();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}