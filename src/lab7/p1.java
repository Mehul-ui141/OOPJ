//Write a program to handle ArithmeticException during division of two integers.
package lab7;
public class p1{
        public static void main(String[] args) {
            System.out.println("Mehul Jha");
            System.out.println("2405287");
            int amount = 1000;
            int people = 0;
            try {
                int share=amount/people;
                System.out.println("Each person gets: " + share);
            }
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
            System.out.println("Program continues...");
        }
 }