// Write a program that accepts two numbers and an operator (+, −, ×, /) using
//command line arguments and performs the operation.
package lab3;
public class p34{
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);
        String opp = args[1];
        if (opp.equals("+")){
            System.out.println("Sum is: " + (x+y));
        }
        else if (opp.equals("-")){
            System.out.println("Difference is: " + (x-y));
        }
        else if (opp.equals("*")){
            System.out.println("product is: " + (x*y));
        }
        else if (opp.equals("/")){
            System.out.println("Division is: " + ((double)x/y));
        }
        else{
            System.out.println("Invalid Operator");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}