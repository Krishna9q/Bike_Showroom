import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddBikes extends javax.swing.JFrame {

    public AddBikes() {
        initComponents();
    }
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        container = new javax.swing.JPanel();
        bike_n = new javax.swing.JLabel();
        model_n = new javax.swing.JLabel();
        quant = new javax.swing.JLabel();
        bike_name = new javax.swing.JComboBox<>();
        model_name = new javax.swing.JComboBox<>();
        pric = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        clr = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        color = new javax.swing.JComboBox<>();
        engine = new javax.swing.JTextField();
        t_amount = new javax.swing.JLabel();
        total_amount = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        bg_image = new javax.swing.JLabel();
      
       

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        container.setBackground(new java.awt.Color(0, 0, 0,80));

        bike_n.setFont(new java.awt.Font("Segoe UI", 1, 16));
        bike_n.setForeground(new java.awt.Color(255, 255, 255));
        bike_n.setText("BIKE NAME");

      

        model_n.setFont(new java.awt.Font("Segoe UI", 1, 16));
        model_n.setForeground(new java.awt.Color(255, 255, 255));
        model_n.setText("MODEL NAME");

        quant.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        quant.setForeground(new java.awt.Color(255, 255, 255));
        quant.setText("QUANTITY");

        bike_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "PULSAR", "PLATINA", "CT-100", "PULSAR-200","PULSAR-150","DOMINAR-400","PULSAR NS200","AVENGER STREET"}));
        bike_name.setFont(new java.awt.Font("Tahoma",1,14));
       
        model_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"SELECT", "BS-4", "BS-6"}));
         model_name.setFont(new java.awt.Font("Tahoma", 1, 14));
        model_name.setForeground(new java.awt.Color(0,0,0));


        pric.setFont(new java.awt.Font("Segoe UI", 1, 16));
        pric.setForeground(new java.awt.Color(255, 255, 255));
        pric.setText("PRICE");

        addbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        clr.setFont(new java.awt.Font("Segoe UI", 1, 16));
        clr.setForeground(new java.awt.Color(255, 255, 255));
        clr.setText("COLOR");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENGINE");

        color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "WHITE", "BLUE", "RED", "GRAY","BLACK" }));
         color.setFont(new java.awt.Font("Tahoma", 1, 14));
        color.setForeground(new java.awt.Color(0,0,0));
        
        

        t_amount.setFont(new java.awt.Font("Segoe UI", 1, 14));
        t_amount.setForeground(new java.awt.Color(255, 255, 255));
        t_amount.setText("TOTAL AMOUNT");

        total_amount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                total_amountMouseEntered(evt);
            }

            
        });
        price.setFont(new java.awt.Font("Tahoma", 1, 14));
        total_amount.setFont(new java.awt.Font("Tahoma", 1, 14));
        engine.setFont(new java.awt.Font("Tahoma", 1, 14));
        quantity.setFont(new java.awt.Font("Tahoma", 1, 14));
        

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quant, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model_n, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pric, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bike_n, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bike_name, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(model_name, 0, 118, Short.MAX_VALUE)
                            .addComponent(quantity)
                            .addComponent(price))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t_amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(color, 0, 140, Short.MAX_VALUE)
                            .addComponent(engine)
                            .addComponent(total_amount)))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bike_n, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bike_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clr, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(engine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(model_n, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(model_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(quant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(t_amount))
                    .addComponent(total_amount))
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pric, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(price))
                .addGap(18, 18, 18)
                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(container);
        container.setBounds(20, 50, 700, 280);

        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn);
        backbtn.setBounds(20, 13, 90, 29);

        bg_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/desktop_banner_new.jpg"))); // NOI18N
        getContentPane().add(bg_image);
        bg_image.setBounds(0, 0, 758, 400);

        setSize(new java.awt.Dimension(754, 398));
        setLocationRelativeTo(null);

       
    }
    
    String n = "";
    String sel = "SELECT";                    

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        boolean i = false;
    
        double price1 = Double.parseDouble(price.getText());
      double  quantity1 = Double.parseDouble(quantity.getText());
    //   boolean b=bike_name.getSelectedItem().equals(sel);
      if(bike_name.getSelectedItem().equals(sel)||model_name.getSelectedItem().equals(sel)||color.getSelectedItem().equals(sel)||engine.getText().equals(n)||quantity.getText().equals(n)||price.getText().equals(n)||total_amount.getText().equals(n)){
        JOptionPane.showMessageDialog(null,"please enter all the details");
       
    }
    else{
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
           String bn =  String.valueOf(bike_name.getSelectedItem());
           String mn = String.valueOf(model_name.getSelectedItem());
           String cr =String.valueOf(color.getSelectedItem());
           String eg = engine.getText();

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
                updatestmt.setDouble(1, quantity1+q1);
                updatestmt.setDouble(2, price1);
                updatestmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"bike updated");
           }
        else{
            ps = connection.prepareStatement("insert into bike_details(bike_name , model_name , color , engine , quantity , price) values(?,?,?,?,?,?)");
        
            ps.setObject(1,bn);
            ps.setObject(2,mn); 
            ps.setObject(3,cr);
            ps.setString(4, eg);
            ps.setDouble(5,quantity1);
            ps.setDouble(6,price1);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Bike added succesfully");
        }
             
        connection.close();
    }catch(Exception e){
        System.out.println(e);

    }
    i = true;
   
       

    
           if(i){
            dispose();
            new Bike().setVisible(true);
            bike_name.setSelectedItem("SELECT");
            model_name.setSelectedItem("SELECT");
            color.setSelectedItem("SELECT");
            engine.setText("");
            quantity.setText("");
            price.setText("");
            
            
           
        }
        else{
             JOptionPane.showMessageDialog(AddBikes.this,"error");
        }





      


       
        
        
       
        
    }
}                                      

   
    private void total_amountMouseEntered(java.awt.event.MouseEvent evt) {                                          
        double quantity1 = Double.parseDouble(quantity.getText());
        double price1 = Double.parseDouble(price.getText());
        
        double calculate = price1 * quantity1;
        
        total_amount.setText(String.valueOf(calculate));
    }                                         

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) { 
        dispose();                                       
        new Bike().setVisible(true);
    }
    public static void main(String[] args) {
        new AddBikes().setVisible(true);
    }                                       

  
  

    // Variables declaration - do not modify                     
    private javax.swing.JButton addbtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel bg_image;
    private javax.swing.JLabel bike_n;
    private javax.swing.JComboBox<String> bike_name;
    private javax.swing.JLabel clr;
    private javax.swing.JComboBox<String> color;
    private javax.swing.JPanel container;
    private javax.swing.JTextField engine;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel model_n;
    private javax.swing.JComboBox<String> model_name;
    private javax.swing.JLabel pric;
    private javax.swing.JTextField price;
    private javax.swing.JLabel quant;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel t_amount;
    private javax.swing.JTextField total_amount;
    public Connection connection;
    public PreparedStatement ps;
    double q1;
    String co;
    String m;
    String e;
    String b;
    int id;
    double p;

   
    
    
    // End of variables declaration                   
}
