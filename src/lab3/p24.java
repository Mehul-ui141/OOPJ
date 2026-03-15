//Create a Student2 class and separate pass and fail students.
package lab3;
import java.util.Scanner;
class Student2 {
    int rollNo;
    String name;
    int marks;
}
public class p24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        sc.nextLine();
        Student2[] s=new Student2[n];
        for (int i=0;i<n;i++) {
            s[i]=new Student2();
            System.out.println("Enter details of student " + (i + 1));
            System.out.print("Roll No: ");
            s[i].rollNo=sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            s[i].name=sc.nextLine();
            System.out.print("Marks: ");
            s[i].marks=sc.nextInt();
        }
        System.out.println("Passed:");
        for (int i=0;i<n;i++) {
            if (s[i].marks>=40) {
                System.out.println(s[i].rollNo + " | " + s[i].name + " | Marks: " + s[i].marks);
            }
        }
        System.out.println("Failed:");
        for (int i=0;i<n;i++){
            if (s[i].marks<40){
                System.out.println(s[i].rollNo + " | " + s[i].name + " | Marks: " + s[i].marks);
            }
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}