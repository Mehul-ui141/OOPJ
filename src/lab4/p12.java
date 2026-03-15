//Use this() to call another constructor within the same class.
package lab4;
class Stu1{
    int roll;
    String name;
    Stu1() {
        this(287, "Mehul");
    }
    Stu1(int roll, String name) {
        this.roll=roll;
        this.name=name;
    }
    void display(){
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}
public class p12 {
    public static void main(String[] args) {
        Stu1 s=new Stu1();
        s.display();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
