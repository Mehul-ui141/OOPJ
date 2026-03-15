//Write a program where a Department has multiple Teacher objects.
package lab4;
class Teacher{
    String name;

    Teacher(String name){
        this.name=name;
    }
}
class Department{
    String deptName;
    Teacher[] teachers;   // multiple Teacher objects

    Department(String deptName,Teacher[] teachers){
        this.deptName=deptName;
        this.teachers=teachers;
    }
    void display(){
        System.out.println("Department: "+deptName);
        for(int i=0;i<teachers.length;i++){
            System.out.println("Teacher: "+teachers[i].name);
        }
    }
}
public class p24{
    public static void main(String[] args){
        Teacher[] t=new Teacher[2];
        t[0]=new Teacher("Amit");
        t[1]=new Teacher("Neha");
        Department d=new Department("Computer Science",t);
        d.display();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
