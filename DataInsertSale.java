import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class DataInsertSale {
    
    public static void main() {
        

         
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/showroom","root","k1010");
            PreparedStatement ps = con.prepareStatement("insert into sale(sale_date,bike_id,customer_id,invoice_number) values(?,?,?,?)");
            java.util.Date d = new java.util.Date();
             int invoic = Integer.valueOf(Invoice.in_n);
             
            
            
            
            Customer c = new Customer();
            ps.setTimestamp(1, new java.sql.Timestamp(d.getTime()));
            ps.setInt(2,c.Bike_id);
            ps.setInt(3,c.Customer_id);
            ps.setInt(4,invoic);
            ps.executeUpdate();

             
            con.close();
        }catch(Exception e){
           

        }
       
        
    }
    
    
}
