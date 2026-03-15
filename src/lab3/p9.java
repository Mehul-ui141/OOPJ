//Create a Movie class and display movies with rating greater than 8.5.
package lab3;
import java.util.Scanner;
class Movies{
    String name;
    float rating;
    double year;
}
public class p9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Movies:");
        int n=sc.nextInt();
        sc.nextLine();
        Movies[] Mov= new Movies[n];
        for(int i=0;i<n;i++){
            Mov[i] = new Movies();
            System.out.println("Enter Movie details " + (i+1));
            System.out.println("Enter Movie name:");
            Mov[i].name=sc.nextLine();
            System.out.println("Enter Year:");
            Mov[i].year=sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter Rating:");
            Mov[i].rating=sc.nextFloat();
            sc.nextLine();
        }
        for(int i=0;i<n;i++){
            if(Mov[i].rating>8.5)
                System.out.println("Name: " + Mov[i].name + " Year " + Mov[i].year + " Rating " + Mov[i].rating);
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}