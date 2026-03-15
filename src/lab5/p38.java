//Demonstrate why downcasting can cause ClassCastException.
package lab5;
class Employ {
    void work() {
        System.out.println("Employee working");
    }
}
class Developer extends Employ {
    void work() {
        System.out.println("Developer writing code");
    }
}
class Managers extends Employ {
    void work() {
        System.out.println("Manager managing team");
    }
}
public class p38 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Employ e = new Developer();
        Managers m = (Managers) e;
        m.work();
    }
}
