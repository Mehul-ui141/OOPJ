//. Write a program that takes a string using command line arguments and counts
//uppercase, lowercase, digits, and special characters.
package lab3;
public class p36 {
    public static void main(String[] args) {
        int ucase=0,lcase=0,dg=0,schar=0;
        for (int i=0;i<args.length; i++) {
            for (int j=0;j<args[i].length();j++) {
                char ch=args[i].charAt(j);
                if (Character.isUpperCase(ch)) {
                    ucase++;
                }
                else if (Character.isLowerCase(ch)) {
                    lcase++;
                }
                else if (Character.isDigit(ch)) {
                    dg++;
                }
                else {
                    schar++;
                }
            }
        }
        System.out.println("Uppercase: " + ucase);
        System.out.println("Lowercase: " + lcase);
        System.out.println("Digits: " + dg);
        System.out.println("Special Characters: " + schar);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
