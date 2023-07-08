package app;

import static app.Newdonor.temp;
//import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Sellblood extends javax.swing.JFrame {
    
//    JTextFieldDateEditor dtEditor;
    public Sellblood() {
        
        initComponents();
//        initDateEditor();
    }
    public void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        lblmini = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();
        jPanelBody = new javax.swing.JPanel();
        lblNo = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblbloodgroup = new javax.swing.JLabel();
        lblAdhaar = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cmbxBloodGroup = new javax.swing.JComboBox();
        txtMobile = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        lblmobile = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaAddress = new javax.swing.JTextArea();
        txtAdhaar = new javax.swing.JTextField();

        setUndecorated(true);

        jPanelHeader.setBackground(new java.awt.Color(248, 148, 6));

        lblmini.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lblmini.setText("-");
        lblmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminiMouseClicked(evt);
            }
        });

        lblClose.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        lblClose.setText("x");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("Sell To");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 449, Short.MAX_VALUE)
                .addComponent(lblmini)
                .addGap(18, 18, 18)
                .addComponent(lblClose)
                .addContainerGap())
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(lblmini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelBody.setBackground(new java.awt.Color(44, 62, 80));
        jPanelBody.setForeground(new java.awt.Color(228, 241, 254));

        lblNo.setBackground(new java.awt.Color(255, 255, 255));
        lblNo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNo.setForeground(new java.awt.Color(204, 204, 255));
        lblNo.setText("Packet No :");

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(204, 204, 255));
        lblName.setText(" Buyer Name :");

        lblbloodgroup.setBackground(new java.awt.Color(255, 255, 255));
        lblbloodgroup.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblbloodgroup.setForeground(new java.awt.Color(204, 204, 255));
        lblbloodgroup.setText(" Blood Group :");

        lblAdhaar.setBackground(new java.awt.Color(255, 255, 255));
        lblAdhaar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAdhaar.setForeground(new java.awt.Color(204, 204, 255));
        lblAdhaar.setText("Adhaar No :");

        lbladdress.setBackground(new java.awt.Color(255, 255, 255));
        lbladdress.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbladdress.setForeground(new java.awt.Color(204, 204, 255));
        lbladdress.setText("Address :");

        txtNo.setBackground(new java.awt.Color(108, 122, 137));
        txtNo.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtNo.setForeground(new java.awt.Color(228, 241, 254));

        txtName.setBackground(new java.awt.Color(108, 122, 137));
        txtName.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtName.setForeground(new java.awt.Color(228, 241, 254));

        cmbxBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<--Select-->", "A", "B", "AB", "O", "A-", "B-", "AB-", "O-" }));

        txtMobile.setBackground(new java.awt.Color(108, 122, 137));
        txtMobile.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtMobile.setForeground(new java.awt.Color(228, 241, 254));
        txtMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 51, 51));
        btnCancel.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(51, 153, 255));
        btnSubmit.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblmobile.setBackground(new java.awt.Color(255, 255, 255));
        lblmobile.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblmobile.setForeground(new java.awt.Color(204, 204, 255));
        lblmobile.setText("Mobile :");

        txtareaAddress.setBackground(new java.awt.Color(108, 122, 137));
        txtareaAddress.setColumns(20);
        txtareaAddress.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtareaAddress.setForeground(new java.awt.Color(228, 241, 254));
        txtareaAddress.setLineWrap(true);
        txtareaAddress.setRows(5);
        jScrollPane1.setViewportView(txtareaAddress);

        txtAdhaar.setBackground(new java.awt.Color(108, 122, 137));
        txtAdhaar.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtAdhaar.setForeground(new java.awt.Color(228, 241, 254));

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName)
                                    .addComponent(txtNo)))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(lblbloodgroup)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbxBloodGroup, 0, 114, Short.MAX_VALUE)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelBodyLayout.createSequentialGroup()
                                    .addComponent(lblmobile, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelBodyLayout.createSequentialGroup()
                                    .addComponent(lblAdhaar)
                                    .addGap(29, 29, 29)
                                    .addComponent(txtAdhaar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(lbladdress)
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNo)
                        .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAdhaar)
                        .addComponent(txtAdhaar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmobile))
                .addGap(30, 30, 30)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblbloodgroup)
                        .addComponent(cmbxBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbladdress))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminiMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblminiMouseClicked

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        close();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        
        MainUI m = new MainUI();
        m.setVisible(true);
        this.dispose();
           
    }//GEN-LAST:event_btnCancelActionPerformed
    Connection con;
    PreparedStatement insert;
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String no = txtNo.getText();
        String name = txtName.getText();
        String adhaar = txtAdhaar.getText();       
//      String date = changeDateFormat(dtMyDate.getDate());
        String bloodgroup = (String) cmbxBloodGroup.getSelectedItem();            
        String mobile = txtMobile.getText();
        String address = txtareaAddress.getText();  
        if(no.isEmpty())
        {
            JOptionPane.showMessageDialog(this, " Please Enter Packet No !");
        } else if(name.isEmpty()) {
            JOptionPane.showMessageDialog(this, " Please Enter Name !");        
            }else if(adhaar.isEmpty()) {
            JOptionPane.showMessageDialog(this, " Please Enter Adhaar No");
            }else if(adhaar.length() != 12) {
            JOptionPane.showMessageDialog(this, " Please Enter Valid Adhar no(size should be 12)");
//        }else if(date.isEmpty()) {
//            JOptionPane.showMessageDialog(this, " Please Select Date !"); 
        }else if(cmbxBloodGroup.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, " Please Select BloodGroup !");
        }else if(mobile.isEmpty()) {
            JOptionPane.showMessageDialog(this, " Please Enter Mobile No. !");       
        }else if(address.isEmpty()) {
            JOptionPane.showMessageDialog(this, " Please Enter Address !");       
        }else if(!(mobile.length() == 10)) {
            JOptionPane.showMessageDialog(this, " Please Enter valid Mobile Number !");
        }else
        {
            try{

//                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","");
                insert = con.prepareStatement("insert into bloodbank.buyers(No,Name,Bloodgroup,adhaar,Mobile,Address)value(?,?,?,?,?,?)");
                insert.setString(1, no);
                insert.setString(2,name);
                insert.setString(3,bloodgroup);
                insert.setString(4,adhaar);
                insert.setString(5,mobile);
                insert.setString(6,address);
                
//                insert.setString(6,date);
                insert.executeUpdate();
                
                //coding to update quantityy table
                
                temp=cmbxBloodGroup.getSelectedItem().toString();          
                insert=con.prepareStatement("select `Packets` from `bloodpackets` where `Group` ='"+temp+"'");
                ResultSet rs = insert.executeQuery();
                rs.next();
                int n=rs.getInt(1);
                n=n-1;
                insert=con.prepareStatement("UPDATE `bloodpackets` SET `Packets`=? WHERE `Group`=?");
                insert.setInt(1, n);
                insert.setString(2,temp);
                insert.executeUpdate();
                
                JOptionPane.showMessageDialog(this,"RECORD ADD SECCESSFULLY ");
                
                txtNo.setText("");
                txtName.setText("");
                cmbxBloodGroup.setSelectedIndex(0);
//                dtMyDate.setCalendar(null);
                txtMobile.setText("");
                txtareaAddress.setText("");
                txtAdhaar.setText(" ");
                
            }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(this, evt);

            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileActionPerformed
        // TODO add your handling code
        
    }//GEN-LAST:event_txtMobileActionPerformed
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sellblood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Sellblood().setVisible(true);
            }
        });
    }
//    private void initDateEditor(){
//        dtEditor = (JTextFieldDateEditor) dtMyDate.getDateEditor();
//        dtEditor.setEditable(false);
//    }
//    private String changeDateFormat(Date dt){
//        SimpleDateFormat dtformat = new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            return dtformat.format(dt);
//        } catch (Exception e) {
//            System.out.println(" Error :"+e.getMessage());
//            return "";
//        }
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cmbxBloodGroup;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdhaar;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblbloodgroup;
    private javax.swing.JLabel lblmini;
    private javax.swing.JLabel lblmobile;
    private javax.swing.JTextField txtAdhaar;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextArea txtareaAddress;
    // End of variables declaration//GEN-END:variables
}
