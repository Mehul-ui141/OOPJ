// Show that super() must be the first statement in a constructor.
package lab5;
class Animals{
    Animals(){
        System.out.println("animal is created");
    }
}
class Dog1 extends Animals{
    Dog1(){
        super();
        System.out.println("dog is created");
    }
}
class p4{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        new Dog1();
    }
}