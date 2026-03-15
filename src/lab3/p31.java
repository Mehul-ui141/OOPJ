// Write a Java program that accepts N integers using command line arguments
// and prints the largest and smallest number.
package lab3;
public class p31{
    public static void main(String[] args) {
        if (args.length==0){
            System.out.println("Enter no: ");
            return;
        }

        int max=Integer.parseInt(args[0]);
        int min=Integer.parseInt(args[0]);
        for (int i=1;i<args.length;i++) {
            int num=Integer.parseInt(args[i]);
            if (num>max)
                max=num;
            if (num<min)
                min=num;
        }
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
