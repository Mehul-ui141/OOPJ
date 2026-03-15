package home;
interface Transaction{
    void deposit();
    void withdraw();
}
class HDFC implements Transaction{
    public void deposit(){
    }
    public void withdraw(){}
}
class ICICI implements Transaction{
    public void deposit(){}
    public void withdraw(){}
}
public class exm{
    static void main() {
        Transaction t;
        t=new HDFC();
        t.deposit();
        t.withdraw();
        t=new ICICI();
        t.deposit();
        t.withdraw();

    }
}
