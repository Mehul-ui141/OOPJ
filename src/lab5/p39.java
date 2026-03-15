//Write a single program combining super + final + runtime polymorphism and explain the output.
package lab5;
class Books1{
    final void libraryRule() {
        System.out.println("Library rules must be followed");
    }
    void read(){
        System.out.println("Reading a book");
    }
}
class EBook1 extends Books1{

    void read() {
        super.read();
        System.out.println("Reading an eBook");
    }
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Books1 b=new EBook1();
        b.libraryRule();
        b.read();
    }
}
