package app;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class SearchBuyer extends javax.swing.JFrame {

    public static String action;

    public SearchBuyer() {
        initComponents();
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
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
        radiobtnno = new javax.swing.JRadioButton();
        radiobtnname = new javax.swing.JRadioButton();
        btncancel = new javax.swing.JButton();
        lblsearchby = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanelHeader.setBackground(new java.awt.Color(248, 148, 6));

        lblmini.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lblmini.setText("-");
        lblmini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminiMouseClicked(evt);
            }
        });

        lblClose.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        lblClose.setText("x");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("Search BUYER");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(lblHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                .addComponent(lblmini)
                .addGap(18, 18, 18)
                .addComponent(lblClose)
                .addContainerGap())
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(lblmini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelBody.setBackground(new java.awt.Color(44, 62, 80));

        radiobtnno.setBackground(new java.awt.Color(44, 62, 80));
        radiobtnno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radiobtnno.setForeground(java.awt.Color.white);
        radiobtnno.setText("By Packet No. ");
        radiobtnno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radiobtnno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnnoActionPerformed(evt);
            }
        });

        radiobtnname.setBackground(new java.awt.Color(44, 62, 80));
        radiobtnname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radiobtnname.setForeground(java.awt.Color.white);
        radiobtnname.setText("By Name");
        radiobtnname.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radiobtnname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnnameActionPerformed(evt);
            }
        });

        btncancel.setBackground(new java.awt.Color(255, 51, 51));
        btncancel.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btncancel.setForeground(java.awt.Color.white);
        btncancel.setText("Cancel");
        btncancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        lblsearchby.setBackground(new java.awt.Color(44, 62, 80));
        lblsearchby.setFont(new java.awt.Font("Footlight MT Light", 1, 48)); // NOI18N
        lblsearchby.setForeground(java.awt.Color.white);
        lblsearchby.setText("Search By");

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(radiobtnname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radiobtnno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblsearchby))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblsearchby)
                .addGap(65, 65, 65)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobtnname)
                    .addComponent(radiobtnno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btncancel)
                .addGap(36, 36, 36))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void radiobtnnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnnoActionPerformed
        action = "a2";
        BuyerTable b1 = new BuyerTable();
        b1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_radiobtnnoActionPerformed

    private void radiobtnnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnnameActionPerformed
        action = "a1";
        BuyerTable b1 = new BuyerTable();
        b1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_radiobtnnameActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        MainUI m = new MainUI();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncancelActionPerformed

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
            java.util.logging.Logger.getLogger(SearchBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SearchBuyer().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblmini;
    private javax.swing.JLabel lblsearchby;
    private javax.swing.JRadioButton radiobtnname;
    private javax.swing.JRadioButton radiobtnno;
    // End of variables declaration//GEN-END:variables
}
