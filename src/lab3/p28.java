//Create a Student class and assign grades (A/B/C/F) based on marks.
package lab3;
import java.util.Scanner;
class Stu {
    int rollNo;
    String name;
    int marks;
    char grade;
}
public class p28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Stu[] s = new Stu[n];
        for (int i=0;i<n;i++) {
            s[i] = new Stu();
            System.out.println("\nEnter details of student " + (i + 1));
            System.out.print("Roll No: ");
            s[i].rollNo=sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            s[i].name=sc.nextLine();
            System.out.print("Marks: ");
            s[i].marks=sc.nextInt();
            if (s[i].marks>=70)
                s[i].grade='A';
            else if (s[i].marks>=60)
                s[i].grade='B';
            else if (s[i].marks>=50)
                s[i].grade='C';
            else
                s[i].grade='F';
        }
        System.out.println("Stu Details with Grades:");
        for (int i = 0; i < n; i++) {
            System.out.println(s[i].rollNo + " | " + s[i].name + " | Marks: " + s[i].marks + " | Grade: " + s[i].grade);
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}