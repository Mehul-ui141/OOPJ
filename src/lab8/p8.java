//Write a Java program to find the frequency of each character and display the
//character with maximum frequency.
package lab8;
public class p8{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        String s="You only live once";
        int max=0;
        char maxChar=' ';
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=0;j<s.length();j++)
                if(s.charAt(i)==s.charAt(j)) {
                    count++;}
            if(count>max){
                max=count;
                maxChar=s.charAt(i);
            }
        }
        System.out.println(maxChar);
    }
}