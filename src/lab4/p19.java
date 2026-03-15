//Write a Java program to demonstrate single inheritance using Person and Stud.
package lab4;
class Person {
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Stud extends Person {
    int roll;
    Stud(String name,int age,int roll){
        super(name,age);
        this.roll=roll;
    }
    void displayStudent(){
        displayPerson();
        System.out.println("Roll: "+roll);
    }
}
public class p19 {
    public static void main(String[] args){
        Stud s=new Stud("Amit",20,623);
        s.displayStudent();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
