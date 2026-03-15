//Write a program demonstrating use of this to distinguish instance variables from parameters.
package lab4;
class Stu {
    int roll;
    String name;
    Stu(int roll, String name) {
        this.roll=roll;
        this.name=name;
    }
    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}
public class p11 {
    public static void main(String[] args) {
        Stu s1=new Stu(287, "Mehul");
        s1.display();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}