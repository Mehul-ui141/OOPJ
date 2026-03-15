// Demonstrate accessing a hidden parent class variable using super.
package lab5;
class Parent1 {
    String name;
    int age;
    Parent1(String name,int age) {
        this.name=name;
        this.age=age;
    }
}
class Child1 extends Parent1 {
    Child1(String name,int age,int childAge) {
        super(name,age);
        System.out.println("Parent age " + age);
        System.out.println("Name: " + name);
        System.out.println("Age: " + childAge);
    }
}
public class p2{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        new Child1("Priya", 48, 18);
    }
}