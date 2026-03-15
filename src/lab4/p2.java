//Write a Java program using a parameterized constructor
// to initialize student details (roll, name, marks).
package lab4;
class Student1{
    int roll;
    String name;
    Student1(int r, String n){
        roll=r;
        name=n;
    }
    void display(){
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}
public class p2{
    public static void main(String args[]){
        Student1 s=new Student1(287,"Mehul");
        s.display();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
