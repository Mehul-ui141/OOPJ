//Create two interfaces with the same method signature and implement them in a single class.
package lab6;
public class p16{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Book b = new Book();
        b.read();
    }
}
interface Student{
    void read();
}
interface Teacher{
    void read();
}
class Book implements Student, Teacher{
    public void read(){
        System.out.println("Reading library book");
    }
}