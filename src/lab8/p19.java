//Write a Java program to find the most repeated word in a paragraph
//ignoring case sensitivity.
package lab8;
public class p19 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        String str = "Hello world hello".toLowerCase();
        String[] words = str.split(" ");
        int max = 0;
        String result = "";
        for(int i = 0; i < words.length; i++) {
            int count = 0;
            for(int j = 0; j < words.length; j++) {
                if(words[i].equals(words[j]))
                    count++;
            }
            if(count > max) {
                max = count;
                result = words[i];
            }
        }
        System.out.println("Most repeated word: " + result);
        System.out.println("Frequency: " + max);
    }
}