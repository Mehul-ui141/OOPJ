//Initialize a final variable using a constructor.
package lab5;
class Student{
    final int rollNo;
    Student(int r){
        rollNo=r;
    }
    void display(){
        System.out.println("Roll Number: " + rollNo);
    }
    public static void main(String[] args) {
        Student s1 = new Student(287);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        s1.display();
    }
}