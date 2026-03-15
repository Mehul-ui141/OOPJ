//Write a Java program to check whether two strings are anagrams without
//using sorting.
package lab8;
public class p9{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        String s1 = "listen";
        String s2 = "silent";
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        boolean anagram=true;
        for (int i=0;i<s1.length();i++) {
            char ch=s1.charAt(i);
            int c1=0,c2=0;
            for (int j=0;j<s1.length();j++) {
                if (s1.charAt(j)==ch)
                    c1++;
                if (s2.charAt(j)==ch)
                    c2++;
            }
            if (c1!=c2){
                anagram=false;
                break;
            }
        }
        if (anagram)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}