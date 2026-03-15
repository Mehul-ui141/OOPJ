//Write a program that dynamically creates n threads based on user input
//and executes a simple task.
package lab10;
import java.util.Scanner;
class dthread extends Thread{
    public void run(){
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}
public class p5{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of threads: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            dthread t = new dthread();
            t.start();
        }
    }
}