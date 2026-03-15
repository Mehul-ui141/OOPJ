//Write a Java program to count number of lines and words in a text file.
package lab9;
import java.io.FileInputStream;
public class p16 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        try{
            int wcont=0,lcont=0;
            boolean word = false;
            FileInputStream fin = new FileInputStream("C:\\OOPJ\\data3.txt");
            int i;
            while((i=fin.read()) != -1){
                if ((char)i == '\n'){
                    lcont++;
                }
                if ((char)i == ' ' || (char)i == '\n' || (char)i == '\t') {
                    word = false;
                }
                else if (!word) {
                    wcont++;
                    word = true;
                }
            }
            System.out.println("Total lines are: " + lcont);
            System.out.println("Total words are: " + wcont);
        }
        catch (Exception e) {
            System.out.println("Exception caught.");
        }
    }
}
