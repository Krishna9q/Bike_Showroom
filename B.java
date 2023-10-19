import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class B{
    Connection connection;
    double q1;
     String co;
     String m;
     String e;
     String b;
     int id;
     double p;
    public  void main() {
        try{
            System.out.println("hello");
            Class.forName("com.mysql.cj.jdbc.Driver");
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/showroom","root","k1010");
           if(connection.isClosed()){
            System.out.println("closed");
           }
           else{
            System.out.println("connected");
           }
           String bn = "AVENGER STREET"; 
           String mn ="BS-6";
           String cr ="BLACK";
           String eg ="125cc";

           PreparedStatement ps = connection.prepareStatement("select * from bike_details where bike_name ="+"'"+bn+"'"+"AND model_name = "+ "'"+mn+"'"+"AND color ="+"'"+cr+"'"+" AND engine ="+"'"+eg+"'");
             
            
    
            ResultSet resultset = ps.executeQuery();
            
            while(resultset.next()){
           
            
           
            
           
            id = resultset.getInt("bike_id");
             b = resultset.getString("bike_name");
              m= resultset.getString("model_name");
              co = resultset.getString("color");
              e = resultset.getString("engine");
               q1 =  resultset.getDouble("quantity");
            p = resultset.getDouble("price");



            }
            System.out.println(id);
            
            


           if(mn.equals(m) &&cr.equals(co) &&eg.equals(e) && bn.equals(b)){
              PreparedStatement updatestmt= connection.prepareStatement("Update bike_details set quantity = ? , price = ? where bike_id = "+id);
                updatestmt.setDouble(1, 10+q1);
                updatestmt.setDouble(2, 125000);
                updatestmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"bike updated");
           }
        else{
            ps = connection.prepareStatement("insert into bike_details(bike_name , model_name , color , engine , quantity , price) values(?,?,?,?,?,?)");
        
            ps.setObject(1,bn);
            ps.setObject(2,mn); 
            ps.setObject(3,cr);
            ps.setString(4, eg);
            ps.setDouble(5,10);
            ps.setDouble(6,125000);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Bike added succesfully");
        }
             
        connection.close();
    }catch(Exception e){
        System.out.println(e);

    }
   





  


   
    
    
    // System.out.println(cu
    
    
}
public static void main(String[] args) {
    B b1 = new B();
    b1.main();
}
}
