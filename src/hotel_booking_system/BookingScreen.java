/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_booking_system;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Isaac
 */
public class BookingScreen extends javax.swing.JFrame {

    int ClientID = -1;
    String firstName = null;
    
    
    public BookingScreen() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        endDate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        adultCount = new javax.swing.JSpinner();
        startDateLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        endDateLabel = new javax.swing.JLabel();
        childrenCount = new javax.swing.JSpinner();
        buyButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        cost = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        startDate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        submit = new javax.swing.JToggleButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        error = new javax.swing.JLabel();
        back = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        secondNameRegisterField = new javax.swing.JTextField();
        firstNameRegisterField = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        password1RegisterField = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        password2RegisterField = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        emailRegisterField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jTabbedPane1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseMoved(evt);
            }
        });

        endDate.setText("end date");

        jButton2.setText("Log Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        adultCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        adultCount.setName(""); // NOI18N

        startDateLabel.setText("(startDate)");

        jLabel1.setText("number of people:");

        endDateLabel.setText("(endDate)");

        childrenCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        buyButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buyButton1.setText("Pay");
        buyButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("adults");

        welcomeLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        welcomeLabel.setText("");

        jLabel3.setText("children");

        jToggleButton1.setText("Account");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        cost.setText("(cost)");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Room type");

        startDate.setText("start date");

        jLabel4.setText("Cost:");

        loginButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(childrenCount, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(adultCount, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(startDate)
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(startDateLabel)
                                    .addComponent(endDateLabel)))
                            .addComponent(endDate)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cost)))
                        .addGap(36, 36, 36)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(0, 87, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buyButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jToggleButton1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLabel)
                    .addComponent(loginButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adultCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(childrenCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDate)
                    .addComponent(startDateLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endDate)
                    .addComponent(endDateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cost)
                            .addComponent(jLabel4))
                        .addGap(72, 72, 72)
                        .addComponent(jButton2))
                    .addComponent(buyButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Book a room", jPanel3);

        jLabel6.setText("Password:");

        submit.setText("login");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        error.setForeground(new java.awt.Color(255, 0, 0));
        error.setText("jLabel5");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setText("Login:");

        jLabel8.setText("Email:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                            .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(26, 26, 26)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(jPasswordField1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(error))
                            .addComponent(jLabel7))))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(error))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Login", jPanel1);

        jLabel9.setText("Second name:");

        jLabel10.setText("Password:");

        jLabel11.setText("Re enter Password:");

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setText("Register:");

        jLabel13.setText("Email:");

        message.setForeground(new java.awt.Color(255, 0, 0));
        message.setText(""
        );

        emailRegisterField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailRegisterFieldActionPerformed(evt);
            }
        });

        jLabel14.setText("First name:");

        jToggleButton5.setText("back");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel13))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(emailRegisterField)
                                        .addComponent(firstNameRegisterField)
                                        .addComponent(secondNameRegisterField)
                                        .addComponent(password1RegisterField)
                                        .addComponent(password2RegisterField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(message)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                            .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(emailRegisterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(firstNameRegisterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(secondNameRegisterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(password1RegisterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(password2RegisterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton)
                    .addComponent(message))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton5)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Register", jPanel2);

        jToggleButton2.setText("back");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("View Bookings");

        jToggleButton4.setText("Cancel Selected Booking");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jToggleButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton3)
                    .addComponent(jToggleButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Account", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        error.setText(null);
        if(ClientID == -1){
            welcomeLabel.setText(null);
        }
    }//GEN-LAST:event_formWindowActivated

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Menu main = new Menu();
        main.setVisible(true);
        main.close=true;
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
            String SQL = "DELETE FROM CURRENTSESSION";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        
        this.dispose();
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
//       clientLogin login = new clientLogin();
//       login.setVisible(true);

        jTabbedPane1.setSelectedIndex(1);


    }//GEN-LAST:event_loginButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
            String SQL = "DELETE FROM CURRENTSESSION";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        
        
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void buyButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyButton1ActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        updateUser();
    }//GEN-LAST:event_formMouseMoved

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String username = jTextField1.getText();
        String password = jPasswordField1.getText();

        if("".equals(username) || "".equals(password)){
            error.setText("Please fill in all credentials");
        }else if (!CheckValid()){
            error.setText("Username or Password is incorrect");
        }else if (CheckValid()){

            try{
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");

                String SQL = "DELETE FROM CURRENTSESSION";
                PreparedStatement ps = con.prepareStatement(SQL);
                ps.executeUpdate();

                PreparedStatement rs = con.prepareStatement("INSERT INTO CURRENTSESSION (CLIENTID) VALUES("+ClientID+")");
                rs.executeUpdate();
            }catch(SQLException e){
                System.out.println(e);
            }

            JOptionPane.showMessageDialog(null, "Successfully logged in");
            jTextField1.setText(null);
            jPasswordField1.setText(null);
            
            jTabbedPane1.setSelectedIndex(0);

        }

    }//GEN-LAST:event_submitActionPerformed

    public boolean CheckValid(){
        
        String username = jTextField1.getText();
        String password = jPasswordField1.getText();
        //connection 
        //jdbc:derby://localhost:1527/Hotel_Booking_System

        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");

            Statement stmt =  con.createStatement();

            
            //prints out all customer in the table
            String SQL = "SELECT * FROM ISAAC.CLIENTDETAILS";
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next()){
                String usernameCheck = rs.getString("EMAILADDRESS");
                String passwordCheck = rs.getString("PASSWORD");
                if(username.equals(usernameCheck) && password.equals(passwordCheck)){
                    ClientID = rs.getInt(1);
                    return true;
                }
                
            }
            
        } catch (SQLException e){
            System.out.println(e);
        }
        
        return false;
    }
    
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        OUTER:
        if(!checkFields()){
            message.setText("please fill in all fields");
            break OUTER;
        }else if (!checkPassword()){
            message.setText("passwords Do not match");
            break OUTER;
        }else if (!checkEmail()){
            message.setText("email format is incorrect");
            break OUTER;
        }else  if(checkPassword()) {
            message.setText("");
            //code to put this new user into the database

            try{

                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");

                String SQL = "INSERT INTO ClientDetails (CLIENTID, FIRSTNAME, SECONDNAME, EMAILADDRESS, PASSWORD)values(?, ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(SQL);

                //getting the max clientid value and adding one to create a new primary key
                Statement stmt =  con.createStatement();
                String maxId = "SELECT * FROM ClientDetails WHERE CLIENTID = (SELECT MAX(CLIENTID) FROM ClientDetails)";
                ResultSet rs = stmt.executeQuery(maxId);
                int id = 0;
                if(rs.next()){
                    id = rs.getInt(1)+1;
                }

                //replacing the '?' in the String SQL with the values in the fields

                Client newClient = new Client(firstNameRegisterField.getText(), secondNameRegisterField.getText()
                        , emailRegisterField.getText(), password1RegisterField.getText());

                ps.setString(1, Integer.toString(id));
                ps.setString(2, newClient.getFirstName());
                ps.setString(3, newClient.getUsername());
                ps.setString(4, newClient.getEmailAddress());
                ps.setString(5, newClient.getPassword());

                //putting them in the table
                ps.executeUpdate();

            }catch (SQLException e){
                System.out.println(e);
            }
            // -----------------

            JOptionPane.showMessageDialog(null, "Successfully created new user");
            firstNameRegisterField.setText(null);
            secondNameRegisterField.setText(null);
            emailRegisterField.setText(null);
            password1RegisterField.setText(null);
            password2RegisterField.setText(null);
            
            
            jTabbedPane1.setSelectedIndex(1);
        }

    }//GEN-LAST:event_registerButtonActionPerformed

    public boolean checkFields(){
        if("".equals(emailRegisterField.getText()) || "".equals(firstNameRegisterField.getText()) || firstNameRegisterField.getText().equals(null) || "".equals(secondNameRegisterField.getText())
                || "".equals(password1RegisterField.getText()) || "".equals(password2RegisterField.getText())){
            return false;
        }
        return true;
    }
    
    public boolean checkPassword(){
        if(password1RegisterField.getText().equals(password2RegisterField.getText())){
            return true;
        }
        return false;
    }
    
    public boolean checkEmail(){
        
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$");
        Matcher matcher = pattern.matcher(emailRegisterField.getText());
        
        if(matcher.matches()){
            return true;
        }else{
            return false;
        }
    }
    
    
    private void emailRegisterFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailRegisterFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailRegisterFieldActionPerformed

    private void jTabbedPane1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseMoved
        updateUser();
    }//GEN-LAST:event_jTabbedPane1MouseMoved

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingScreen().setVisible(true);
            }
        });
    }
    
    
    public void updateUser(){
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
            Statement stmt =  con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM CURRENTSESSION");
            
            if(rs.next()){
                ClientID = rs.getInt(1);
            }
            String SQL = "SELECT * FROM ISAAC.CLIENTDETAILS WHERE CLIENTID="+ClientID;
            rs = stmt.executeQuery(SQL);
            
            if(rs.next()){
              firstName = rs.getString(2);  
            }
            
            if(firstName != null){
                welcomeLabel.setText("Welcome:  "+firstName);
            }
            
        }catch(SQLException e){
            System.out.println(e);
            
        }
        
        
        
        
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner adultCount;
    private javax.swing.JToggleButton back;
    private javax.swing.JButton buyButton1;
    private javax.swing.JSpinner childrenCount;
    private javax.swing.JLabel cost;
    private javax.swing.JTextField emailRegisterField;
    private javax.swing.JButton endDate;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JLabel error;
    private javax.swing.JTextField firstNameRegisterField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel message;
    private javax.swing.JPasswordField password1RegisterField;
    private javax.swing.JPasswordField password2RegisterField;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField secondNameRegisterField;
    private javax.swing.JButton startDate;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JToggleButton submit;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
