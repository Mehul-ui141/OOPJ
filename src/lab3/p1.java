//Create a Student class and store details of N students in an
//array of objects. Print the student having the highest average marks.
package lab3;
import java.util.Scanner;
class STUDENT {
    String name;
    int roll;
    int m1,m2,m3;
    double avg;
    void Average() {
        avg= (m1+m2+m3)/3.0;
    }
}
public class p1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        STUDENT[] s=new STUDENT[n];
        for (int i=0;i<n;i++) {
            s[i]=new STUDENT();
            System.out.println("Enter student details " + (i + 1));
            System.out.print("Roll No: ");
            s[i].roll=sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            s[i].name=sc.nextLine();
            System.out.print("Marks 1: ");
            s[i].m1=sc.nextInt();
            System.out.print("Marks 2: ");
            s[i].m2=sc.nextInt();
            System.out.print("Marks 3: ");
            s[i].m3=sc.nextInt();
            s[i].Average();
        }
        STUDENT top = s[0];
        for (int i=1;i<n;i++) {
            if (s[i].avg>top.avg) {
                top=s[i];
            }
        }
        System.out.println("Student with Highest Average Marks:");
        System.out.println("Roll No: " + top.roll);
        System.out.println("Name: " + top.name);
        System.out.println("Average Marks: " + top.avg);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}