//Initialize a final variable inside an instance initializer block.
package lab5;
class p19 {
    final int id;
    {
        id = 101;
    }
    void display() {
        System.out.println("ID: " + id);
    }
    public static void main(String[] args){
        p19 s=new p19();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        s.display();
    }
}