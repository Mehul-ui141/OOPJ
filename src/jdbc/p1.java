//1. Write a Java program using Java Database Connectivity to connect to a MySQL database and insert
// a new record into a table named Student (id, name, marks) using PreparedStatement.
package jdbc;
import java.sql.*;
class p1 {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
            String user = "meh287";
            String password = "kiit";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Oracle");
            String sql = "insert into STUDENT values(?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, 101);
            ps.setString(2, "Rahul");
            ps.setInt(3, 85);
            int x = ps.executeUpdate();
            if (x > 0)
                System.out.println("Record inserted");
            ps.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}