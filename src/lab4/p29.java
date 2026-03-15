// Demonstrate aggregation with constructor-based object passing.
package lab4;
class Add{
    String city;
    Add(String city){
        this.city=city;
    }
}
class Empl{
    int id;
    Add addr;
    Empl(int id,Add addr){
        this.id=id;
        this.addr=addr;
    }
    void display(){
        System.out.println("ID: "+id);
        System.out.println("City: "+addr.city);
    }
}
public class p29{
    public static void main(String[] args){
        Add a=new Add("Amritsar");
        Empl e=new Empl(101,a);
        e.display();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}