import java.awt.Color;

import javax.swing.JOptionPane;
public class LoginPage extends javax.swing.JFrame {

   
    public LoginPage() {
         bg_panel = new javax.swing.JPanel();
        container = new javax.swing.JPanel();
        user_n = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        show_password = new javax.swing.JCheckBox();
        loginbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        bg_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);
       

        bg_panel.setBackground(new java.awt.Color(255, 255, 255));
        bg_panel.setLayout(null);

        container.setBackground(new java.awt.Color(255, 255, 255,80));
        container.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        container.setOpaque(false);

        user_n.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user_n.setForeground(new java.awt.Color(255, 255, 255));
        user_n.setText("Username");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");

        username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(153, 153, 153));
        username.setText("Enter Username"); // NOI18N
        username.setToolTipText("");
        username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usernameMouseEntered(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(0,0,0));

        show_password.setBackground(new java.awt.Color(255, 255, 255,80));
        show_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        show_password.setForeground(new java.awt.Color(255, 255, 255));
        show_password.setText("Show Password");
        show_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_passwordActionPerformed(evt);
            }
        });

        loginbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        cancelbtn.setBackground(new java.awt.Color(255, 51, 51));
        cancelbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(user_n, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addComponent(password)
                        .addComponent(show_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_n, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(show_password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        bg_panel.add(container);
        container.setBounds(150, 90, 440, 230);
        container.setOpaque(false);
        show_password.setOpaque(false);
        password.setEchoChar('*');

        bg_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/desktop_banner_new.jpg"))); // NOI18N
        bg_panel.add(bg_image);
        bg_image.setBounds(0, 0, 760, 400);

        getContentPane().add(bg_panel);
        bg_panel.setBounds(0, 0, 760, 400);

        setSize(new java.awt.Dimension(760, 400));
        setLocationRelativeTo(null);
        
    }

    
              

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
       String name=username.getText();
		char ch[]=password.getPassword();
		String passwrd=String.valueOf(ch);
			if(name.equals("ssism")&&passwrd.equals("123")){
                dispose();
				java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Bike().setVisible(true);
                    }
                }); 

				
				
			}else{
				JOptionPane.showMessageDialog(LoginPage.this,"Sorry, username or password error!");
				username.setText("");
             password.setText("");
            } 
    }                                        

    
    private void usernameFocusGained(java.awt.event.FocusEvent evt) {                                     
        
       if(username.getText().equals("Enter Username")){
            username.setText("");
            username.setForeground(new Color(153,153,153));
        }
        else{
            username.setText("Enter USERNAME");
      }
    }                                    

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {                                   
        // if(username.getText().equals("")){
        //     username.setText("Enter Username");
        //     username.setForeground(new Color(153,153,153));
        // }
        // else{
        //     username.setText("");
            
        // }
    }                                  
       
    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {                                      
     username.setText("");
     username.setFont(new java.awt.Font("Tahoma",1,14));
     username.setForeground(new Color(0,0,0));
     
        
    }                                     

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        System.exit(0);
    }                                         

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void usernameMouseEntered(java.awt.event.MouseEvent evt) {                                      
        
    }                                     

    private void show_passwordActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if(show_password.isSelected()){
            password.setEchoChar((char)0);
        }
        else{
            password.setEchoChar('*');
        }
    }                                             

    

                        
    private javax.swing.JLabel bg_image;
    private javax.swing.JPanel bg_panel;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox show_password;
    private javax.swing.JLabel user_n;
    private javax.swing.JTextField username;
    // End of variables declaration                   
}
