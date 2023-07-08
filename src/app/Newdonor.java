package app;

//import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
//import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
//import java.util.Date;

public class Newdonor extends javax.swing.JFrame {

    public static String temp;
//    JTextFieldDateEditor dtEditor;

    public Newdonor() {
        initComponents();
//        initDateEditor();
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelheader = new javax.swing.JPanel();
        lblmini = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        lblheader = new javax.swing.JLabel();
        jPanelBody = new javax.swing.JPanel();
        cmbxCountry = new javax.swing.JComboBox();
        lblNo = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblbloodgroup = new javax.swing.JLabel();
        lblsex = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        lblMobile = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cmbxGroup = new javax.swing.JComboBox();
        cmbxSex = new javax.swing.JComboBox();
        txtAge = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        lbladhaar = new javax.swing.JLabel();
        txtadhaar = new javax.swing.JTextField();
        lblAdhaar = new javax.swing.JLabel();
        txtAdhaar = new javax.swing.JTextField();

        setTitle("Donor Detail Form");
        setUndecorated(true);

        jPanelheader.setBackground(new java.awt.Color(248, 148, 6));

        lblmini.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lblmini.setText("-");
        lblmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminiMouseClicked(evt);
            }
        });

        lblclose.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        lblclose.setText("x");
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
        });

        lblheader.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        lblheader.setForeground(new java.awt.Color(255, 255, 255));
        lblheader.setText("New Donor Detail");

        javax.swing.GroupLayout jPanelheaderLayout = new javax.swing.GroupLayout(jPanelheader);
        jPanelheader.setLayout(jPanelheaderLayout);
        jPanelheaderLayout.setHorizontalGroup(
            jPanelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelheaderLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(lblheader, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(lblmini)
                .addGap(18, 18, 18)
                .addComponent(lblclose)
                .addContainerGap())
        );
        jPanelheaderLayout.setVerticalGroup(
            jPanelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblclose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblheader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(lblmini, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelBody.setBackground(new java.awt.Color(44, 62, 80));
        jPanelBody.setForeground(new java.awt.Color(228, 241, 254));

        cmbxCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<--Select-->", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "The Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo, Democratic Republic of the", "Congo, Republic of the", "Costa Rica", "Côte d’Ivoire", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor (Timor-Leste)", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "The Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia, Federated States of", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar (Burma)", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Macedonia", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "Spain", "Sri Lanka", "Sudan", "Sudan, South", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));

        lblNo.setBackground(new java.awt.Color(255, 255, 255));
        lblNo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNo.setForeground(new java.awt.Color(204, 204, 255));
        lblNo.setText("Packet No :");

        lblname.setBackground(new java.awt.Color(255, 255, 255));
        lblname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblname.setForeground(new java.awt.Color(204, 204, 255));
        lblname.setText(" Donor Name :");

        lblbloodgroup.setBackground(new java.awt.Color(255, 255, 255));
        lblbloodgroup.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblbloodgroup.setForeground(new java.awt.Color(204, 204, 255));
        lblbloodgroup.setText(" Blood Group :");

        lblsex.setBackground(new java.awt.Color(255, 255, 255));
        lblsex.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblsex.setForeground(new java.awt.Color(204, 204, 255));
        lblsex.setText("Sex :");

        lblAge.setBackground(new java.awt.Color(255, 255, 255));
        lblAge.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAge.setForeground(new java.awt.Color(204, 204, 255));
        lblAge.setText("Age :");

        lblCountry.setBackground(new java.awt.Color(255, 255, 255));
        lblCountry.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCountry.setForeground(new java.awt.Color(204, 204, 255));
        lblCountry.setText("Country :");

        lblMobile.setBackground(new java.awt.Color(255, 255, 255));
        lblMobile.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMobile.setForeground(new java.awt.Color(204, 204, 255));
        lblMobile.setText("Mobile :");

        lblCity.setBackground(new java.awt.Color(255, 255, 255));
        lblCity.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCity.setForeground(new java.awt.Color(204, 204, 255));
        lblCity.setText("City");

        txtNo.setBackground(new java.awt.Color(108, 122, 137));
        txtNo.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtNo.setForeground(new java.awt.Color(228, 241, 254));

        txtCity.setBackground(new java.awt.Color(108, 122, 137));
        txtCity.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtCity.setForeground(new java.awt.Color(228, 241, 254));

        txtName.setBackground(new java.awt.Color(108, 122, 137));
        txtName.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtName.setForeground(new java.awt.Color(228, 241, 254));

        cmbxGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<--Select-->", "A", "B", "AB", "O", "A-", "B-", "AB-", "O-" }));
        cmbxGroup.setAutoscrolls(true);

        cmbxSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<--Select-->", "Male", "Female", "Other" }));

        txtAge.setBackground(new java.awt.Color(108, 122, 137));
        txtAge.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtAge.setForeground(new java.awt.Color(228, 241, 254));

        txtMobile.setBackground(new java.awt.Color(108, 122, 137));
        txtMobile.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtMobile.setForeground(new java.awt.Color(228, 241, 254));

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

        lbladhaar.setBackground(new java.awt.Color(255, 255, 255));
        lbladhaar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbladhaar.setForeground(new java.awt.Color(204, 204, 255));
        lbladhaar.setText("Adhaar No.");

        txtadhaar.setBackground(new java.awt.Color(108, 122, 137));
        txtadhaar.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtadhaar.setForeground(new java.awt.Color(228, 241, 254));

        lblAdhaar.setBackground(new java.awt.Color(255, 255, 255));
        lblAdhaar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAdhaar.setForeground(new java.awt.Color(204, 204, 255));
        lblAdhaar.setText("Adhaar No :");

        txtAdhaar.setBackground(new java.awt.Color(108, 122, 137));
        txtAdhaar.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtAdhaar.setForeground(new java.awt.Color(228, 241, 254));

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addComponent(lblbloodgroup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbxGroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblsex, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNo)
                            .addComponent(txtName)
                            .addComponent(cmbxSex, 0, 160, Short.MAX_VALUE)
                            .addComponent(txtAge))))
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCountry)
                            .addComponent(lblMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdhaar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAdhaar)
                            .addComponent(txtCity)
                            .addComponent(cmbxCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNo)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCountry)
                    .addComponent(cmbxCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdhaar)
                    .addComponent(txtAdhaar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbloodgroup)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbxGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsex)
                    .addComponent(cmbxSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMobile))
                .addGap(30, 30, 30)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelheader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        close();
    }//GEN-LAST:event_lblcloseMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        close();
        MainUI m = new MainUI();
        m.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void lblminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminiMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblminiMouseClicked
    Connection con;
    PreparedStatement insert;
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String no = txtNo.getText();
        String name = txtName.getText();
        String country = (String) cmbxCountry.getSelectedItem();
        String adhaar = txtAdhaar.getText();
//        String date = changeDateFormat(dtMyDate.getDate());
        String bloodgroup = (String) cmbxGroup.getSelectedItem();
        String city = txtCity.getText();
        String sex = (String) cmbxSex.getSelectedItem();
        String mobile = txtMobile.getText();
        String age = txtAge.getText();

        if (no.isEmpty()) {
            JOptionPane.showMessageDialog(this, " Please Enter Packet No ");
        } else if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, " Please Enter Name !");
        } else if (cmbxCountry.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, " Please Select Country !");
//        }else if(date.isEmpty()) {
//            JOptionPane.showMessageDialog(this, " Please Select Date !");
        } else if (adhaar.isEmpty()) {
            JOptionPane.showMessageDialog(this, " Please Enter Adhaar No");
        } else if (adhaar.length() != 12) {
            JOptionPane.showMessageDialog(this, " Please Enter Valid Adhar no(size should be 12)");
        } else if (cmbxGroup.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, " Please Select BloodGroup !");
        } else if (city.isEmpty()) {
            JOptionPane.showMessageDialog(this, " Please Enter City !");
        } else if (cmbxSex.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, " Please Select Gender ! ");
        } else if (mobile.isEmpty()) {
            JOptionPane.showMessageDialog(this, " Please Enter Mobile No. !");
        } else if (age.isEmpty()) {
            JOptionPane.showMessageDialog(this, " Please Enter Age !");
        } else if (!(mobile.length() == 10)) {
            JOptionPane.showMessageDialog(this, " Please Enter valid Mobile Number !");
        } else if (!(Integer.parseInt(age.trim()) >= 18 && Integer.parseInt(age.trim()) <= 65)) {
            JOptionPane.showMessageDialog(this, " The Donor Must Be 18 - 65 Year Old !");
        } else {
            try {
//                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "");
                insert = con.prepareStatement("insert into bloodbank.doners(no,donorname,country,adhaar,bloodgroup,city,sex,mobile,age)value(?,?,?,?,?,?,?,?,?)");
                insert.setString(1, no);
                insert.setString(2, name);
                insert.setString(3, country);
                insert.setString(4, adhaar);
                insert.setString(5, bloodgroup);
                insert.setString(6, city);
                insert.setString(7, sex);
                insert.setString(8, mobile);
                insert.setString(9, age);
//                insert.setString(9,date);
                insert.executeUpdate();

                //coding to update quantityy table
                temp = cmbxGroup.getSelectedItem().toString();
                insert = con.prepareStatement("select `Packets` from `bloodpackets` where `Group` ='" + temp + "'");
                ResultSet rs = insert.executeQuery();
                rs.next();
                int n = rs.getInt(1);
                n = n + 1;
                insert = con.prepareStatement("UPDATE `bloodpackets` SET `Packets`=? WHERE `Group`=?");
                insert.setInt(1, n);
                insert.setString(2, temp);
                insert.executeUpdate();

                JOptionPane.showMessageDialog(this, "RECORD ADD SECCESSFULLY ");

                txtNo.setText("");
                txtName.setText("");
                txtAdhaar.setText("");
                cmbxCountry.setSelectedIndex(0);
//                dtMyDate.setCalendar(null);
                cmbxGroup.setSelectedIndex(0);
                txtCity.setText("");
                cmbxSex.setSelectedIndex(0);
                txtMobile.setText("");
                txtAge.setText("");

            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());

            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
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
            java.util.logging.Logger.getLogger(Newdonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Newdonor().setVisible(true);
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
    private javax.swing.JComboBox cmbxCountry;
    private javax.swing.JComboBox cmbxGroup;
    private javax.swing.JComboBox cmbxSex;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelheader;
    private javax.swing.JLabel lblAdhaar;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lbladhaar;
    private javax.swing.JLabel lblbloodgroup;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblheader;
    private javax.swing.JLabel lblmini;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblsex;
    private javax.swing.JTextField txtAdhaar;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtadhaar;
    // End of variables declaration//GEN-END:variables
}
