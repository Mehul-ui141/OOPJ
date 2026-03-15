//Demonstrate how final restricts runtime polymorphism.
package lab5;
class Book{
    final void read(){
        System.out.println("Reading books");
    }
}
class EBook extends Book{
    void download(){
        System.out.println("Downloading books");
    }

    public static void main(String[] args) {
        Book b=new EBook();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        b.read();
    }
}
