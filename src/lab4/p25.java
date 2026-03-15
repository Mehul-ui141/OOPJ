//Demonstrate aggregation using array of objects inside another class.
package lab4;
class Book1{
    String title;
    Book1(String title){
        this.title=title;
    }
}
class Library{
    String name;
    Book1[] books;
    Library(String name,Book1[] books){
        this.name=name;
        this.books=books;
    }
    void display(){
        System.out.println("Library: "+name);
        for(int i=0;i<books.length;i++){
            System.out.println("Book1: "+books[i].title);
        }
    }
}
public class p25{
    public static void main(String[] args){
        Book1[] b=new Book1[2];
        b[0]=new Book1("Java");
        b[1]=new Book1("Python");
        Library l=new Library("Central Library",b);
        l.display();
        System.out.println("Mehul Jha");
        System.out.println("2405287");

    }
}
