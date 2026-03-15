// Create a program to show multilevel inheritance using Vehicle → Car → ElectricCar.
package lab4;
class Vehicle{
    String brand;
    Vehicle(String brand){
        this.brand=brand;
    }
    void showVehicle(){
        System.out.println("Brand: "+brand);
    }
}
class Car extends Vehicle{
    int wheels;
    Car(String brand,int wheels){
        super(brand);
        this.wheels=wheels;
    }
    void showCar(){
        System.out.println("Wheels: "+wheels);
    }
}
class ElectricCar extends Car{
    int battery;
    ElectricCar(String brand,int wheels,int battery){
        super(brand,wheels);
        this.battery=battery;
    }
    void showElectricCar(){
        showVehicle();
        showCar();
        System.out.println("Battery: "+battery+" kWh");
    }
}
public class p20{
    public static void main(String[] args){
        ElectricCar e=new ElectricCar("Tesla",4,75);
        e.showElectricCar();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}