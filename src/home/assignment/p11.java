package home.assignment;
class constructorOver {
    constructorOver() {
        System.out.println("no arguments");
    }
    constructorOver(int a) {
        System.out.println("Display one integer: " + a);
    }
    constructorOver(int a, String name) {
        System.out.println("a = " + a + ", name = " + name);
    }
}
public class p11{
    public static void main(String[] args) {
        constructorOver obj1=new constructorOver();
        constructorOver obj2=new constructorOver(29);
        constructorOver obj3=new constructorOver(287, "Mehul Jha");
    }
}