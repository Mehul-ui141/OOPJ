package home.assignment;
import java.io.*;
public class p7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name = br.readLine();
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("Enter your CGPA: ");
        double cgpa = Double.parseDouble(br.readLine());
        System.out.print("Enter a sentence: ");
        String sentence = br.readLine();
        String[] words = sentence.split(" ");
        System.out.println("\n--- Output ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Words in sentence:");
        for (String w : words) {
            System.out.println(w);
        }
    }
}