//Write a program where destroying parent object does not destroy aggregated object
package lab4;
class X{
    int x=10;
    void show(){
        System.out.println("Value of x: "+x);
    }
}
class Z{
    X b;
    Z(X b){
        this.b=b;
    }
}
public class p30{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        X objB=new X();
        Z objA=new Z(objB);
        objA=null;
        objB.show();
    }
}
