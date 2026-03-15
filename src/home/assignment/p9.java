package home.assignment;
class Cons {
    Cons() {
        System.out.println("1st constructor: No parameters");
    }
    Cons(int a) {
        System.out.println("2nd constructor: " + a);
    }
    Cons(int a, String name) {
        System.out.println("3rd constructor: a = " + a + ", name = " + name);
    }
}
public class p9{
    public static void main(String[] args) {
        Cons c1 = new Cons();
        Cons c2 = new Cons(2405287);
        Cons c3 = new Cons(2405287, "Mehul");
    }
}