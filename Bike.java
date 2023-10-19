public class Bike extends javax.swing.JFrame {

    public Bike() {
        initComponents();
    }                         
    private void initComponents() {

        bg_container = new javax.swing.JPanel();
        container = new javax.swing.JPanel();
        add_bikebtn = new javax.swing.JButton();
        view_bikebtn = new javax.swing.JButton();
        sales_recordbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        bgimage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bike");
        setModalExclusionType(null);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(715, 475));
        getContentPane().setLayout(null);

        bg_container.setLayout(null);
        getContentPane().add(bg_container);
        bg_container.setBounds(6, 406, 1274, 0);

        container.setBackground(new java.awt.Color(0,0,0,80));

        add_bikebtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add_bikebtn.setText("ADD BIKE");
        add_bikebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bikebtnActionPerformed(evt);
            }
        });

        view_bikebtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        view_bikebtn.setText("VIEW BIKE");
        view_bikebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_bikebtnActionPerformed(evt);
            }
        });

        sales_recordbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sales_recordbtn.setText("SALES RECORD");
        sales_recordbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                sales_recordbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(add_bikebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(view_bikebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addComponent(sales_recordbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_bikebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(view_bikebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sales_recordbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(container);
        container.setBounds(0, 0, 760, 70);

        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn);
        backbtn.setBounds(310, 330, 120, 30);

        bgimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("image/desktop_banner_new.jpg"))); // NOI18N
        getContentPane().add(bgimage);
        bgimage.setBounds(0, 0, 758, 400);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(290, 310, 140, 60);

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(758, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void add_bikebtnActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();                                            
        new AddBikes().setVisible(true);
    }                                           

    private void sales_recordbtnActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        dispose();
        new Sales().setVisible(true);
    }                                               

    private void view_bikebtnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        dispose();
       new ViewBikes().setVisible(true);
    }                                            

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) { 
        dispose();                                       
        new  LoginPage().setVisible(true);
    } 
                                         
 
    
   

    // Variables declaration - do not modify                     
    private javax.swing.JButton add_bikebtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JPanel bg_container;
    private javax.swing.JLabel bgimage;
    private javax.swing.JPanel container;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sales_recordbtn;
    private javax.swing.JButton view_bikebtn;
    // End of variables declaration                   
}
