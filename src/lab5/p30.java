//Demonstrate that static methods are not polymorphic.
package lab5;
class College {
    static void name(){
        System.out.println("College Name");
    }
}
class EngCollege extends College{
    static void name(){
        System.out.println("Engineering College Name");
    }
    public static void main(String[] args){
        College c=new EngCollege();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        c.name();
    }
}
