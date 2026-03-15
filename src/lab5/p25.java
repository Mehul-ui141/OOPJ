//Write a program to demonstrate runtime polymorphism using method overriding.
package lab5;
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
    public static void main(String[] args) {
        Shape s=new Circle();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        s.draw();
    }
}
