//Write a program to calculate the sum and average of numbers passed through
// command line arguments.
package lab3;
public class p32{
    public static void main(String[] args) {
        if (args.length==0){
            System.out.println("Enter No: ");
            return;
        }
        int sum = 0;
        for (int i=0;i<args.length;i++) {
            sum+=Integer.parseInt(args[i]);
        }
        double average=(double) sum/args.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}