//Create a class Engine and aggregate it inside a Car class.
package lab4;
class Engine{
    int power;
    Engine(int power){
        this.power=power;
    }
}
class Car1{
    String model;
    Engine engine;
    Car1(String model,Engine engine){
        this.model=model;
        this.engine=engine;
    }
    void display(){
        System.out.println("Model: "+model);
        System.out.println("Engine Power: "+engine.power+" HP");
    }
}
public class p23{
    public static void main(String[] args){
        Engine e=new Engine(150);
        Car1 c=new Car1("Honda",e);
        c.display();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
