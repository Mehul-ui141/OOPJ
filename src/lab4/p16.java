//Write a program showing how this improves code readability.
package lab4;
class Employee {
    int id;
    String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
public class p16 {
    public static void main(String[] args) {
        Employee e=new Employee(101, "Rahul");
        e.display();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}