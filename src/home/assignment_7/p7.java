package home.assignment_7;
public class p7{
    int data=10;
    p7(){
        B b = new B(this);
        b.display();
    }
    public static void main(String args[]) {
        p7 a = new p7();
    }
}
class B {
    p7 obj;
    B(p7 obj) {
        this.obj = obj;
    }
    void display() {
        System.out.println(obj.data);
    }
}
