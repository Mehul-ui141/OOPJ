//Create a class Book with a constructor that calculates
// total price based on quantity and unit price
package lab4;
class Book{
    int quan;
    float unit;
    Book(int q , float u )
    {
        quan = q ;
        unit = u ;
    }
    double total()
    {
        return quan*unit;
    }
}
public class p5 {
    public static void main(String[] args) {
        Book b1=new Book(2,12);
        System.out.println("total price: " + b1.total());
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}