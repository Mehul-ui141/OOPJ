//Create a College class that contains Students objects using aggregation.
package lab4;
class Students{
    int roll;
    String name;
    Students(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
}
class College{
    String collegeName;
    Students[] students;
    College(String collegeName,Students[] students){
        this.collegeName=collegeName;
        this.students=students;
    }
    void display(){
        System.out.println("College: "+collegeName);
        for(int i=0;i<students.length;i++){
            System.out.println("Roll: "+students[i].roll+", Name: "+students[i].name);
        }
    }
}
public class p27{
    public static void main(String[] args){
        Students[] s=new Students[2];
        s[0]=new Students(101,"Rahul");
        s[1]=new Students(102,"Amit");
        College c=new College("KIIT",s);
        c.display();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
