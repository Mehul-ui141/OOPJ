    //Create a package containing both interface and abstract class,
    // and implement them in another package.
    package lab6;
    import pack.A23;
    import pack.B23;
    public class p23 extends B23 implements A23 {
        public static void main(String[] args) {
            System.out.println("Mehul Jha");
            System.out.println("2405287");
            p23 a = new p23();
            a.show();
            a.display();
        }
        public void show() {
            System.out.println("Interface method");
        }
    }