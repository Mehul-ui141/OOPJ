package home.assignment;
class methodOver {
    void display() {
        System.out.println("no arguments");
    }
    void display(int a) {
        System.out.println("Display one integer: " + a);
    }
    void display(int a, String name) {
        System.out.println("Display roll no and name");
        System.out.println("a = " + a + ", name = " + name);
    }
}
public class p10 {
    public static void main(String[] args) {
        methodOver obj=new methodOver();
        obj.display();
        obj.display(2405287);
        obj.display(2405287, "Mehul Jha");
    }
}