//Write a Java program to find the longest and shortest word in a given
//sentence.
package lab8;
public class p11{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        String str = "Hello";
        StringBuffer sb = new StringBuffer("Hello");
        StringBuilder sbd = new StringBuilder("Hello");
        long startTime = System.nanoTime();
        for (int i=0; i<100; i++){
            str += " World";
        }
        long endTime = System.nanoTime();
        System.out.println("String time: "+(endTime-startTime)+" nanoseconds");
        startTime = System.nanoTime();
        for (int i=0; i<100; i++){
            sb.append(" World");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: "+(endTime-startTime)+" nanoseconds");
        startTime = System.nanoTime();
        for (int i=0; i<100000; i++){
            sbd.append(" World");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder time: "+(endTime-startTime)+" nanoseconds");
    }
}
