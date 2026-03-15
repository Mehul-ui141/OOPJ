//Demonstrate runtime polymorphism in multilevel inheritance.
package lab5;
class Person{
    void role(){
        System.out.println("Person role");
    }
}
class Employ1 extends Person{
    void role(){
        System.out.println("Employ1 role");
    }
}
class Manager extends Employ1 {
    void role(){
        System.out.println("Manager role");
    }
    public static void main(String[] args) {
        Person p = new Manager();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        p.role();
    }
}