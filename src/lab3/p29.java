//Create an Emp1 class and find employees with same salary but different roles.
package lab3;
import java.util.Scanner;
class Emp1{
    String name;
    String role;
    double salary;
}
public class p29{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Employees:");
        int n=sc.nextInt();
        sc.nextLine();
        Emp1[] E = new Emp1[n];
        for(int i=0;i<n;i++){
            E[i]=new Emp1();
            System.out.println("Enter Emp1 details " + (i + 1));
            System.out.println("Enter Name:");
            E[i].name=sc.nextLine();
            System.out.println("Enter Role:");
            E[i].role=sc.nextLine();
            System.out.println("Enter Salary:");
            E[i].salary=sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("Employees with same salary but different roles:");
        boolean found = false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(E[i].salary==E[j].salary && !E[i].role.equalsIgnoreCase(E[j].role)){
                    System.out.println(E[i].name + " (" + E[i].role + ") and " + E[j].name + " (" + E[j].role + ") | Salary: " + E[i].salary);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("No employees found with same salary and different roles.");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}