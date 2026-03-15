//Write a Java program using Java Database Connectivity to connect to a MySQL
// database and display all records from the table Employee (emp_id, emp_name, salary) using ResultSet.
package jdbc;
import java.sql.*;
class p2 {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
            String user = "meh287";
            String password = "kiit";
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from EMPLOYEE");
            while(rs.next()){
                int id = rs.getInt("emp_id");
                String name = rs.getString("emp_name");
                int salary = rs.getInt("salary");
                System.out.println(id + " " + name + " " + salary);
            }
            rs.close();
            st.close();
            con.close();
        } catch(Exception e) {
            System.out.println(e);;
        }
    }
}