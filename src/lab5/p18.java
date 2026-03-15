//Show compile-time error when overriding a final method.
package lab5;
class Bike {
    final void speed() {
        System.out.println("Bike is fast");
    }
}
class SportsBike extends Bike {
    /*void speed() {
        System.out.println("Sports bike is fast");
    }*/
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}