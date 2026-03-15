package home.assignment;
public class p6{
    public static void main(String[] args){
        int sum=0;
        float mean=0;
        for(int i=0; i<args.length; i++){
            sum+=Integer.parseInt(args[i]);
        }
        mean=(float)sum/args.length;
        System.out.println("Mean = " + mean);
    }
}