//10.Show how abstract classes help avoid code duplication using inheritance.
package lab6;
abstract class A5{
    void h(){
        System.out.println("a");
    }
    abstract void w();
}
class B5 extends A5{
    void w(){
        System.out.println("b");
    }
}
class C5 extends A5{
    void w(){
        System.out.println("c");
    }
}
public class p10{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        A5 p1 = new B5();
        p1.h();
        p1.w();
        A5 p2 = new C5();
        p2.h();
        p2.w();
    }
}