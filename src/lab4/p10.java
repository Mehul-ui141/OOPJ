//Write a Java program to initialize array elements using a constructor.
package lab4;
public class p10 {
    public static void main(String[] args) {
        C10 obj = new C10();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
class C10{
    int[] arr;
    C10(){
        arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Array elements: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
