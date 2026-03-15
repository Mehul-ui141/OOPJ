//Write a program to read a text file and display only those lines containing
//a specific keyword.
package lab9;
import java.io.*;
import java.util.*;
public class p25 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter keyword: ");
            String keyword = sc.nextLine();
            BufferedReader br = new BufferedReader(new FileReader("C:\\OOPJ\\testin.txt"));
            String line;
            while((line = br.readLine()) != null) {
                if(line.contains(keyword)) {
                    System.out.println(line);
                }
            }
            br.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}