//Show instance initializer block execution in inheritance.
package lab5;
class Vehicle{
    {
        System.out.println("Vehicle instance initializer block");
    }
    Vehicle() {
        System.out.println("Vehicle constructor");
    }
}
class Cars1 extends Vehicle{
    {
        System.out.println("Cars1 instance initializer block");
    }
    Cars1(){
        System.out.println("Cars1 constructor");
    }
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Cars1 c=new Cars1();
    }
}