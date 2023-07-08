package app;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class SearchDonor extends javax.swing.JFrame {

    public static String action;

    public SearchDonor() {
        initComponents();
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelheader = new javax.swing.JPanel();
        lblmini = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        lblheader = new javax.swing.JLabel();
        jPanelbody = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        radiobtnno = new javax.swing.JRadioButton();
        radiobtngroup = new javax.swing.JRadioButton();
        radiobtnname = new javax.swing.JRadioButton();
        radiobtndate = new javax.swing.JRadioButton();
        lblsearchby = new javax.swing.JLabel();

        setUndecorated(true);

        jPanelheader.setBackground(new java.awt.Color(248, 148, 6));

        lblmini.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lblmini.setText("-");
        lblmini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminiMouseClicked(evt);
            }
        });

        lblclose.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        lblclose.setText("x");
        lblclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
        });

        lblheader.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        lblheader.setForeground(new java.awt.Color(255, 255, 255));
        lblheader.setText("Search Donor");

        javax.swing.GroupLayout jPanelheaderLayout = new javax.swing.GroupLayout(jPanelheader);
        jPanelheader.setLayout(jPanelheaderLayout);
        jPanelheaderLayout.setHorizontalGroup(
            jPanelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelheaderLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(lblheader, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(lblmini)
                .addGap(18, 18, 18)
                .addComponent(lblclose)
                .addContainerGap())
        );
        jPanelheaderLayout.setVerticalGroup(
            jPanelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblclose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblheader, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(lblmini, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelbody.setBackground(new java.awt.Color(44, 62, 80));
        jPanelbody.setForeground(new java.awt.Color(228, 241, 254));
        jPanelbody.setPreferredSize(new java.awt.Dimension(850, 1350));

        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/tet-search-graphics.png"))); // NOI18N

        radiobtnno.setBackground(new java.awt.Color(44, 62, 80));
        radiobtnno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radiobtnno.setForeground(java.awt.Color.white);
        radiobtnno.setText("By Packet No.");
        radiobtnno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnnoActionPerformed(evt);
            }
        });

        radiobtngroup.setBackground(new java.awt.Color(44, 62, 80));
        radiobtngroup.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radiobtngroup.setForeground(java.awt.Color.white);
        radiobtngroup.setText(" By Group");
        radiobtngroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtngroupActionPerformed(evt);
            }
        });

        radiobtnname.setBackground(new java.awt.Color(44, 62, 80));
        radiobtnname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radiobtnname.setForeground(java.awt.Color.white);
        radiobtnname.setText("By Donor Name");
        radiobtnname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnnameActionPerformed(evt);
            }
        });

        radiobtndate.setBackground(new java.awt.Color(44, 62, 80));
        radiobtndate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radiobtndate.setForeground(java.awt.Color.white);
        radiobtndate.setText("By Date");
        radiobtndate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtndateActionPerformed(evt);
            }
        });

        lblsearchby.setFont(new java.awt.Font("Footlight MT Light", 1, 48)); // NOI18N
        lblsearchby.setForeground(java.awt.Color.white);
        lblsearchby.setText("Search By");

        javax.swing.GroupLayout jPanelbodyLayout = new javax.swing.GroupLayout(jPanelbody);
        jPanelbody.setLayout(jPanelbodyLayout);
        jPanelbodyLayout.setHorizontalGroup(
            jPanelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbodyLayout.createSequentialGroup()
                .addComponent(lbllogo)
                .addGap(0, 1, Short.MAX_VALUE)
                .addGroup(jPanelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(radiobtnname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radiobtndate)
                        .addComponent(radiobtnno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radiobtngroup))
                    .addComponent(lblsearchby))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanelbodyLayout.setVerticalGroup(
            jPanelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbodyLayout.createSequentialGroup()
                .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
            .addGroup(jPanelbodyLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblsearchby)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radiobtnno)
                .addGap(50, 50, 50)
                .addComponent(radiobtngroup)
                .addGap(53, 53, 53)
                .addComponent(radiobtnname)
                .addGap(50, 50, 50)
                .addComponent(radiobtndate)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelheader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelbody, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelbody, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
        );

        jPanelbody.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminiMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblminiMouseClicked

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked

        MainUI m = new MainUI();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblcloseMouseClicked

    private void radiobtnnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnnoActionPerformed
        action = "a1";
        DonorTable d1 = new DonorTable();
        d1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_radiobtnnoActionPerformed

    private void radiobtngroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtngroupActionPerformed
        action = "a2";
        DonorTable d1 = new DonorTable();
        d1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_radiobtngroupActionPerformed

    private void radiobtnnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnnameActionPerformed
        action = "a3";
        DonorTable d1 = new DonorTable();
        d1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_radiobtnnameActionPerformed

    private void radiobtndateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtndateActionPerformed
        action = "a4";
        DonorTable d1 = new DonorTable();
        d1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_radiobtndateActionPerformed

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
            java.util.logging.Logger.getLogger(SearchDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanelbody;
    private javax.swing.JPanel jPanelheader;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblheader;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblmini;
    private javax.swing.JLabel lblsearchby;
    private javax.swing.JRadioButton radiobtndate;
    private javax.swing.JRadioButton radiobtngroup;
    private javax.swing.JRadioButton radiobtnname;
    private javax.swing.JRadioButton radiobtnno;
    // End of variables declaration//GEN-END:variables
}
