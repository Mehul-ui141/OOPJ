package home.quiz;
class Time {
    int hours;
    int minutes;
    int seconds;
    Time(int h, int m, int s) {
        this.hours=h;
        this.minutes=m;
        this.seconds=s;
        fixtime();
    }
    void fixtime(){
        this.minutes+=this.seconds / 60;
        this.seconds=this.seconds % 60;
        this.hours+=this.minutes / 60;
        this.minutes=this.minutes % 60;
    }
    Time addSeconds(int s){
        this.seconds+=s;
        fixtime();
        return this;
    }
    void display(){
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
 public class test2{
    public static void main(String[] args) {
        Time t=new Time(7, 31, 12);
        t.addSeconds(20).addSeconds(40);
        t.display();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}