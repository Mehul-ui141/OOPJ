// Show that a final method cannot be overridden.
package lab5;
class C1{
    final void show() {
        System.out.println("Parent show() method");
    }
}
class C2 extends C1 {
    public static void main(String[] args) {
        C2 obj=new C2();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        obj.show();
    }
}