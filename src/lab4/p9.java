//Create a class Time with constructor to accept hours, minutes, seconds and normalize time.
package lab4;
class Time{
    int hours, minutes, seconds;
    Time(int h,int m,int s) {
        seconds=s%60;
        minutes=m+(s/60);
        minutes=minutes%60;
        hours=h+(m/60)+(s/3600);
    }
    void display() {
        System.out.println(hours + " : " + minutes + " : " + seconds);
    }
}
public class p9 {
    public static void main(String[] args) {
        Time t1=new Time(3, 5, 25);
        Time t2=new Time(1, 120, 120);
        System.out.print("Normalized Time 1: ");
        t1.display();
        System.out.print("Normalized Time 2: ");
        t2.display();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
