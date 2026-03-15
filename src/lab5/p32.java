// Demonstrate runtime binding of overridden methods.
package lab5;
class Payment{
    void pay(){
        System.out.println("cash payment");
    }
}
class Card extends Payment {
    void pay(){
        System.out.println("Payment using card");
    }
    public static void main(String[] args) {
        Payment p=new Card();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        p.pay();
    }
}
