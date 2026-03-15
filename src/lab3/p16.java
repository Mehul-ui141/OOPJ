//Create a Player class and find top scorer and average score.
package lab3;
import java.util.Scanner;
class Player{
    String name;
    int score;
}
public class p16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Players:");
        int n=sc.nextInt();
        sc.nextLine();
        Player[] P = new Player[n];
        int total=0;
        for(int i=0;i<n;i++){
            P[i]=new Player();
            System.out.println("Enter Player details " + (i + 1));
            System.out.println("Enter Player name:");
            P[i].name=sc.nextLine();
            System.out.println("Enter Score:");
            P[i].score=sc.nextInt();
            sc.nextLine();
            total+=P[i].score;
        }
        int topScore=P[0].score;
        String topPlayer=P[0].name;
        for(int i=1;i<n;i++){
            if(P[i].score>topScore){
                topScore=P[i].score;
                topPlayer=P[i].name;
            }
        }
        double avg=(double)total/n;
        System.out.println("Average Score: " + avg);
        System.out.println("Top Scorer: " + topPlayer + " with Score: " + topScore);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
