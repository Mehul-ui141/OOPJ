//Write a Java program to find the longest and shortest word in a given
//sentence.
package lab8;
public class p14{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        String str = "Hello World! I'm Groot.";
        String[] words = str.split(" ");
        String longest = words[0];
        String shortest = words[0];
        for(int i = 1; i < words.length; i++) {
            if(words[i].length() > longest.length()) {
                longest = words[i];
            }
            if(words[i].length() < shortest.length()) {
                shortest = words[i];
            }
        }
        System.out.println("Longest word: " + longest);
        System.out.println("Shortest word: " + shortest);
    }
}
