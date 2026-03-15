//Write a Java program that accepts student marks
//using command line arguments and prints grade distribution (A/B/C/F).
package lab3;
public class p40{
    public static void main(String[] args) {
        for (int i=0;i<args.length;i++) {
            int marks=Integer.parseInt(args[i]);
            char grade;
            if (marks>=90) {
                grade='A';
            }
            else if (marks>=75) {
                grade='B';
            }
            else if (marks>=50) {
                grade='C';
            }
            else if (marks<50) {
                grade='F';
            }
            else {
                grade='I';
            }
            System.out.println("Marks: " + marks + " Grade: " + grade);
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
