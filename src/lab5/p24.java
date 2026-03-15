//Initialize instance variables using an instance initializer block.
package lab5;
class Laptop{
    String brand;
    int price;
    {
        brand = "Dell";
        price = 55000;
    }
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Laptop l=new Laptop();
        l.display();
    }
}
