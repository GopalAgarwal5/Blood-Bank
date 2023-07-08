package app;

import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;

public class MainUI extends javax.swing.JFrame 
{
    public MainUI() {
        initComponents();
    }
    public void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelheader = new javax.swing.JPanel();
        lblheader = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblmini = new javax.swing.JLabel();
        jPanelBody = new javax.swing.JPanel();
        btnsearchdonor = new javax.swing.JButton();
        btnnewdonor = new javax.swing.JButton();
        btnsearchbuyer = new javax.swing.JButton();
        btnsellblood = new javax.swing.JButton();
        btnpackets = new javax.swing.JButton();
        lbllogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Blood Bank");
        setBackground(java.awt.Color.white);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        jPanelheader.setBackground(new java.awt.Color(248, 148, 6));
        jPanelheader.setPreferredSize(new java.awt.Dimension(900, 100));

        lblheader.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 50)); // NOI18N
        lblheader.setForeground(java.awt.Color.white);
        lblheader.setText("Blood Bank");

        lblClose.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        lblClose.setText("x");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        lblmini.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lblmini.setText("-");
        lblmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelheaderLayout = new javax.swing.GroupLayout(jPanelheader);
        jPanelheader.setLayout(jPanelheaderLayout);
        jPanelheaderLayout.setHorizontalGroup(
            jPanelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelheaderLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblheader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblmini, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClose)
                .addContainerGap())
        );
        jPanelheaderLayout.setVerticalGroup(
            jPanelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelheaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanelheaderLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblheader)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanelBody.setBackground(new java.awt.Color(44, 62, 80));
        jPanelBody.setPreferredSize(new java.awt.Dimension(1366, 1366));

        btnsearchdonor.setText("Search Donor");
        btnsearchdonor.setToolTipText("Click to Search Donor");
        btnsearchdonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchdonorActionPerformed(evt);
            }
        });

        btnnewdonor.setText("New Donor");
        btnnewdonor.setToolTipText("Click to New Donor");
        btnnewdonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewdonorActionPerformed(evt);
            }
        });

        btnsearchbuyer.setText("Search Buyer");
        btnsearchbuyer.setToolTipText("Click to Search Buyer");
        btnsearchbuyer.setBorder(null);
        btnsearchbuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchbuyerActionPerformed(evt);
            }
        });

        btnsellblood.setText("Sell Blood");
        btnsellblood.setToolTipText("Click to Sell Blood");
        btnsellblood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsellbloodActionPerformed(evt);
            }
        });

        btnpackets.setText("No. Of Blood Packets Available");
        btnpackets.setToolTipText("Get Number Of Blood Packets Available");
        btnpackets.setBorder(null);
        btnpackets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpacketsActionPerformed(evt);
            }
        });

        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/blood bank 2.png"))); // NOI18N

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnnewdonor, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnsellblood, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearchbuyer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpackets, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearchdonor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBodyLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnnewdonor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnsearchdonor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnsellblood, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnsearchbuyer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnpackets, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelheader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnnewdonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewdonorActionPerformed
        Newdonor p = new Newdonor();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnnewdonorActionPerformed

    private void btnpacketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpacketsActionPerformed
        BloodPeckets bp = new BloodPeckets();
        bp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnpacketsActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        close();       
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminiMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblminiMouseClicked

    private void btnsearchdonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchdonorActionPerformed
        SearchDonor sd = new SearchDonor();
        sd.setVisible(true);      
        this.dispose();
    }//GEN-LAST:event_btnsearchdonorActionPerformed

    private void btnsellbloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsellbloodActionPerformed
        Sellblood sb = new Sellblood();
        sb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsellbloodActionPerformed

    private void btnsearchbuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchbuyerActionPerformed
        SearchBuyer sbuyer = new SearchBuyer();
        sbuyer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsearchbuyerActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
    }//GEN-LAST:event_formMouseDragged
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Ninbus".equals(info.getName())) {
                    try {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    } catch (InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    }
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
 
            new MainUI().setVisible(true);
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnewdonor;
    private javax.swing.JButton btnpackets;
    private javax.swing.JButton btnsearchbuyer;
    private javax.swing.JButton btnsearchdonor;
    private javax.swing.JButton btnsellblood;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelheader;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblheader;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblmini;
    // End of variables declaration//GEN-END:variables
}
