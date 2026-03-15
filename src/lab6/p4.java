//4.Demonstrate partial abstraction using an abstract class and explain
// why complete abstraction is not possible.
package lab6;
abstract class Bank{
    void bankInfo(){
        System.out.println("This is a bank");
    }
    abstract void Interest();
}
class SBI extends Bank{
    void Interest(){
        System.out.println("Interest is 9.1%");
    }
}
public class p4 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Bank b=new SBI();
        b.bankInfo();
        b.Interest();
    }
}