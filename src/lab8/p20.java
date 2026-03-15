//Write a Java program to check whether a string contains only unique
//characters.
package lab8;
public class p20{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        String str = "Hello".toLowerCase();
        boolean unique = true;
        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if(!unique)
                break;
        }
        if(unique)
            System.out.println("Only unique characters.");
        else
            System.out.println("Contains duplicate characters.");
    }
}
