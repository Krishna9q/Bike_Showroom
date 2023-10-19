/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author kuldeep
 */
public class Update extends javax.swing.JFrame {

    /**
     * Creates new form Update
     */
    public Update() {
        
        
        jPanel1 = new javax.swing.JPanel();
        container = new javax.swing.JPanel();
        bike_n = new javax.swing.JLabel();
        model_n = new javax.swing.JLabel();
        quant = new javax.swing.JLabel();
        pric = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        clr = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        engine = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        model_name = new javax.swing.JTextField();
        bike_name = new javax.swing.JTextField();
        color = new javax.swing.JTextField();
        updatebtn = new javax.swing.JButton();
        bg_image = new javax.swing.JLabel();
        selectedrow = ViewBikes.viewtbl.getSelectedRow();

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

        container.setBackground(new java.awt.Color(0,0,0,80));

        bike_n.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bike_n.setForeground(new java.awt.Color(255, 255, 255));
        bike_n.setText("BIKE NAME");

        model_n.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        model_n.setForeground(new java.awt.Color(255, 255, 255));
        model_n.setText("MODEL NAME");

        quant.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        quant.setForeground(new java.awt.Color(255, 255, 255));
        quant.setText("QUANTITY");

        pric.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        pric.setForeground(new java.awt.Color(255, 255, 255));
        pric.setText("PRICE");

        quantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        clr.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        clr.setForeground(new java.awt.Color(255, 255, 255));
        clr.setText("COLOR");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENGINE");

        engine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        bike_name.setFont(new java.awt.Font("Tahoma", 1, 14));
        model_name.setFont(new java.awt.Font("Tahoma", 1, 14));
        color.setFont(new java.awt.Font("Tahoma", 1, 14));
        price.setFont(new java.awt.Font("Tahoma", 1, 14));
       

        updatebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent e){
                updatebtnActionPerfomed(e);
            }

            
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quant, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(containerLayout.createSequentialGroup()
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bike_n, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pric, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(model_n, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(price)
                                    .addComponent(model_name)
                                    .addComponent(bike_name))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clr, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(engine, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(color))
                        .addGap(40, 40, 40))))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtn)
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bike_n, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clr, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bike_name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(color))
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(model_n, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(engine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(model_name, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quant, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pric, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        getContentPane().add(container);
        container.setBounds(0, 0, 760, 400);

        bg_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/desktop_banner_new.jpg"))); // NOI18N
        getContentPane().add(bg_image);
        bg_image.setBounds(0, 0, 758, 400);

        setSize(new java.awt.Dimension(754, 398));
        setLocationRelativeTo(null);


        if(selectedrow !=-1){

            id = Integer.parseInt((String) ViewBikes.viewtbl.getValueAt(selectedrow, 0));



            
   
           String bike_name1 = (String) ViewBikes.viewtbl.getValueAt(selectedrow, 1);
           bike_name.setText(bike_name1);
           
   
           String modelname = (String)ViewBikes.viewtbl.getValueAt(selectedrow, 2);
           model_name.setText(modelname);
           
   
           String color1 = (String) ViewBikes.viewtbl.getValueAt(selectedrow, 3);
           color.setText(color1);
           
   
           String engine1 = (String) ViewBikes.viewtbl.getValueAt(selectedrow, 4);
               engine.setText(engine1);


               double q = Double.parseDouble((String)ViewBikes.viewtbl.getValueAt(selectedrow, 5));
               String q1 = String.format("%.2f",q);
               quantity.setText(q1);
              
   
              
               double price1 = Double.parseDouble((String) ViewBikes.viewtbl.getValueAt(selectedrow, 6));
       
              String priceText = String.format("%.2f", price1);
               price.setText(priceText);
        }



            
    }

  

    private void updatebtnActionPerfomed(ActionEvent e) {
        boolean i = false;
        connection = null;

       try{
        System.out.println("hello");
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/showroom","root","k1010");
        PreparedStatement ps = connection.prepareStatement("update bike_details set bike_name = ?,model_name = ?,color = ?,engine = ?,price = ?,quantity = ? where bike_id ="+id);
        ps.setString(1,bike_name.getText());
        ps.setString(2,model_name.getText());
        ps.setString(3,color.getText());
        ps.setString(4,engine.getText());
        ps.setDouble(5,Double.parseDouble(price.getText()));
        ps.setDouble(6,Double.parseDouble(quantity.getText()));
        ps.executeUpdate();
        i=true;

        if(i){
            JOptionPane.showMessageDialog(null,"Updated");
            dispose();
            new Bike().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null," not Updated");
        }

       }catch(Exception e1){

       }



    }
                           

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {  
        dispose();                                      
        new Bike().setVisible(true);
    }                                       
    
   
    private Connection connection;             
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel bg_image;
    private javax.swing.JLabel bike_n;
    private javax.swing.JTextField bike_name;
    private javax.swing.JLabel clr;
    private javax.swing.JTextField color;
    private javax.swing.JPanel container;
    private javax.swing.JTextField engine;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel model_n;
    private javax.swing.JTextField model_name;
    private javax.swing.JLabel pric;
    private javax.swing.JTextField price;
    private javax.swing.JLabel quant;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton updatebtn;
    public int selectedrow;
    int id;
                    
}

