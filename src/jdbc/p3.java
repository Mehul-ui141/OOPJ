//3. Write a Java program using Java Database Connectivity to perform the following operations on a MySQL table Product (product_id, product_name, price):
//A. Update the price of a product using PreparedStatement.
//B. Delete a product record based on product_id.
package jdbc;
import java.sql.*;
class p3 {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "meh287", "kiit");
            String q1 = "UPDATE PRODUCT SET price=? WHERE product_id=?";
            PreparedStatement ps1 = con.prepareStatement(q1);
            ps1.setInt(1, 1500);
            ps1.setInt(2, 101);
            int r1 = ps1.executeUpdate();
            if(r1 > 0)
                System.out.println("Product price updated");
            String q2 = "DELETE FROM PRODUCT WHERE product_id=?";
            PreparedStatement ps2 = con.prepareStatement(q2);
            ps2.setInt(1, 102);
            int r2 = ps2.executeUpdate();
            if(r2 > 0)
                System.out.println("Product deleted");
            ps1.close();
            ps2.close();
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}