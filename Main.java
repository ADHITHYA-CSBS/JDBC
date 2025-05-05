import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");// it shows class not found exception.

        //Connection is an interface
        /*DriverManager needs to know what kind of db driver we are using,
        so that we need to load and register the corresponding DB driver in the above step
        */
        // "Now this step is optional in java 6+ versions"
        // DriverManager is a class which manages the jdbc drivers and get connection
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "110904");
        System.out.println("connection established");

        PreparedStatement st = con.prepareStatement("insert into Student values(2,'Amar',98)");

        int ans=st.executeUpdate();

        System.out.println(ans);
        System.out.println("connection closed");
        con.close();
    }
}