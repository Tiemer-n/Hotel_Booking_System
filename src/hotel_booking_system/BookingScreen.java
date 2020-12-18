/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_booking_system;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Isaac
 */
public class BookingScreen extends javax.swing.JFrame {

    int ClientID = -1;
    String firstName = null;
    double cost = 0;
    
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
        costLabel = new javax.swing.JLabel();
        startDate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nightsLabel = new javax.swing.JLabel();
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
        Table = new javax.swing.JTable();
        jToggleButton6 = new javax.swing.JToggleButton();
        veiwPaymentMethods = new javax.swing.JToggleButton();
        sortPayments = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        addPayment = new javax.swing.JToggleButton();
        cardNumber = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        securityNumber = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jToggleButton7 = new javax.swing.JToggleButton();
        expiryDate = new javax.swing.JLabel();
        singedInLabel = new javax.swing.JLabel();

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
        endDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateActionPerformed(evt);
            }
        });

        jButton2.setText("Log Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        adultCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        adultCount.setName(""); // NOI18N
        adultCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                adultCountStateChanged(evt);
            }
        });

        startDateLabel.setText("(startDate)");

        jLabel1.setText("number of people:");

        endDateLabel.setText("(endDate)");

        childrenCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        childrenCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                childrenCountStateChanged(evt);
            }
        });

        buyButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buyButton1.setText("Find a room");
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

        costLabel.setText("(cost)");

        startDate.setText("start date");
        startDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateActionPerformed(evt);
            }
        });

        jLabel4.setText("Cost:");

        loginButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Nightes Stayed:");

        nightsLabel.setText("(nights)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buyButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jToggleButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(childrenCount)
                                    .addComponent(adultCount))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel3))))
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
                                .addComponent(costLabel))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(nightsLabel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(jLabel2))
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
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nightsLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costLabel)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
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
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Register", jPanel2);

        jToggleButton2.setText("back");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("View Bookings");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setText("Cancel Selected Booking");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Table);

        jToggleButton6.setText("Add payment method");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        veiwPaymentMethods.setText("View Payment Methods");
        veiwPaymentMethods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiwPaymentMethodsActionPerformed(evt);
            }
        });

        sortPayments.setVisible(false);
        sortPayments.setText("Sort Payments By expiry date");
        sortPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortPaymentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton2)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jToggleButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(veiwPaymentMethods)
                                    .addComponent(jToggleButton6)
                                    .addComponent(sortPayments))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton3)
                    .addComponent(jToggleButton4)
                    .addComponent(jToggleButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(veiwPaymentMethods)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortPayments)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Account", jPanel4);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setText("Add payment Method");

        jLabel16.setText("(due to legal complications this demo program cannot store actual payment details)");

        addPayment.setText("Add payment method");
        addPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPaymentActionPerformed(evt);
            }
        });

        jLabel17.setText("Redundant card number:");

        jLabel18.setText("Security number:");

        jLabel19.setText("Expiry Date:");

        jToggleButton7.setText("Add Date");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        expiryDate.setText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton7)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(expiryDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(securityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(securityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jToggleButton7)
                    .addComponent(expiryDate))
                .addGap(16, 16, 16)
                .addComponent(addPayment)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Payment", jPanel5);

        singedInLabel.setText("Not singed in");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(singedInLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(singedInLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        //checking the email against a regular expression
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

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
            Statement stmt =  con.createStatement();
            ResultSet current = stmt.executeQuery("SELECT * FROM CURRENTSESSION");
            current.next();
            
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM CURRENTSESSION");
            
            Table.setModel(DbUtils.resultSetToTableModel(rs));
            sortPayments.setVisible(false);
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void startDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateActionPerformed
        JFrame frame = new JFrame("Grid Design");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(350, 70);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);

        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");

        
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        
        datePicker.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                startDateLabel.setText(datePicker.getJFormattedTextField().getText());
                changeNightCount();
                frame.dispose();
            }
        });
        
        frame.add(datePicker);
        frame.setTitle("Calendar");
        
    }//GEN-LAST:event_startDateActionPerformed

    private void endDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDateActionPerformed
        JFrame frame = new JFrame("Grid Design");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(350, 70);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);

        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");

        
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        
        datePicker.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                endDateLabel.setText(datePicker.getJFormattedTextField().getText());
                changeNightCount();
                frame.dispose();
            }
        });
        
        frame.add(datePicker);
        frame.setTitle("Calendar");
    }//GEN-LAST:event_endDateActionPerformed

    private void adultCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_adultCountStateChanged
        changeCost();
    }//GEN-LAST:event_adultCountStateChanged

    private void childrenCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_childrenCountStateChanged
        changeCost();
    }//GEN-LAST:event_childrenCountStateChanged

    private void addPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPaymentActionPerformed
        
        Pattern pattern = Pattern.compile("^[0-9]*$");
        Matcher matcher = pattern.matcher(cardNumber.getText());
        
        OUTERRRR:
        
        if(matcher.matches()){
            OUTER:
            try{
                if(ClientID == -1){
                    JOptionPane.showMessageDialog(null, "you are not logged in");
                    break OUTER;
                }
                
                if(securityNumber.getText().length() == 3 && !expiryDate.getText().equals("")){
                    if(checkValidExpiryDate(expiryDate.getText())){
                        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");

                        String SQL = "INSERT INTO PaymentDetails (PaymentID, ClientID, FirstName, SecondName, CardNumber)values(?, ?, ?, ?, ?)";
                        PreparedStatement ps = con.prepareStatement(SQL);

                        //getting the paymentID
                        Statement stmt =  con.createStatement();
                        String maxId = "SELECT * FROM PAYMENTDETAILS WHERE PAYMENTID = (SELECT MAX(PAYMENTID) FROM PAYMENTDETAILS)";
                        ResultSet rs = stmt.executeQuery(maxId);
                        int id = 0;
                        if(rs.next()){
                            id = rs.getInt(1)+1;
                        }

                        //getting details of the clients cuurrently logged on
                        String Details = "SELECT firstname, secondname FROM CLIENTDETAILS WHERE ClientId = "+ClientID;
                        rs = stmt.executeQuery(Details);                
                        rs.next();


                        String CardNumber = cardNumber.getText()+"_"+securityNumber.getText()+"_"+expiryDate.getText();
                        //replacing the '?' in the String SQL with the values in the fields
                        ps.setString(1, Integer.toString(id));
                        ps.setString(2, Integer.toString(ClientID));
                        ps.setString(3, rs.getString(1));
                        ps.setString(4, rs.getString(2));
                        ps.setString(5, CardNumber);

                        ps.executeUpdate();

                        cardNumber.setText("");
                        securityNumber.setText("");
                        expiryDate.setText("");
                        JOptionPane.showMessageDialog(null, "successfully added new payment method");
                        jTabbedPane1.setSelectedIndex(3);
                        break OUTERRRR;
                    }else{
                        JOptionPane.showMessageDialog(null, "Expiry date has been exceeded");
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "one or more fields have been inputted incorrectly");
                }
                
                
            }catch(SQLException e){
                System.out.println(e);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Card number field can only contain numbers");
        }
        
    }//GEN-LAST:event_addPaymentActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        
        JFrame frame = new JFrame("Grid Design");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(350, 70);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);

        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");

        
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        
        datePicker.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                expiryDate.setText(datePicker.getJFormattedTextField().getText());
                frame.dispose();
            }
        });
        
        frame.add(datePicker);
        frame.setTitle("Calendar");
        
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void veiwPaymentMethodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiwPaymentMethodsActionPerformed
        
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
            Statement stmt =  con.createStatement();
            ResultSet allPayments = stmt.executeQuery("SELECT CardNumber FROM PAYMENTDETAILS WHERE CLIENTID = "+ClientID);
            Table.setModel(DbUtils.resultSetToTableModel(allPayments));
            sortPayments.setVisible(true);
        }catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_veiwPaymentMethodsActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void sortPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortPaymentsActionPerformed
       
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
            Statement stmt =  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
            ResultSet allPayments = stmt.executeQuery("SELECT CardNumber FROM PAYMENTDETAILS WHERE CLIENTID = "+ClientID);
            
            //getting the length of the list that'll be used to sort all of the expiry dates
            int count = 0;
            while(allPayments.next()){
                count++;
            }
            allPayments.beforeFirst();
            //creating the date array with the length of all the payments 
            String[] expiryDates = new String[count];
            
            //getting the end string of the cardnumber string and parsing that into a date object
            int index =0;
            while(allPayments.next()){
                String temp = allPayments.getString(1);
                String dateString = temp.substring(temp.length()-10, temp.length()-1);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date date = sdf.parse(dateString);
                expiryDates[index] = temp;
                index++;
            }
            
            //sorting all of the dates by acending order
            MergeSort(expiryDates, count);
            
            
            //updateing the table to display the new sorted values
            DefaultTableModel model = (DefaultTableModel) Table.getModel();
            
            //removing the current values within the table model
            if (model.getRowCount() > 0) {
                for (int i = model.getRowCount() - 1; i > -1; i--) {
                    model.removeRow(i);
                }
            }
            
            
            //inserting the new sorted values into the table model and setting the table model with it
            Object[] value = new Object[1];
            for (int i = 0; i < expiryDates.length; i++) {
                value[0] = expiryDates[i];
                model.addRow(value);
            }
            Table.setModel(model);
        }catch(SQLException e){
            System.out.println(e);
        } catch (ParseException ex) {
            Logger.getLogger(BookingScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sortPaymentsActionPerformed

    public void MergeSort(String[] a, int n) {
        if (n < 2) {
            return;
            //returns if the length of the list is 1
        }
        int mid = n / 2;
        
        String[] Left = new String[mid];
        String[] Right = new String[n - mid];
        
        //makes two arrays for both halfs of the initial array
        for (int i = 0; i < mid; i++) {
            Left[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            Right[i - mid] = a[i];
        }
        //places the corresponding value in the initial array in the two sub arrays
        
        MergeSort(Left, mid);
        MergeSort(Right, n - mid);
        // repeats the cycle until there are only arrays with length of one 
        
        // it then finally merges these single length arrays into the inital array at the ascending order
        Merge(a, Left, Right, mid, n - mid);
    }

    public void Merge(String[] a, String[] l, String[] r, int Left, int Right) {

        int i = 0;
        int j = 0;
        int k = 0;
        
        //while loop breaks if one of the arrays are exhausted (for avoid out of bounds error)
        while (i < Left && j < Right) {
            //comparing in which array has the smallest value then puts that in the inital array
            if (getDateFromCardNumberString(l,i).before(getDateFromCardNumberString(r,j))) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        
        //filling up the initial array with the rest of the array that still has values inside
        while (i < Left) {
            a[k++] = l[i++];
        }
        while (j < Right) {
            a[k++] = r[j++];
        }
    }
    
    public Date getDateFromCardNumberString (String[] array,int index) {
        Date theDate = new Date();
        try{
            String temp = array[index];
            String dateString = temp.substring(temp.length()-10, temp.length()-1);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            theDate = sdf.parse(dateString);
        }catch(ParseException e){
            System.out.println(e);
        }
        
        
        return theDate;
    }
    
    
    private void changeCost(){
        try{    
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
            Statement stmt =  con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT adultcost, childcost FROM HOTELPARAMETERS");
            rs.next();
            
            cost = ((Integer) childrenCount.getValue() * rs.getDouble(2)) + ((Integer) adultCount.getValue() * rs.getDouble(1));
            
            costLabel.setText(Double.toString(cost));
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    private void changeNightCount(){
       try{
            //Parsing the date
            LocalDate dateBefore = LocalDate.parse(startDateLabel.getText());
            LocalDate dateAfter = LocalDate.parse(endDateLabel.getText());

            //calculating number of days in between
            long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
            
            //setting the label as the value of the amount of days between 
            nightsLabel.setText(Long.toString(noOfDaysBetween));   
       }catch(Exception e){}
    }
    
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
                singedInLabel.setText("Signed in as: "+firstName);
            }
            
        }catch(SQLException e){
            System.out.println(e);
            
        }
        
    }
    
    
    public boolean checkValidExpiryDate(String date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date date1 = sdf.parse(date);
            Date Current = new Date();
            
            if(date1.before(Current)){
                return false;
            }
            
        }catch (Exception e){
            System.out.println(e);
        }
        
        
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JToggleButton addPayment;
    private javax.swing.JSpinner adultCount;
    private javax.swing.JToggleButton back;
    private javax.swing.JButton buyButton1;
    private javax.swing.JFormattedTextField cardNumber;
    private javax.swing.JSpinner childrenCount;
    private javax.swing.JLabel costLabel;
    private javax.swing.JTextField emailRegisterField;
    private javax.swing.JButton endDate;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JLabel error;
    private javax.swing.JLabel expiryDate;
    private javax.swing.JTextField firstNameRegisterField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel message;
    private javax.swing.JLabel nightsLabel;
    private javax.swing.JPasswordField password1RegisterField;
    private javax.swing.JPasswordField password2RegisterField;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField secondNameRegisterField;
    private javax.swing.JFormattedTextField securityNumber;
    private javax.swing.JLabel singedInLabel;
    private javax.swing.JToggleButton sortPayments;
    private javax.swing.JButton startDate;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JToggleButton submit;
    private javax.swing.JToggleButton veiwPaymentMethods;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
