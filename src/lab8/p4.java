//Write a Java program to reverse a string using loop, StringBuilder, and
//recursion.
package lab8;
public class p4{
    static String revWithLoop(String str){
        String s=str;
        String res="";
        for(int i=str.length()-1;i>=0;i--){
            res=res.concat(Character.toString(str.charAt(i)));
        }
        return res;
    }
    static String revWithRecursion(String str) {
        if (str.length()==1)
            return str;
        return revWithRecursion(str.substring(1,str.length()))+str.charAt(0);
    }
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        String str = "Abcdef";
        System.out.println("Reversing using loop: " + revWithLoop(str));
        StringBuilder strb = new StringBuilder(str);
        strb.reverse();
        System.out.println("Reversing using StringBuilder: " + strb.toString());
        System.out.println("Reversing using recursion: " + revWithRecursion(str));
    }
}