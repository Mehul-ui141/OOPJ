// Create a Person class and find the oldest and youngest person.
package lab3;
import java.util.Scanner;
class Person {
    String name;
    int age;
}
public class p11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of persons:");
        int n=sc.nextInt();
        sc.nextLine();
        Person[] P=new Person[n];
        for (int i=0;i<n;i++) {
            P[i]=new Person();
            System.out.println("Enter person details " + (i + 1));
            System.out.print("Name: ");
            P[i].name=sc.nextLine();
            System.out.print("Age: ");
            P[i].age=sc.nextInt();
            sc.nextLine();
        }
        Person oldest=P[0];
        Person youngest=P[0];
        for (int i=1;i<n;i++) {
            if (P[i].age>oldest.age) {
                oldest=P[i];
            }
            if (P[i].age<youngest.age) {
                youngest=P[i];
            }
        }
        System.out.println("Oldest Person:");
        System.out.println("Name: " + oldest.name + ", Age: " + oldest.age);
        System.out.println("Youngest Person:");
        System.out.println("Name: " + youngest.name + ", Age: " + youngest.age);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}