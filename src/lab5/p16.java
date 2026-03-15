//Use final keyword with constructor parameters.
package lab5;
class Car{
    String model;
    int year;
    Car(final String m, final int y){
        model = m;
        year = y;
    }
    void display() {
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturing Year: " + year);
    }
    public static void main(String[] args) {
        Car c = new Car("BMW", 1972);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        c.display();
    }
}