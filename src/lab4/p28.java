//Write a program to show HAS-A relationship using aggregation.
package lab4;
class Engines {
    int power;
    Engines(int power) {
        this.power=power;
    }
}

class Cars1 {
    Engines e;
    Cars1(Engines e) {
        this.e = e;
    }
    void show() {
        System.out.println("Power: " + e.power);
    }
}
public class p28 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Engines e = new Engines(100);
        Cars1 c = new Cars1(e);
        c.show();
    }
}
