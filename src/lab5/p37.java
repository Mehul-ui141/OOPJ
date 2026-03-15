//Write a program showing upcasting and its role in polymorphism.
package lab5;
class Game {
    void play() {
        System.out.println("Playing game");
    }
}
class Cricket extends Game{
    void play(){
        System.out.println("Playing cricket");
    }
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Game g=new Cricket();
        g.play();
    }
}