import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
    public  static Connection connection = null;
    public Statement st= null;
    public  PreparedStatement ps= null;
    public  ResultSet rs=null;
    public  static String Driver = "com.mysql.cj.jdbc.Driver";
    public static  String url = "jdbc:mysql://localhost:3306/showroom";
    public static  String root = "root";
    public static String password = "k1010";

    public Connection getConnection(){

        
        return connection;
        
    }
    
}
