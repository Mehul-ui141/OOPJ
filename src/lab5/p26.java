//Demonstrate dynamic method dispatch using parent reference and child object.
package lab5;
class Account{
    void interest(){
        System.out.println("Interest rate");
    }
}
class savings extends Account {
    void interest() {
        System.out.println("Savings account interest rate is 6%");
    }
    public static void main(String[] args) {
        Account acc=new savings();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        acc.interest();
    }
}
