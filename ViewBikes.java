/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author kuldeep
 */
public class ViewBikes extends javax.swing.JFrame {

    /**
     * Creates new form ViewBikes
     */
    public ViewBikes() {
         jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewtbl = new javax.swing.JTable();
        backbtn = new javax.swing.JButton();
        removebtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        purchasebtn1 = new javax.swing.JButton();
        editbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(758, 400));
        getContentPane().setLayout(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(274, 381, 464, 387);

        viewtbl.setAutoCreateRowSorter(true);
        viewtbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bike_id", "Bike_name", "Model_name", "Color", "Engine", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewtbl.setRowSelectionAllowed(true);
        viewtbl.getTableHeader().setReorderingAllowed(false);
        
        jScrollPane1.setViewportView(viewtbl);
        viewtbl.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (viewtbl.getColumnModel().getColumnCount() > 0) {
            viewtbl.getColumnModel().getColumn(0).setResizable(false);
            viewtbl.getColumnModel().getColumn(1).setResizable(false);
            viewtbl.getColumnModel().getColumn(2).setResizable(false);
            viewtbl.getColumnModel().getColumn(3).setResizable(false);
            viewtbl.getColumnModel().getColumn(4).setResizable(false);
            viewtbl.getColumnModel().getColumn(5).setResizable(false);
            viewtbl.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(-1, 50, 760, 280);

        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn);
        backbtn.setBounds(10, 10, 90, 29);

        

        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchbtn);
        searchbtn.setBounds(650, 10, 90, 30);

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(511, 10, 120, 30);

        purchasebtn1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        purchasebtn1.setText("PURCHASE");
        purchasebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchasebtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(purchasebtn1);
        purchasebtn1.setBounds(630, 340, 120, 30);

        editbtn1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        editbtn1.setText("EDIT");
        editbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(editbtn1);
        editbtn1.setBounds(10, 340, 120, 30);

        setSize(new java.awt.Dimension(772, 414));
        setLocationRelativeTo(null);

        connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/showroom","root","k1010");
            
            Statement st = connection.createStatement();
            

            ResultSet rs = st.executeQuery("select * from bike_details");
            

             
               
            while(rs.next()){
               id= String.valueOf(rs.getInt("bike_id"));
                String bike_name = rs.getString("bike_name");
                String model_name = rs.getString("model_name");
                String color = rs.getString("color");
                String engine = rs.getString("engine");
                quantity = String.valueOf(rs.getDouble("quantity"));
                String  price = String.valueOf(rs.getDouble("price"));
              

                String tblData[] = {id,bike_name,model_name,color,engine,quantity,price};
                tableModel = (DefaultTableModel)
                viewtbl.getModel();
                tableModel.addRow(tblData);
                

            }   
    connection.close();
            
        }catch(Exception e){
            System.out.println(e);

        }
        
        setResizable(false);
        setUndecorated(true);
    
    }

   
    
                                       

                                          

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) { 

        dispose();                                       
        new Bike().setVisible(true);
    }                                       

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {                                          


    }                                         

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
    }                                      

    private void purchasebtn1ActionPerformed(java.awt.event.ActionEvent evt) {
        selectedrow = viewtbl.getSelectedRow();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/showroom","root","k1010");
            if (selectedrow != -1) {
                String quantityStr = (String) viewtbl.getValueAt(selectedrow, 5);
                double quantityValue = Double.parseDouble(quantityStr);
                
                if (quantityValue > 0) {
                    id = (String) viewtbl.getValueAt(selectedrow, 0);
                    
                    PreparedStatement ps = connection.prepareStatement("UPDATE bike_details SET quantity = ? WHERE bike_id = ?");
                    ps.setDouble(1, quantityValue - 1);
                    ps.setString(2, id);
                    ps.executeUpdate();
                    
                    JOptionPane.showMessageDialog(null, "Bike selected");
                    dispose();
                    new Customer().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Bike is out of stock");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select a bike");
            }
            
            



        }catch(Exception e){
            System.out.println(e);

        }

                                                     
        
    }                                            

    private void editbtn1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        selectedrow = viewtbl.getSelectedRow();
        if (selectedrow != -1){
            dispose();
            new Update().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a bike");

        }
    }                                        

    
    

   public static void main(String[] args) {
    new ViewBikes().setVisible(true);
   }                     
    private javax.swing.JButton backbtn;
    private javax.swing.JButton editbtn1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton purchasebtn1;
    private javax.swing.JButton removebtn;
    private javax.swing.JTextField search;
    private javax.swing.JButton searchbtn;
   
    // End of variables declaration                   
    private Connection connection;
    public static javax.swing.JTable viewtbl;
    static String id;               
    static String quantity;   
    Object quan1;
      DefaultTableModel tableModel;
      public int selectedrow;
}
