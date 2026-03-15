//Write a program to pass current object as method argument using this.
package lab4;
class Stu2 {
    int roll;
    Stu2(int roll){
        this.roll=roll;
    }
    void show(Stu2 s){
        System.out.println("Roll: " + s.roll);
    }
    void display() {
        show(this);
    }
}
public class p14 {
    public static void main(String[] args) {
        Stu2 s1=new Stu2(287);
        s1.display();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}