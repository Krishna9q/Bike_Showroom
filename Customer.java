import java.sql.*;
import javax.swing.JOptionPane;


public class Customer extends javax.swing.JFrame {

   
    public Customer() {
        panel = new javax.swing.JPanel();
        clr = new javax.swing.JPanel();
        customer_n = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        pric = new javax.swing.JLabel();
        mobile_n = new javax.swing.JLabel();
        adrs = new javax.swing.JLabel();
        customer_name = new javax.swing.JTextField();
        mobile_number = new javax.swing.JTextField();
        email_id = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        bike_n = new javax.swing.JLabel();
        model_n = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        engi = new javax.swing.JLabel();
        bike_name = new javax.swing.JTextField();
        model_name = new javax.swing.JTextField();
        color = new javax.swing.JTextField();
        engine = new javax.swing.JTextField();
        donebtn = new javax.swing.JButton();
        pay_type = new javax.swing.JLabel();
        payment_type = new javax.swing.JComboBox<>();
        printbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        bike_i = new javax.swing.JLabel();
        bike_id = new javax.swing.JTextField();
        bg_image = new javax.swing.JLabel();
        selectedrow = ViewBikes.viewtbl.getSelectedRow();
        
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer_details");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        panel.setLayout(null);

        clr.setBackground(new java.awt.Color(0,0,0,80));
        clr.setMaximumSize(new java.awt.Dimension(125, 35));
        clr.setMinimumSize(new java.awt.Dimension(125, 35));

        customer_n.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customer_n.setForeground(new java.awt.Color(255, 255, 255));
        customer_n.setText("Customer name");
        customer_n.setMaximumSize(new java.awt.Dimension(125, 35));
        customer_n.setMinimumSize(new java.awt.Dimension(125, 35));

        email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Email Id");
        email.setMaximumSize(new java.awt.Dimension(125, 35));
        email.setMinimumSize(new java.awt.Dimension(125, 35));

        pric.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pric.setForeground(new java.awt.Color(255, 255, 255));
        pric.setText("Price");
        pric.setMaximumSize(new java.awt.Dimension(125, 35));
        pric.setMinimumSize(new java.awt.Dimension(125, 35));

        mobile_n.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mobile_n.setForeground(new java.awt.Color(255, 255, 255));
        mobile_n.setText("Mobile number");
        mobile_n.setMaximumSize(new java.awt.Dimension(125, 35));
        mobile_n.setMinimumSize(new java.awt.Dimension(125, 35));

        adrs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adrs.setForeground(new java.awt.Color(255, 255, 255));
        adrs.setText("Address");
        adrs.setMaximumSize(new java.awt.Dimension(125, 35));
        adrs.setMinimumSize(new java.awt.Dimension(125, 35));

        customer_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        mobile_number.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        email_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        email_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_idActionPerformed(evt);
            }
        });

        address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                priceMouseEntered(evt);
            }
        });

        bike_n.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bike_n.setForeground(new java.awt.Color(255, 255, 255));
        bike_n.setText("Bike name");
        bike_n.setMaximumSize(new java.awt.Dimension(125, 35));
        bike_n.setMinimumSize(new java.awt.Dimension(125, 35));

        model_n.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        model_n.setForeground(new java.awt.Color(255, 255, 255));
        model_n.setText("Model name");
        model_n.setMaximumSize(new java.awt.Dimension(125, 35));
        model_n.setMinimumSize(new java.awt.Dimension(125, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Color");
        jLabel3.setMaximumSize(new java.awt.Dimension(125, 35));
        jLabel3.setMinimumSize(new java.awt.Dimension(125, 35));

        engi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        engi.setForeground(new java.awt.Color(255, 255, 255));
        engi.setText("Engine");
        engi.setMaximumSize(new java.awt.Dimension(125, 35));
        engi.setMinimumSize(new java.awt.Dimension(125, 35));

        bike_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bike_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bike_nameMouseEntered(evt);
            }
        });
        bike_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bike_nameActionPerformed(evt);
            }
        });

        model_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        model_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                model_nameMouseEntered(evt);
            }
        });

        color.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colorMouseEntered(evt);
            }
        });

        engine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        engine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                engineMouseEntered(evt);
            }
        });

        donebtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        donebtn.setText("Done");
        donebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donebtnActionPerformed(evt);
            }
        });
       

        pay_type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pay_type.setForeground(new java.awt.Color(255, 255, 255));
        pay_type.setText("Payment type");
        pay_type.setMaximumSize(new java.awt.Dimension(125, 35));
        pay_type.setMinimumSize(new java.awt.Dimension(125, 35));

        payment_type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        payment_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "CASH", "EMI", "UPI", "CREDIT CARD" }));
        payment_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                payment_typeActionPerformed(evt);   
                
            }
        });

        printbtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        printbtn.setText("Print");
        printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbtnActionPerformed(evt);
            }
        });
        printbtn.setEnabled(false);

        backbtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        bike_i.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bike_i.setForeground(new java.awt.Color(255, 255, 255));
        bike_i.setText("Bike Id");

        bike_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bike_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bike_idMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout clrLayout = new javax.swing.GroupLayout(clr);
        clr.setLayout(clrLayout);
        clrLayout.setHorizontalGroup(
            clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clrLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bike_i, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customer_n, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addComponent(mobile_n, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addComponent(adrs, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                    .addComponent(pric, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customer_name, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(mobile_number)
                    .addComponent(email_id)
                    .addComponent(address)
                    .addComponent(price)
                    .addComponent(bike_id))
                .addGap(38, 38, 38)
                .addGroup(clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clrLayout.createSequentialGroup()
                        .addGroup(clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bike_n, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(model_n, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(engi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pay_type, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addGroup(clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bike_name, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addComponent(model_name)
                                .addComponent(color)
                                .addComponent(engine))
                            .addComponent(payment_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(clrLayout.createSequentialGroup()
                        .addComponent(donebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addGroup(clrLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        clrLayout.setVerticalGroup(
            clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clrLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clrLayout.createSequentialGroup()
                        .addGroup(clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customer_n, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(customer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bike_n, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(model_name)
                            .addComponent(mobile_n, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(mobile_number)
                            .addComponent(model_n, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(color, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(email_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adrs, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(engi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bike_name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(clrLayout.createSequentialGroup()
                                .addGroup(clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pay_type, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(payment_type, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clrLayout.createSequentialGroup()
                                .addGroup(clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bike_i, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bike_id, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(clrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pric, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(donebtn)
                                    .addComponent(printbtn)))))
                    .addComponent(engine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        panel.add(clr);
        clr.setBounds(0, 0, 760, 400);

        bg_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/desktop_banner_new.jpg"))); // NOI18N
        panel.add(bg_image);
        bg_image.setBounds(0, 0, 760, 400);

        getContentPane().add(panel);
        panel.setBounds(0, 0, 760, 400);

        setSize(new java.awt.Dimension(760, 402));
        setLocationRelativeTo(null);

        if(selectedrow !=-1){
            int id = Integer.parseInt((String) ViewBikes.viewtbl.getValueAt(selectedrow, 0));
            String id1 = String.valueOf(id);
           bike_id.setText(id1);
           bike_id.setEditable(false);

        String bike_name1 = (String) ViewBikes.viewtbl.getValueAt(selectedrow, 1);
        engine.setText(bike_name1);
        engine.setEditable(false);

        String modelname = (String)ViewBikes.viewtbl.getValueAt(selectedrow, 2);
        model_name.setText(modelname);
        model_name.setEditable(false);

        String color1 = (String) ViewBikes.viewtbl.getValueAt(selectedrow, 3);
        color.setText(color1);
        color.setEditable(false);

        String engine1 = (String) ViewBikes.viewtbl.getValueAt(selectedrow, 4);
            bike_name.setText(engine1);
            bike_name.setEditable(false);

           
            double price1 = Double.parseDouble((String) ViewBikes.viewtbl.getValueAt(selectedrow, 6));
    
           String priceText = String.format("%.2f", price1);
            price.setText(priceText);
            price.setEditable(false);

            

    }





        
    }

              

    public  void backbtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        dispose();
        new Bike().setVisible(true);
    }                                       

    public  void email_idActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    public void bike_nameActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         
    int a;
String n="";
String sel="SELECT";
    public  void donebtnActionPerformed(java.awt.event.ActionEvent evt) {
                                                
        
    boolean b=payment_type.getSelectedItem().equals(sel);      

        if(customer_name.getText().equals(n)||email_id.getText().equals(n)||mobile_number.getText().equals(n)||address.getText().equals(n)||b==true){
            
            JOptionPane.showMessageDialog(null,"please enter all the details");
            

            
        }
        else{
            
         

            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/showroom","root","k1010");
                PreparedStatement ps = con.prepareStatement("insert into customer(customer_name,mobile_number,email,address,payment_type,bike_id) values(?,?,?,?,?,?)");
                ps.setString(1, customer_name.getText());
                ps.setString(2, mobile_number.getText());
                ps.setString(3, email_id.getText());
                ps.setString(4, address.getText());
                ps.setObject(5, payment_type.getSelectedItem());
                ps.setString(6,bike_id.getText());
                ps.executeUpdate();




              PreparedStatement psC = con.prepareStatement("select customer_id,customer_name,bike_id from customer where customer_name ="+"'"+customer_name.getText()+"'");
              ResultSet rsc = psC.executeQuery();

              while(rsc.next()){
                Customer_id = rsc.getInt("customer_id");
                Bike_id = rsc.getInt("bike_id");
                
              }


                
                PreparedStatement ps1 = con.prepareStatement("insert into sale(sale_date,bike_id,customer_id,invoice_number) values(?,?,?,?)");
                java.util.Date d = new java.util.Date();
                 int invoic = Integer.valueOf(Invoice.in_n);
                
                
                
                Customer c = new Customer();
                ps1.setTimestamp(1, new java.sql.Timestamp(d.getTime()));
                ps1.setInt(2,c.Bike_id);
                ps1.setInt(3,c.Customer_id);
                ps1.setInt(4,invoic);
                ps1.executeUpdate();
    
              
                     
                con.close();
             
              

            }catch(Exception e){
                
            }

            JOptionPane.showMessageDialog(null,"saved successfully");
            printbtn.setEnabled(true);
           
            
           
            
        }
    }  
    
    public  void bike_idMouseEntered(java.awt.event.MouseEvent evt) {                                     
        
    }   

    public  void bike_nameMouseEntered(java.awt.event.MouseEvent evt) {                                       
        
    }                                      

    public  void model_nameMouseEntered(java.awt.event.MouseEvent evt) {                                        
       
    }                                       

    public void colorMouseEntered(java.awt.event.MouseEvent evt) {                                   
         
    }                                  

    public void engineMouseEntered(java.awt.event.MouseEvent evt) {                                    
       
    }                                   

    public  void priceMouseEntered(java.awt.event.MouseEvent evt) {                                   
        




        
    }                                  

    public  void payment_typeActionPerformed(java.awt.event.ActionEvent evt) {  
        

        
                                              
        
    }                                            

    public  void printbtnActionPerformed(java.awt.event.ActionEvent evt) {
          new Invoice(Customer_id, customer_name.getText());
          dispose();
        new Bike().setVisible(true);
     
       

       
        
        
    } 

    

   
                                            

                                     

   

    // Variables declaration - do not modify                     
    public static javax.swing.JTextField address;
    public static javax.swing.JLabel adrs;
    public static javax.swing.JButton backbtn;
    public static javax.swing.JLabel bg_image;
    public static javax.swing.JLabel bike_i;
    public static javax.swing.JTextField bike_id;
    public static javax.swing.JLabel bike_n;
    public static javax.swing.JTextField bike_name;
    public static javax.swing.JPanel clr;
    public static javax.swing.JTextField color;
    public static javax.swing.JLabel customer_n;
    public static javax.swing.JTextField customer_name;
    public static javax.swing.JButton donebtn;
    public static javax.swing.JLabel email;
    public static javax.swing.JTextField email_id;
    public static javax.swing.JLabel engi;
    public static javax.swing.JTextField engine;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel mobile_n;
    public static javax.swing.JTextField mobile_number;
    public static javax.swing.JLabel model_n;
    public static javax.swing.JTextField model_name;
    public static javax.swing.JPanel panel;
    public javax.swing.JLabel pay_type;
    public javax.swing.JComboBox<String> payment_type;
    public static javax.swing.JLabel pric;
    public static javax.swing.JTextField price;
    public static javax.swing.JButton printbtn;
    public int selectedrow;
     public int Customer_id;
     public int Bike_id;
     public String pay;
     public String p;
    // End of variables declaration                   
Connection con;
}
