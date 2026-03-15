//Create a class Student with data members (name, roll, marks of 3 subjects).
//Write methods to input details, calculate percentage, and display all details.
package lab2;
import java.util.Scanner;
class student1{
    int roll;
    String name;
    int s1,s2,s3;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name:");
        name=sc.nextLine();
        System.out.print("Enter roll number:");
        roll=sc.nextInt();
        System.out.print("Enter marks of 3 subjects:");
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
    }
    void percent(){
        float per=(s1+s2+s3)/3.0f;
        System.out.println("Percentage: " + per);
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Marks: " + s1 + ", " + s2 + ", " + s3);
    }
}
public class p21{
    public static void main(String[] args){
        student1 stu = new student1();
        stu.input();
        stu.display();
        stu.percent();
        System.out.println("\nMehul Jha");
        System.out.println("2405287");
    }
}
