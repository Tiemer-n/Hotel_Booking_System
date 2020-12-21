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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author Isaac
 */
public class Edit_Booking extends javax.swing.JFrame {

    double cost = 0;
    int clientID = -1;
    int bookingID = -1;
    int roomID = -1;
    String currentBookingStartDate = "";
    String currentBookingEndDate = "";
    int numberOfAdults = -1;
    int numberOfChildren = -1;
    boolean choosingRoom = false;
    boolean choosingRoomType = false;
    public Edit_Booking() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        endDate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        startDateLabel = new javax.swing.JLabel();
        endDateLabel = new javax.swing.JLabel();
        saveBookingButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        startDate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nightsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookingTable = new javax.swing.JTable();
        bookingMessage = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        currentStartDate = new javax.swing.JLabel();
        currentEndDate = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        currentRoomLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        roomIDLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        endDate.setText("end date");
        endDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        startDateLabel.setText("(startDate)");

        endDateLabel.setText("(endDate)");

        saveBookingButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveBookingButton.setText("Save Booking");
        saveBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBookingButtonActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nameLabel.setText("");

        startDate.setText("start date");
        startDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateActionPerformed(evt);
            }
        });

        jLabel5.setText("Nightes Stayed:");

        nightsLabel.setText("(nights)");

        bookingTable.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        bookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        bookingTable.setFocusable(false);
        bookingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookingTable);

        bookingMessage.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bookingMessage.setForeground(new java.awt.Color(255, 0, 0));
        bookingMessage.setText("");

        jLabel6.setText("(CurrentDates)");

        currentStartDate.setText("jLabel7");

        currentEndDate.setText("jLabel7");

        jToggleButton1.setText("Change room");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Current Room:");

        currentRoomLabel.setText("jLabel2");

        jLabel2.setText("Changed room:");

        roomIDLabel.setText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveBookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bookingMessage)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(currentRoomLabel)
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(roomIDLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(startDate)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(startDateLabel))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(endDate)
                                                .addGap(18, 18, 18)
                                                .addComponent(endDateLabel)))
                                        .addGap(77, 77, 77)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(currentEndDate)
                                            .addComponent(currentStartDate)
                                            .addComponent(jLabel6)))
                                    .addComponent(nameLabel)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nightsLabel)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDate)
                    .addComponent(startDateLabel)
                    .addComponent(currentStartDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endDate)
                    .addComponent(endDateLabel)
                    .addComponent(currentEndDate))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nightsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(currentRoomLabel)
                            .addComponent(jLabel2)
                            .addComponent(roomIDLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bookingMessage))
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(saveBookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void saveBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBookingButtonActionPerformed
        
        //checking that the starting and ending dates are valid
        if(checkValidStartAndEnd()){
            
            //updating the table at the selected bookingID with the new parameters
            
            
            try{
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
                Statement stmt =  con.createStatement();

                String SQL = "UPDATE BOOKINGS SET RoomID="+roomID+", StartDate='"+startDateLabel.getText()
                +"', EndDate='"+endDateLabel.getText()+"', NoOfNights = "+nightsLabel.getText()+"  WHERE BookingID="+bookingID;
                PreparedStatement ps = con.prepareStatement(SQL);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Sucessfully updated booking");
                this.dispose();

            }catch(SQLException e){
                System.out.println(e);
            }
            
            
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Inputted dates are incorrect");
            
        }
        

    }//GEN-LAST:event_saveBookingButtonActionPerformed

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

    private void bookingTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingTableMouseClicked
   

        if(choosingRoomType){
            //getting the room type from the table and displaying all of the rooms of this room type for the client to pick
            int bookingRoomType = -1;
            String  bookingRoomTypeName = "";
            try{
                JTable target = (JTable)evt.getSource();
                int row2 = target.getSelectedRow(); // select the row
                bookingRoomType = (Integer) bookingTable.getValueAt(row2, 0); // get the value of the row
                bookingRoomTypeName = (String) bookingTable.getValueAt(row2, 1); // get the value of the row .
            }catch(Exception e ){}

            if(bookingRoomType != -1 && !bookingRoomTypeName.equals("")){
                int confirmed = JOptionPane.showConfirmDialog(null,
                    "Would you like to use " + bookingRoomTypeName + " as your prefered room type?", null,
                    JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    choosingRoomType = false;
                    choosingRoom = true;

                    //fetching all of the rooms for the client to choose from

                    try{
                        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
                        Statement stmt =  con.createStatement();
                        ResultSet allRooms = stmt.executeQuery("SELECT * FROM ROOM WHERE roomtype = " + bookingRoomType);
                        bookingTable.setModel(DbUtils.resultSetToTableModel(allRooms));
                        bookingMessage.setText("Please pick the room that you would to stay in");
                    }catch(SQLException e){
                        System.out.println(e);
                    }
                }
            }
        }

        if(choosingRoom){
            int bookingRoomNumber = -1;
            try{
                JTable target = (JTable)evt.getSource();
                int row3 = target.getSelectedRow(); // select the row
                bookingRoomNumber = (Integer) bookingTable.getValueAt(row3, 0); // get the value of the row
            }catch(Exception e){}

            if(bookingRoomNumber != -1){
                int confirmed = JOptionPane.showConfirmDialog(null,
                    "Would you like to use room number " + bookingRoomNumber + " as your prefered room?", null,
                    JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {

                    try{

                        //searching if the room is avaliable with the selected start and end dates

                        ArrayList<LocalDate> overlappingDates= checkIfRoomIsAvaliable(bookingRoomNumber);
                        if(overlappingDates.size() == 0){

                            //setting the new roomID field
                            roomID = bookingRoomNumber;
                            roomIDLabel.setText(Integer.toString(roomID));
                            //removing the contents from the table
                            bookingTable.setVisible(false);

                            choosingRoom = false;
                            bookingMessage.setText("");

                        }else{
                            //showing the user the dates that they want to book overlap with ones currently booked for the room they've selected
                            String overlappedDates = "";
                            for (int i = 0; i < overlappingDates.size(); i++) {
                                overlappedDates = overlappedDates + overlappingDates.get(i) + " ";
                            }
                            JOptionPane.showMessageDialog(null, "This room is not avaliable with the selected dates: "+ overlappedDates);
                        }
                    }catch(ParseException e){
                        System.out.println(e);
                    }
                }
            }
        }
    }//GEN-LAST:event_bookingTableMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
       
        //changing the table values so it shows the room type for the admin to change the room type
        try{
            bookingTable.setVisible(true);
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
            Statement stmt =  con.createStatement();
            ResultSet allPayments = stmt.executeQuery("SELECT * FROM ROOMTYPE ");
            bookingTable.setModel(DbUtils.resultSetToTableModel(allPayments));
            bookingMessage.setText("Please pick the room type you would like to change to");
            choosingRoomType = true;
        }catch(SQLException e){
            System.out.println(e);
        }

        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }//GEN-LAST:event_formWindowActivated

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
    
    
    
    public boolean checkValidStartAndEnd() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        try{
            Date currentDate = new Date();
            Date startingDate = sdf.parse(startDateLabel.getText());
            Date endingDate = sdf.parse(endDateLabel.getText());

            if(!startingDate.before(currentDate) && !endingDate.before(currentDate) && !endingDate.before(startingDate)){
                return true;
            } 
        }catch(ParseException e){
            System.out.println(e);
        }
        
        return false;
    }
    
    public void setUpBookingDetails(String startingDate, String endingDate, int ClientID, int RoomID, int BookingID){
        currentStartDate.setText(startingDate);
        currentEndDate.setText(endingDate);
        startDateLabel.setText(startingDate);
        endDateLabel.setText(endingDate);
        currentRoomLabel.setText(Integer.toString(RoomID));
        clientID = ClientID;
        bookingID = BookingID;
        
        updateUser();
        changeNightCount();
        
    }
    
    public void updateUser(){
        
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
            Statement stmt =  con.createStatement();
            String SQL = "SELECT firstName, secondName FROM ISAAC.CLIENTDETAILS WHERE CLIENTID="+clientID;
            ResultSet rs = stmt.executeQuery(SQL);
            
            if(rs.next()){
                nameLabel.setText("change Booking for " + rs.getString(1) + " " + rs.getString(2));
            }
            
        }catch(SQLException e){
            System.out.println(e);
            
        }
        
    }
    
    public ArrayList<LocalDate> checkIfRoomIsAvaliable(int RoomID) throws ParseException{
        
        
        //creating an array for the dates that are found to overlap
        ArrayList<LocalDate> overlappingDates = new ArrayList<>();
        
        
        LocalDate startingDate = LocalDate.parse(startDateLabel.getText());
        LocalDate endingDate = LocalDate.parse(endDateLabel.getText());
        
        //getting all of the days between the booked dates and putting them in an arraylist
        ArrayList<LocalDate> totalBookingDates = returnListOfDatesBetween(startingDate, endingDate);
        
        
        //getting the bookings from the room that is selected and doing the same thing where start and ending dates
        //are inputted into an arraylist for each instance of booking acosiated with the room
        
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Hotel_Booking_System","isaac","1234");
            Statement stmt =  con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT startDate, endDate FROM BOOKINGS WHERE ROOMID=" +RoomID);
            
            
            
            
            while(rs.next()){
                
                //creating an array for the dates in the booking the cursor is currently at
                LocalDate instanceStartingDate = LocalDate.parse(rs.getString(1));
                LocalDate instanceEndingDate = LocalDate.parse(rs.getString(2));
                
                ArrayList<LocalDate> totalInstanceOfDates = returnListOfDatesBetween(instanceStartingDate,instanceEndingDate);
                
                //using the two lists with the instance taken from the booking table and the dates that are currently wanting to be booked
                //a nested for loop is used to determine if there are any duplicate dates
                
                for (int i = 0; i < totalBookingDates.size(); i++) {
                    for (int j = 0; j < totalInstanceOfDates.size(); j++) {
                        if(totalInstanceOfDates.get(j).equals(totalBookingDates.get(i))){
                            overlappingDates.add(totalBookingDates.get(i));
                        }
                    }
                }
                
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return overlappingDates;
    }
    
    public ArrayList<LocalDate> returnListOfDatesBetween(LocalDate startingDate, LocalDate endingDate){
        
        //creating the new list 
        ArrayList<LocalDate> totalDates = new ArrayList<>();
        
        //calculating the amount of days between them
        long noOfDaysBetween = ChronoUnit.DAYS.between(startingDate, endingDate);
        
        //putting in the first date into the array and then interating all of the dates between them and also putting those iterations into the list
        totalDates.add(startingDate);
        int add = 1;
        while( add != noOfDaysBetween ){
            LocalDate temp = startingDate.plusDays(add);
            add++;
            totalDates.add(temp);
        }
        totalDates.add(endingDate);
        
        return totalDates;
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
            java.util.logging.Logger.getLogger(Edit_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookingMessage;
    private javax.swing.JTable bookingTable;
    private javax.swing.JLabel currentEndDate;
    private javax.swing.JLabel currentRoomLabel;
    private javax.swing.JLabel currentStartDate;
    private javax.swing.JButton endDate;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nightsLabel;
    private javax.swing.JLabel roomIDLabel;
    private javax.swing.JButton saveBookingButton;
    private javax.swing.JButton startDate;
    private javax.swing.JLabel startDateLabel;
    // End of variables declaration//GEN-END:variables
}
