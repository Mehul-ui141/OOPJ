package home;
import java.util.Scanner;
class Student{
    int rollno;
    String name;
    void insertRecord(int r, String n){
        rollno=r;
        name=n;
    }
    void displayinfo(){
        System.out.println(rollno+" "+name);
    }
}
public class p2{
    static void main(String[] args){
        Student s1= new Student();
        Student s2= new Student();
        Scanner sc= new Scanner(System.in);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        System.out.println("Enter roll number of first student");
        int r1=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name of first student");
        String n1=sc.nextLine();
        System.out.println("Enter roll number of Second student");
        int r2=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name of Second student");
        String n2=sc.nextLine();
        s1.insertRecord(r1,n1);
        s2.insertRecord(r2,n2);
        s1.displayinfo();
        s2.displayinfo();
    }
}