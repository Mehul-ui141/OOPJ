package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
class test1 {
    static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
            String user = "meh287";
            String password = "kiit";
            System.out.println("Connecting to Oracle Database...");
            connection = DriverManager.getConnection(url, user, password);
            if (connection != null && !connection.isClosed()) {
                System.out.println("Success! Connected to Oracle 11g XE.");

                if (connection.isValid(5)) {
                    System.out.println("Connection is valid and active.");
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found! Add " +
                    ".jar to your classpath.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check if Oracle Service is running.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}