package home.assignment_6;
class memory {
    int a = 10;
    static int b = 20;
    public static void main(String[] args) {
        memory obj1 = new memory();
        memory obj2 = new memory();
        System.out.println("Non-static a (obj1): " + obj1.a);
        System.out.println("Non-static a (obj2): " + obj2.a);
        System.out.println("Static b (obj1): " + obj1.b);
        System.out.println("Static b (obj2): " + obj2.b);
    }
}
