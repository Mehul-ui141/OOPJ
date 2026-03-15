// Use super in multilevel inheritance.
package lab5;
class M{
    void show() {
        System.out.println("Class M");
    }
}
class N extends M {
    void show(){
        super.show();
        System.out.println("Class N");
    }
}
class V extends N{
    void show(){
        super.show();
        System.out.println("Class V");
    }
}
public class p7{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        new V().show();
    }
}