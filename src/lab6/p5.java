//5.Write a program to show that an abstract class can have:
//A. Static methods
//B. Static blocks and demonstrate their execution.
package lab6;
abstract class Employee{
    static{
        System.out.println("Employee class");
    }
    static void policy(){
        System.out.println("Policy");
    }
}
public class p5{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Employee.policy();
    }
}