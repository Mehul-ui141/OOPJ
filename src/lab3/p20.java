// Create an Employee class and find department-wise highest paid Employee.
package lab3;
import java.util.Scanner;
class Employee{
    int empId;
    String name;
    String department;
    double salary;
}
public class p20{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n=sc.nextInt();
        sc.nextLine();
        Employee[] e = new Employee[n];
        for (int i=0;i<n;i++) {
            e[i]=new Employee();
            System.out.println("Enter details of Employee " + (i + 1));
            System.out.print("Employee ID: ");
            e[i].empId=sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            e[i].name=sc.nextLine();
            System.out.print("Department: ");
            e[i].department=sc.nextLine();
            System.out.print("Salary: ");
            e[i].salary=sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("Department-wise Highest Paid Employee:");
        for (int i=0;i<n;i++) {
            boolean found=false;
            for (int k=0;k<i;k++) {
                if (e[i].department.equalsIgnoreCase(e[k].department)) {
                    found = true;
                    break;
                }
            }
            if (!found){
                Employee highest = e[i];
                for (int j = i + 1; j < n; j++) {
                    if (e[j].department.equalsIgnoreCase(e[i].department) && e[j].salary > highest.salary){
                        highest = e[j];
                    }
                }
                System.out.println(highest.department + " | " + highest.name + " | Salary: " + highest.salary);
            }
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}