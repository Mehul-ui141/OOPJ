package home.assignment_7;
public class p6 {
    void m(p6 obj) {
        System.out.println("method is invoked");
    }
    void p() {
        m(this);
    }
    public static void main(String args[]) {
        p6 s1=new p6();
        s1.p();
    }
}