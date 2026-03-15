//Show method and variable name conflict resolution using super.
package lab5;
public class p9{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        B6 b = new B6();
        b.display();
    }
}
class A6{
    int num = 24;
    void display(){
        System.out.println("Class A6: num = " + num);
    }
}
class B6 extends A6{
    int num=67;
    void display(){
        System.out.println("Class B6: num = " + num);
        System.out.println("Class A6 from B6: num = " + super.num);
        super.display();
    }
}