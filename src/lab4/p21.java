//Write a program showing constructor calling sequence in inheritance.
package lab4;
class A{
    A(){
        System.out.println("Constructor of A");
    }
}
class B extends A{
    B(){
        System.out.println("Constructor of B");
    }
}
class C extends B{
    C(){
        System.out.println("Constructor of C");
    }
}
public class p21{
    public static void main(String[] args){
        C obj=new C();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
