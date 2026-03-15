//Show effect of final method on runtime polymorphism.
package lab5;
class Appliance{
    final void power() {
        System.out.println("power on");
    }
}
class TV extends Appliance{
    void wash() {
        System.out.println("Television");
    }
    public static void main(String[] args) {
        Appliance a=new TV();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        a.power();
    }
}