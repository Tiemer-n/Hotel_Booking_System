
package hotel_booking_system;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Admin_consol extends javax.swing.JFrame {


    public Admin_consol() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        logout = new javax.swing.JToggleButton();
        editBooking = new javax.swing.JToggleButton();
        error = new javax.swing.JLabel();
        viewAdmin = new javax.swing.JToggleButton();
        viewUsers = new javax.swing.JToggleButton();
        viewBookings = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        deleteAdmin = new javax.swing.JToggleButton();
        deleteUser = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        maxSleepingCount = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        roomTypeName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        numberOfRooms = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        adultCost = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        childCost = new javax.swing.JSpinner();
        saveButton = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        roomTypes = new javax.swing.JComboBox<>();
        Close = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        hotelName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        numberOfRooms1 = new javax.swing.JSpinner();
        AddButton1 = new javax.swing.JToggleButton();
        addExsistingRoomType = new javax.swing.JToggleButton();
        jLabel16 = new javax.swing.JLabel();
        bedLabel = new javax.swing.JLabel();
        numberOfBeds = new javax.swing.JSpinner();
        countLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        password1 = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        AddButton = new javax.swing.JToggleButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        password2 = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(463, 415));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setInheritsPopupMenu(true);

        logout.setText("LogOut");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        editBooking.setText("Edit Bookings");

        error.setForeground(new java.awt.Color(255, 0, 0));
        error.setText("jLabel2");
        error.setText(null);

        viewAdmin.setText("View Admins");

        viewUsers.setText("View Users");

        viewBookings.setText("View Bookings");

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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Admin Consol");

        deleteAdmin.setText("Delete Admins");

        deleteUser.setText("Delete Users");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(viewAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewUsers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewBookings)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteUser))
                            .addComponent(error)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editBooking))
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewAdmin)
                    .addComponent(viewUsers)
                    .addComponent(viewBookings)
                    .addComponent(deleteAdmin)
                    .addComponent(deleteUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBooking)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Admin Consol", jPanel1);

        jLabel5.setText("Amount of beds in room:");

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Amount of people the can sleep in that room:");

        maxSleepingCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));

        jLabel6.setText("(Including couples)");

        jLabel7.setText("Room type name:");

        jLabel8.setText("Amount of rooms with this type in the hotel:");

        numberOfRooms.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));

        jLabel9.setText("Child Cost per night:");

        adultCost.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        jLabel10.setText("Adult cost per night:");

        childCost.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setText("Add room with exsisting type:");

        jLabel12.setText("(keep as 0 if no rooms are to be created )");

        roomTypes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roomTypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypesActionPerformed(evt);
            }
        });

        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        jLabel13.setText("Type:");

        jLabel14.setText("Amount to be added:");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setText("Hotel Name:");

        numberOfRooms1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));

        AddButton1.setText("Add");
        AddButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton1ActionPerformed(evt);
            }
        });

        addExsistingRoomType.setText("Add");
        addExsistingRoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExsistingRoomTypeActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel16.setText("Add room type:");

        bedLabel.setText("Amount of beds:");

        numberOfBeds.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));

        countLabel.setText("Max sleeping count:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel7))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(roomTypeName)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(numberOfBeds, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                                        .addComponent(maxSleepingCount, javax.swing.GroupLayout.Alignment.LEADING))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel6)))
                                            .addGap(126, 126, 126))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)
                                                .addComponent(adultCost, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(20, 20, 20)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(AddButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(numberOfRooms))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel12))))
                                    .addComponent(hotelName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(childCost, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(roomTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bedLabel)
                                        .addGap(64, 64, 64)
                                        .addComponent(countLabel))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(addExsistingRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(numberOfRooms1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel15)
                .addGap(5, 5, 5)
                .addComponent(hotelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(childCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(adultCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(roomTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(numberOfBeds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(maxSleepingCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(numberOfRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(roomTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bedLabel)
                    .addComponent(countLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(numberOfRooms1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addExsistingRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Setup Hotel", jPanel2);

        AddButton.setText("Add admin");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        jLabel17.setText("Username");

        jLabel18.setText("Confirm Password");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("Add new Admin");

        jLabel19.setText("Password");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddButton)
                            .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(33, 33, 33)
                .addComponent(AddButton)
                .addContainerGap(488, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add new Admin", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean rootCheck = false;
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
            Statement stmt =  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
            String SQL = "SELECT * FROM hotelparameters";
            ResultSet rs = stmt.executeQuery(SQL);
            rs.next();
            
            hotelName.setText(rs.getString(1));
            childCost.setValue(rs.getDouble(2));
            adultCost.setValue(rs.getDouble(3));
            
            
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_formWindowActivated

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.close=true;
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            
    }//GEN-LAST:event_formWindowOpened

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
            
        //checking if what was entered if valid first
        OUTER:
        if(username.getText().equals("") || password1.getText().equals("") || password2.getText().equals("")){
            error.setText("Please fill in all fields");
            break OUTER;
        }else if(!password1.equals(password2)){
            JOptionPane.showMessageDialog(null, "Passwords do not match");
            break OUTER;
        }else{
            //adding new admin within the credentials table with all admin accounts on there
            try{
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
                
                String SQL = "INSERT INTO credentials (USERID, USERNAME, PASSWORD)values(?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(SQL);
                
                //getting the max clientid value and adding one to create a new primary key
                Statement stmt =  con.createStatement();
                String maxId = "SELECT * FROM credentials WHERE USERID = (SELECT MAX(USERID) FROM credentials)";
                ResultSet rs = stmt.executeQuery(maxId);
                int id = 0;
                if(rs.next()){
                    id = rs.getInt(1)+1;                    
                }

                //replacing the '?' in the String SQL with the values in the fields
                ps.setString(1, Integer.toString(id));
                ps.setString(2, username.getText());
                ps.setString(3, password1.getText());

                //putting them in the table
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Successfully created new admin");
            
            } catch (SQLException e){
                System.out.println(e);
            }
        }
        
        
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed

        int confirmed = JOptionPane.showConfirmDialog(null,
            "Are you sure you want to reset all room, roomtypes and parameters?", "Exit Program Message Box",
            JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            resetEverything();
        }

    }//GEN-LAST:event_resetButtonActionPerformed

    private void resetEverything(){
        
        try{
            
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
            
            
            Statement stmt =  con.createStatement();
            String currentName ="SELECT hotelname FROM hotelparameters";
            ResultSet rs = stmt.executeQuery(currentName);
            rs.next();
            
            
            
            PreparedStatement ps = con.prepareStatement("DELETE FROM ROOM");
            ps.executeUpdate();
            ps = con.prepareStatement("DELETE FROM ROOMTYPE");
            ps.executeUpdate();
            ps = con.prepareStatement("UPDATE hotelparameters SET hotelname='NULL', childcost=0, adultcost=0  WHERE hotelname='"+rs.getString(1)+"'");
            ps.executeUpdate();
            updateComboBox();
            
        }catch(SQLException e){
            System.out.println(e);
        }
            
            
        
        
    }
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        if(hotelName.getText().contains("'")){
            JOptionPane.showMessageDialog(null, "illegal char type \" ' \" ");
        }else{
            try{
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
                Statement stmt =  con.createStatement();
                String currentName ="SELECT hotelname FROM hotelparameters";
                ResultSet rs = stmt.executeQuery(currentName);
                rs.next();

                String SQL = "UPDATE hotelparameters SET hotelname='"+hotelName.getText()+"', childcost="+childCost.getValue().toString()
                +", adultcost="+adultCost.getValue().toString()+"  WHERE hotelname='"+rs.getString(1)+"'";
                PreparedStatement ps = con.prepareStatement(SQL);

                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Successfully updated hotel parameters");

            }catch(SQLException e){
                System.out.println(e);
            }
        }

    }//GEN-LAST:event_saveButtonActionPerformed

    private void roomTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypesActionPerformed

        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
            Statement stmt =  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
            String SQL = "SELECT numberofbeds,maxsleepingcount FROM ROOMTYPE WHERE roomtypename='"+roomTypes.getSelectedItem().toString()+"'";
            ResultSet rs = stmt.executeQuery(SQL);

            while(rs.next()){
                bedLabel.setText("Amount of beds: "+Integer.toString(rs.getInt(1)));
                countLabel.setText("Max sleeping count: "+Integer.toString(rs.getInt(2)));
            }

        }catch(SQLException e){
            System.out.println(e);
        }

    }//GEN-LAST:event_roomTypesActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_CloseActionPerformed

    private void AddButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton1ActionPerformed

        //checking that all fields are filled
        if(roomTypeName.getText().equals("")  || (Integer) numberOfBeds.getValue() == 0 || (Integer) maxSleepingCount.getValue() == 0){

            JOptionPane.showMessageDialog(null, "please fill in valid parameters");

        }else {

            try{
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");

                String SQL = "INSERT INTO roomtype (roomtype, roomtypename, numberofbeds, maxsleepingcount)values(?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(SQL);

                //getting the max clientid value and adding one to create a new primary key
                Statement stmt =  con.createStatement();
                String maxId = "SELECT * FROM roomtype WHERE roomtype = (SELECT MAX(roomtype) FROM roomtype)";
                ResultSet rs = stmt.executeQuery(maxId);
                int id = 0;
                if(rs.next()){
                    id = rs.getInt(1)+1;
                }

                //replacing the '?' in the String SQL with the values in the fields
                ps.setString(1, Integer.toString(id));
                ps.setString(2, roomTypeName.getText());
                ps.setString(3, numberOfBeds.getValue().toString());
                ps.setString(4, maxSleepingCount.getValue().toString());

                //putting them in the table
                ps.executeUpdate();

                //making degisnated amount of rooms with this type into the 'room' table

                //id = room type
                //roomid = room number

                maxId = "SELECT * FROM room WHERE roomid = (SELECT MAX(roomid) FROM room)";
                rs = stmt.executeQuery(maxId);
                int roomid = 1;
                if(rs.next()){
                    roomid = rs.getInt(1)+1;
                }

                for (int i = 0; i < (Integer) numberOfRooms.getValue(); i++) {
                    String SQL1 = "INSERT INTO room (roomid, roomtype)values(?, ?)";
                    ps = con.prepareStatement(SQL1);

                    ps.setString(1, Integer.toString(roomid));
                    ps.setString(2, Integer.toString(id));

                    //putting them in the table
                    ps.executeUpdate();

                    roomid++;
                }

                JOptionPane.showMessageDialog(null, "Successfully created "+(Integer) numberOfRooms.getValue()+" rooms with type "+roomTypeName.getText());
                updateComboBox();
                roomTypeName.setText(null);
                numberOfBeds.setValue(0);
                maxSleepingCount.setValue(0);
                numberOfRooms.setValue(0);

            }catch(SQLException e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_AddButton1ActionPerformed

     private void updateComboBox(){
        
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
            
            Statement stmt =  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
            String SQL = "SELECT * FROM ROOMTYPE";
            ResultSet rs = stmt.executeQuery(SQL);
            int count = 0;
            while(rs.next()){
                count++;
                
            }
            
            String [] names = new String [count];
            int i = 0; 
            rs.first();
            names[i] = rs.getString(2);
            i++;
            while(rs.next()){
                names[i] = rs.getString(2);
                i++;
            }
            
            
            DefaultComboBoxModel model = new DefaultComboBoxModel( names );
            roomTypes.setModel( model );
           
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
    }
    
    private void addExsistingRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExsistingRoomTypeActionPerformed

        if((Integer) numberOfRooms1.getValue() == 0){
            JOptionPane.showMessageDialog(null, "Room number cannot equal 0");
        }else{

            try{
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
                Statement stmt =  con.createStatement();

                String maxId = "SELECT * FROM room WHERE roomid = (SELECT MAX(roomid) FROM room)";
                ResultSet rs = stmt.executeQuery(maxId);
                int roomid = 1;
                if(rs.next()){
                    roomid = rs.getInt(1)+1;
                }

                //getting the id of the room type
                String roomtype = "SELECT roomtype FROM roomtype WHERE roomtypename='"+roomTypes.getSelectedItem().toString()+"'";
                rs = stmt.executeQuery(roomtype);
                int id = 0;
                if(rs.next()){
                    id = rs.getInt(1);
                }

                for (int i = 0; i < (Integer) numberOfRooms1.getValue(); i++) {
                    String SQL1 = "INSERT INTO room (roomid, roomtype)values(?, ?)";
                    PreparedStatement ps = con.prepareStatement(SQL1);

                    ps.setString(1, Integer.toString(roomid));
                    ps.setString(2, Integer.toString(id));

                    //putting them in the table
                    ps.executeUpdate();

                    roomid++;
                }

                JOptionPane.showMessageDialog(null, "Successfully created "+(Integer) numberOfRooms1.getValue()+" rooms with type "+roomTypes.getSelectedItem().toString());

            }catch(SQLException e){
                System.out.println(e);
            }

        }

    }//GEN-LAST:event_addExsistingRoomTypeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_consol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_consol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_consol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_consol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_consol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AddButton;
    private javax.swing.JToggleButton AddButton1;
    private javax.swing.JButton Close;
    private javax.swing.JToggleButton addExsistingRoomType;
    private javax.swing.JSpinner adultCost;
    private javax.swing.JLabel bedLabel;
    private javax.swing.JSpinner childCost;
    private javax.swing.JLabel countLabel;
    private javax.swing.JToggleButton deleteAdmin;
    private javax.swing.JToggleButton deleteUser;
    private javax.swing.JToggleButton editBooking;
    private javax.swing.JLabel error;
    private javax.swing.JTextField hotelName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton logout;
    private javax.swing.JSpinner maxSleepingCount;
    private javax.swing.JSpinner numberOfBeds;
    private javax.swing.JSpinner numberOfRooms;
    private javax.swing.JSpinner numberOfRooms1;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField roomTypeName;
    private javax.swing.JComboBox<String> roomTypes;
    private javax.swing.JToggleButton saveButton;
    private javax.swing.JTextField username;
    private javax.swing.JToggleButton viewAdmin;
    private javax.swing.JToggleButton viewBookings;
    private javax.swing.JToggleButton viewUsers;
    // End of variables declaration//GEN-END:variables
}
