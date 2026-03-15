//Distinguish between this and super through a program.package lab5;
package lab5;
class A{
    String x="Naman";
    void show(){
        System.out.println("A");
    }
}
class B extends A{
    int x= 20;
    void show(){
        System.out.println("B");
    }
    void test() {
        System.out.println(this.x);
        System.out.println(super.x);
        this.show();
        super.show();
    }
}
public class p10{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        new B().test();
    }
}
