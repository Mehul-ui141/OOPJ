package home.assignment_7;
public class p1{
    public static void main(String[] args) {
        M obj1=new M(101,"Alice");
        M obj2=new M(102,"Bob");
        System.out.println("Roll No: "+obj1.roll+", Name: "+obj1.name);
        System.out.println("Roll No: "+obj2.roll+", Name: "+obj2.name);
    }
}
class M{
    int roll;
    String name;
    M(int roll, String name){
        this.roll=roll;
        this.name=name;
    }
}