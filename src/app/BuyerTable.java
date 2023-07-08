package app;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuyerTable extends javax.swing.JFrame {

    String a = SearchBuyer.action;

    public BuyerTable() {
        initComponents();
        switch (a) {
            case "a1":
                lblSearch.setText(" Enter Name :");
                break;
            default:
                lblSearch.setText(" Enter Packet No :");
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelheader = new javax.swing.JPanel();
        lblheader = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        lblmini = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblSearch = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelheader.setBackground(new java.awt.Color(248, 148, 6));

        lblheader.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        lblheader.setForeground(new java.awt.Color(255, 255, 255));
        lblheader.setText("bUYER Detail");

        lblclose.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        lblclose.setText("x");
        lblclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
        });

        lblmini.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lblmini.setText("-");
        lblmini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelheaderLayout = new javax.swing.GroupLayout(jPanelheader);
        jPanelheader.setLayout(jPanelheaderLayout);
        jPanelheaderLayout.setHorizontalGroup(
            jPanelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelheaderLayout.createSequentialGroup()
                .addContainerGap(341, Short.MAX_VALUE)
                .addComponent(lblheader, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252)
                .addComponent(lblmini, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelheaderLayout.setVerticalGroup(
            jPanelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblclose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblmini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelheaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblheader)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setForeground(new java.awt.Color(228, 241, 254));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(44, 62, 80));
        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Packet No", "Name", " Group ", "Date", "Mobile", "Address", "Adhaar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setRowHeight(35);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(140);
        }

        lblSearch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(204, 204, 255));
        lblSearch.setText("Enter Your Choice");

        btnSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnSearch.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnSearch.setForeground(java.awt.Color.white);
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.setBackground(new java.awt.Color(108, 122, 137));
        txtSearch.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(228, 241, 254));

        btnCancel.setBackground(new java.awt.Color(255, 51, 51));
        btnCancel.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblSearch)
                .addGap(26, 26, 26)
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addGap(96, 96, 96)
                .addComponent(btnSearch)
                .addGap(238, 238, 238))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(378, 378, 378)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(366, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(281, 281, 281)
                    .addComponent(btnCancel)
                    .addContainerGap(24, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelheader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        close();
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminiMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblminiMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        TableUpdate();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        SearchBuyer d2 = new SearchBuyer();
        d2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed
    Connection con2;
    PreparedStatement insert;

    private void TableUpdate() {
        int c;
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "");
            String ns;
            switch (a) {
                case "a1":
                    ns = "select * from buyers where Name = '" + txtSearch.getText() + "'";
                    break;
                default:
                    ns = "select * from buyers where No = '" + txtSearch.getText() + "'";
                    break;

            }
            insert = con2.prepareStatement(ns);
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            c = rsmd.getColumnCount();

            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
            df.setRowCount(0);

            while (rs.next()) {
                Vector v1 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v1.add(rs.getString("No"));
                    v1.add(rs.getString("Name"));
                    v1.add(rs.getString("Bloodgroup"));
                    v1.add(rs.getString("Date"));
                    v1.add(rs.getString("Mobile"));
                    v1.add(rs.getString("Address"));
                    v1.add(rs.getString("adhaar"));
                }
                df.addRow(v1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyerTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BuyerTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelheader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblheader;
    private javax.swing.JLabel lblmini;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
