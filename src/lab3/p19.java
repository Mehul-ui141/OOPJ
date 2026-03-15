//Create a Student class and rank students based on total marks.
package lab3;
import java.util.Scanner;
class stud1 {
    String name;
    int totalMarks;
}
public class p19{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Students:");
        int n=sc.nextInt();
        sc.nextLine();
        stud1[] S=new stud1[n];
        for(int i=0;i<n;i++){
            S[i]=new stud1();
            System.out.println("Enter Student details " + (i + 1));
            System.out.println("Enter Student name:");
            S[i].name = sc.nextLine();
            System.out.println("Enter Total Marks:");
            S[i].totalMarks=sc.nextInt();
            sc.nextLine();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(S[i].totalMarks<S[j].totalMarks){
                    stud1 temp=S[i];
                    S[i]=S[j];
                    S[j]=temp;
                }
            }
        }
        System.out.println("Student Ranking:");
        for(int i = 0; i < n; i++){
            System.out.println("Rank " + (i + 1) + " : " + S[i].name + " | Marks: " + S[i].totalMarks);
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

