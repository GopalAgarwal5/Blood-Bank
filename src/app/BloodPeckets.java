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

public class BloodPeckets extends javax.swing.JFrame {

    public BloodPeckets() {
        initComponents();
        TableUpdate();
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelheader = new javax.swing.JPanel();
        lblheader = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        lblmini = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnCancel = new javax.swing.JButton();

        setUndecorated(true);

        jPanelheader.setBackground(new java.awt.Color(248, 148, 6));

        lblheader.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        lblheader.setForeground(new java.awt.Color(255, 255, 255));
        lblheader.setText("Blood Packets");

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
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(lblheader, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(lblmini, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelheaderLayout.setVerticalGroup(
            jPanelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelheaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblheader, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
            .addComponent(lblclose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblmini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setForeground(new java.awt.Color(228, 241, 254));

        tblData.setBackground(new java.awt.Color(44, 62, 80));
        tblData.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tblData.setForeground(new java.awt.Color(204, 204, 204));
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A", null},
                {" B", null},
                {" AB", null},
                {" O", null},
                {"  A-", null},
                {" B-", null},
                {"AB-", null},
                {" O-", null}
            },
            new String [] {
                "Blood Group", "Packets"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblData.setIntercellSpacing(new java.awt.Dimension(100, 2));
        tblData.setName(""); // NOI18N
        tblData.setRowHeight(55);
        tblData.setRowSelectionAllowed(false);
        tblData.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblData);
        if (tblData.getColumnModel().getColumnCount() > 0) {
            tblData.getColumnModel().getColumn(0).setHeaderValue("Blood Group");
            tblData.getColumnModel().getColumn(1).setMinWidth(54);
            tblData.getColumnModel().getColumn(1).setPreferredWidth(22);
            tblData.getColumnModel().getColumn(1).setHeaderValue("Packets");
        }

        btnCancel.setBackground(new java.awt.Color(255, 51, 51));
        btnCancel.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setPreferredSize(new java.awt.Dimension(100, 29));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelheader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        close();
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminiMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblminiMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        MainUI m = new MainUI();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed
    Connection con2;
    PreparedStatement insert;

    private void TableUpdate() {
        int c;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "");
            String ns = "select * from bloodpackets";
            insert = con2.prepareStatement(ns);
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            c = rsmd.getColumnCount();

            DefaultTableModel df = (DefaultTableModel) tblData.getModel();
            df.setRowCount(0);

            while (rs.next()) {
                Vector v1 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v1.add(rs.getString("Group"));
                    v1.add(rs.getString("Packets"));

                }
                df.addRow(v1);
            }
        } catch (ClassNotFoundException | SQLException e) {
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
            java.util.logging.Logger.getLogger(BloodPeckets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BloodPeckets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelheader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblheader;
    private javax.swing.JLabel lblmini;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables
}
