//Create a class Employee with a constructor that takes employee id and salary and displays them.
package lab4;
class employ{
    int id;
    double salary;
    employ(int r, double n){
        id=r;
        salary=n;
    }
    void display(){
        System.out.println("EmpID: " + id);
        System.out.println("Salary: " + salary);
    }
}
public class p3 {
    public static void main(String args[]) {
        employ e = new employ(287,10000 );
        e.display();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}