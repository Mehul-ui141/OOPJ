//Show execution order of instance initializer block and constructor.
package lab5;
class Employee{
    {
        System.out.println("Instance initializer block executed");
    }
    Employee(){
        System.out.println("Constructor executed");
    }
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Employee e=new Employee();
    }
}