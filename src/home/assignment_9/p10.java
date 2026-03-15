package home.assignment_9;
class MyExcepts extends Exception {
    MyExcepts() {
        super();
    }

    public String toString() {
        return "MyExcepts: Something went wrong!";
    }
}
public class p10 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha \n2405287\n");

        try {
            throw new MyExcepts();
        } catch (MyExcepts e) {
            System.out.println(e);
        }
    }
}