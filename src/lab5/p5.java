//Demonstrate constructor execution order using super.
package lab5;
class Monkey{
    Monkey(){
        System.out.println("Monkey");
    }
}
class cat extends Monkey {
    cat(){
        super();
        System.out.println("cat");
    }
}
public class p5{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        cat c1=new cat();
    }
}