//Write a Java program to demonstrate aggregation using Address and Employee.
package lab4;
public class p22 {
    public static void main(String[] args) {
        Address addr=new Address("Amritsar", "143001");
        Employee_p4 emp=new Employee_p4("Amit", 101, addr);
        emp.displayEmployee();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
class Address {
    String city;
    String zipCode;
    Address(String city, String zipCode) {
        this.city = city;
        this.zipCode = zipCode;
    }
    void disAddress() {
        System.out.println(city + ", " + " - " + zipCode);
    }
}
class Employee_p4 {
    String name;
    int id;
    Address address;
    Employee_p4(String name, int id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }
    void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.print("Employee Address: ");
        address.disAddress();
    }
}