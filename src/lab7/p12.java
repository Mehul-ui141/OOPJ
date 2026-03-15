//Write a program to demonstrate that finally executes even if a return statement is present.
package lab7;
class Test{
    static int test(){
        try{
            return 10;
        }
        finally{
            System.out.println("Finally");
        }
    }
    public static void main(String[] args){
        test();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}