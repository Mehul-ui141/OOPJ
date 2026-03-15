//Create a Student class and compute class average, high and low marks.
package lab3;
import java.util.Scanner;
class Stud{
    int rollno;
    String name;
    int marks;
}
public class p13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of students:");
        int n=sc.nextInt();
        sc.nextLine();
        Stud[] S=new Stud[n];
        for (int i=0;i<n;i++) {
            S[i]=new Stud();
            System.out.println("Enter student details " + (i + 1));
            System.out.print("Roll No: ");
            S[i].rollno=sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            S[i].name=sc.nextLine();
            System.out.print("Marks: ");
            S[i].marks=sc.nextInt();
        }
        int t=0;
        Stud high=S[0];
        Stud low=S[0];
        for (int i=0;i<n;i++) {
            t+=S[i].marks;
            if (S[i].marks>high.marks) {
                high=S[i];
            }
            if (S[i].marks<low.marks) {
                low=S[i];
            }
        }
        double average=(double) t / n;
        System.out.println("Class Average Marks: " + average);
        System.out.println("Highest Marks:");
        System.out.println(high.name + " | Marks: " + high.marks);
        System.out.println("Lowest Marks:");
        System.out.println(low.name + " | Marks: " + low.marks);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}