package home;
import java.util.Scanner;
public class p1 {
    static class student {
        int id;
        String name;
    }
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            student s1= new student();
            System.out.println("Enter id");
            s1.id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name");
            s1.name=sc.nextLine();
            System.out.println(s1.id);
            System.out.println(s1.name);
            System.out.println("Mehul Jha");
            System.out.println("2405287");
        }
    }


