//Use this keyword inside constructor to avoid variable shadowing.
package lab4;
class Employee1 {
    int id;
    String name;
    Employee1(int id, String name) {
        this.id=id;
        this.name=name;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
public class p17 {
    public static void main(String[] args) {
        Employee1 e=new Employee1(101, "Rahul");
        e.display();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
