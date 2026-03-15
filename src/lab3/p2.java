// Create an Employee class and sort employees by salary
// without using built-in sorting methods.
package lab3;
import java.util.Scanner;
class employ {
    String name;
    int id;
    double salary;
    employ(int id, String name, double salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}
public class p2{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n=sc.nextInt();
        employ[] emp=new employ[n];
        for (int i=0;i<n;i++) {
            System.out.println("Enter details of employ " + (i + 1));
            System.out.print("Enter ID: ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name=sc.nextLine();
            System.out.print("Enter Salary: ");
            double salary=sc.nextDouble();
            emp[i]=new employ(id, name, salary);
        }
        for (int i=0;i<n-1;i++) {
            for (int j=0;j<n-i-1;j++) {
                if (emp[j].salary>emp[j+1].salary) {
                    employ temp=emp[j];
                    emp[j]=emp[j+1];
                    emp[j+1]=temp;
                }
            }
        }
        System.out.println("Employees sorted by salary:");
        for (employ e:emp) {
            e.display();
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}