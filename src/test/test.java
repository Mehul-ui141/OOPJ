public class test {
    public static void main(String[] args) {
        // The URL stays the same as it points to the PDB
        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";

        // Update these two lines
        String user = "meh287";
        String pass = "kiit";

        try (java.sql.Connection conn = java.sql.DriverManager.getConnection(url, user, pass)) {
            if (conn != null) {
                System.out.println("Success! Connected as: " + user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}