//Write a program to show incorrect behavior without using this and correct it.
package lab4;
public class p18 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        C_18 s1 = new C_18(101, "Rohan");
        s1.display();
    }
}
class C_18{
    int id;
    String name;
    C_18(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display() {
        System.out.println(id + " " + name);
    }
}