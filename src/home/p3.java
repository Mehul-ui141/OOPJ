package home;
import java.util.Scanner;
public class p3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        student s[] = new student[10];
        for (int i = 0; i < 10; i++) {
            s[i] = new student();
            System.out.print("roll no." + (i+1) + ":");
            int r = sc.nextInt();
            sc.nextLine();
            System.out.print("name " + (i+1) + ":");
            String n = sc.nextLine();
            s[i].insert(r, n);
        }
        System.out.println("Student Details");
        for (int i = 0; i < 10; i++) {
            s[i].display();
        }
        sc.close();
    }
}

class student {
    int rollno;
    String name;
    void insert(int r, String n) {
        rollno = r;
        name = n;
    }
    void display() {
        System.out.println(rollno + " " + name);
    }
}