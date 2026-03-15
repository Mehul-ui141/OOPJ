//Write a Java program that accepts student name, roll number, and marks using
//command line arguments and prints the student result.
package lab3;
public class p33{
    public static void main(String[] args) {
        String name = args[0];
        String rollno = args[1];
        int marks = Integer.parseInt(args[2]);
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Marks: " + marks);
        if (marks >= 40) {
            System.out.println("Result: Pass");
        }
        else{
            System.out.println("Result: Fail");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
