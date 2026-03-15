package home.quiz;
import java.util.Scanner;
class Student {
    int rollNo;
    String name;
    int m1, m2, m3;
    double percentage;
    char grade;
}
public class test1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] s=new Student[n];
        for (int i=0;i<n;i++) {
            s[i]=new Student();
            System.out.println("\nEnter details of student " + (i + 1));
            System.out.print("Roll No: ");
            s[i].rollNo=sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            s[i].name=sc.nextLine();
            System.out.print("Marks of 3 subjects: ");
            s[i].m1=sc.nextInt();
            s[i].m2=sc.nextInt();
            s[i].m3=sc.nextInt();
            s[i].percentage=(s[i].m1+s[i].m2+s[i].m3)/3.0;
            if (s[i].percentage>=75)
                s[i].grade='A';
            else if (s[i].percentage>=60)
                s[i].grade='B';
            else if (s[i].percentage>=40)
                s[i].grade='C';
            else
                s[i].grade='F';
        }
        for (int i=0;i<n-1;i++) {
            for (int j=0;j<n-i-1;j++) {
                if (s[j].percentage<s[j+1].percentage) {
                    Student temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
        System.out.println("\nTopper Details");
        System.out.println("Roll No: " + s[0].rollNo);
        System.out.println("Name: " + s[0].name);
        System.out.println("Percentage: " + s[0].percentage);
        System.out.println("Grade: " + s[0].grade);
        int a=0,b=0,c=0,f=0;
        for (int i=0;i<n;i++){
            if (s[i].grade=='A') {
                a++;
            }
            else if (s[i].grade=='B'){
                b++;
            }
            else if (s[i].grade=='C'){
                c++;
            }
            else f++;
        }
        System.out.println("Grade A: " + a);
        System.out.println("Grade B: " + b);
        System.out.println("Grade C: " + c);
        System.out.println("Grade F: " + f);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}