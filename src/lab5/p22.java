//Demonstrate multiple instance initializer blocks and their execution order.
package lab5;
class Mobile{
    {
        System.out.println("Instance initializer block 1");
    }
    {
        System.out.println("Instance initializer block 2");
    }
    Mobile(){
        System.out.println("Constructor executed");
    }
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Mobile m=new Mobile();
    }
}