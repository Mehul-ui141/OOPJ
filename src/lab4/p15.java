//Demonstrate method chaining using this.
package lab4;
public class p15{
    public static void main(String[] args) {
        C15 obj = new C15();
        obj.display().print();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
class C15{
    int a, b;
    C15(){
        a = 10;
        b = 20;
    }
    C15 display(){
        System.out.println("a = " + a + ", b = " + b);
        return this;
    }
    void print(){
        System.out.println("Method chaining successful.");
    }
}