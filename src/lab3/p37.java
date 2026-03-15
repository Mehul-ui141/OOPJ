//Write a Java program that accepts employee salaries via command line arguments
//and displays salaries above the average salary.
package lab3;
public class p37{
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i=0;i<args.length;i++) {
            double  x=Double.parseDouble(args[i]);
            sum+=x;
        }
        double average=sum/args.length;
        System.out.println("Average Salary: " + average);
        System.out.println("Salaries above average:");
        for (int i=0;i<args.length;i++) {
            double x=Double.parseDouble(args[i]);
            if (x>average) {
                System.out.println(x);
            }
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}