//Write a program that explicitly throws an exception using the throw keyword
package lab7;
public class p15{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        int balance = 500;
        if(balance < 1000){
            throw new ArithmeticException("Insufficient balance");
        }
        System.out.println("Transaction successful");
    }
}