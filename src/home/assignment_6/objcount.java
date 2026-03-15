package home.assignment_6;
class objCount {
    static int count = 0;
    objCount() {
        count++;
    }
    public static void main(String[] args) {
        objCount o1=new objCount();
        objCount o2=new objCount();
        objCount o3=new objCount();
        System.out.println("Total objects created = " + count);
    }
}
