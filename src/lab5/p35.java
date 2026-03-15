//Show method call resolution when overridden methods throw exceptions.
package lab5;
class Bank{
    void withdraw() throws Exception{
        System.out.println("Bank withdrawal");
    }
}
class ATM extends Bank{
    void withdraw() throws Exception{
        System.out.println("ATM withdrawal");
    }
    public static void main(String[] args) throws Exception{
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Bank b=new ATM();
        b.withdraw();
    }
}
