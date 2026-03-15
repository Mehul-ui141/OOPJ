//Write a Java program to demonstrate a default constructor
// that initializes data members with default values.
package lab4;
    class Student{
        int roll;
        String name;
        Student(){
            roll=0;
            name="Mehul";
        }
        void display(){
            System.out.println("Roll: " + roll);
            System.out.println("Name: " + name);
        }
    }
    public class p1 {
        public static void main(String[] args) {
            Student s1=new Student();
            s1.display();
            System.out.println("Mehul Jha");
            System.out.println("2405287");
        }
    }