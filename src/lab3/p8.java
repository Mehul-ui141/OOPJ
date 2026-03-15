//Create a student class and remove a student object based on roll number.
package lab3;
import java.util.Scanner;
class student1 {
    int rollNo;
    String name;
    void input(int r, String n) {
        rollNo=r;
        name=n;
    }
    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}
public class p8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        sc.nextLine();
        student1[] s=new student1[n];
        for (int i=0;i<n;i++) {
            s[i]=new student1();
            System.out.print("Enter roll number: ");
            int r=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name: ");
            String name=sc.nextLine();
            s[i].input(r,name);
        }
        System.out.print("Enter roll number to remove: ");
        int removeRoll=sc.nextInt();
        int newSize=n;
        for (int i=0;i<n;i++) {
            if (s[i].rollNo==removeRoll) {
                for (int j=i;j<n-1;j++) {
                    s[j]=s[j+1];
                }
                newSize--;
                break;
            }
        }
        System.out.println("Remaining Students:");
        for (int i = 0; i < newSize; i++) {
            s[i].display();
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}