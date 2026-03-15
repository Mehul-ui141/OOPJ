//Create an Employee class and update salary based on years of experience.
package lab3;
import java.util.Scanner;
class Emp {
    int empId;
    String name;
    double salary;
    int experience;
}
public class p26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n=sc.nextInt();
        sc.nextLine();
        Emp[] e=new Emp[n];
        for (int i=0;i<n;i++) {
            e[i]=new Emp();
            System.out.println("Enter details of employee " + (i + 1));
            System.out.print("Emp ID: ");
            e[i].empId=sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            e[i].name=sc.nextLine();
            System.out.print("Salary: ");
            e[i].salary=sc.nextDouble();
            System.out.print("Years of Experience: ");
            e[i].experience=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            if (e[i].experience>=10) {
                e[i].salary+=e[i].salary*0.20;
            }
            else if (e[i].experience>=5){
                e[i].salary+=e[i].salary*0.15;
            }
        }
        System.out.println("Employee Details After Salary Update:");
        for (int i=0;i<n;i++) {
            System.out.println(e[i].empId + " | " + e[i].name + " | Experience: " + e[i].experience + " years | Updated Salary: " + e[i].salary);
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
