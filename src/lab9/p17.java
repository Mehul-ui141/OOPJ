//Write a program to replace a specific word in a file with another word
//entered by the user.
package lab9;
import java.io.*;
import java.util.*;
public class p17{
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Old word: ");
        String oldw = sc.nextLine();
        System.out.print("New word: ");
        String neww = sc.nextLine();
        BufferedReader br = new BufferedReader(new FileReader("C:\\OOPJ\\data3.txt"));
        FileWriter fw = new FileWriter("C:\\OOPJ\\upper.txt");
        String s;
        while ((s = br.readLine()) != null) {
            s = s.replace(oldw, neww);
            fw.write(s + "\n");
        }
        br.close();
        fw.close();
        System.out.println("Replacement done");
        }
}