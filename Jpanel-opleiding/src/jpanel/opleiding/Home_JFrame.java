/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel.opleiding;

import jpanel.opleiding.Login;

/**
 *
 * @author singh
 */
public class Home_JFrame extends javax.swing.JFrame {

    private String[] info;

    public void setInfo(String[] info) {
        this.info = info;
    }

    /**
     * Creates new form Home_JFrame
     */
    public Home_JFrame() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Profile_Panel = new javax.swing.JPanel();
        txt_username = new javax.swing.JLabel();
        txt_username1 = new javax.swing.JLabel();
        txt_username2 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        txt_username3 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_Name = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        txt_user = new javax.swing.JTextField();
        txt_role = new javax.swing.JTextField();
        txt_username4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_Profile = new javax.swing.JButton();
        btn_Profile1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Profile_Panel.setLayout(null);

        txt_username.setText("email");
        Profile_Panel.add(txt_username);
        txt_username.setBounds(70, 180, 40, 20);

        txt_username1.setText("Name");
        Profile_Panel.add(txt_username1);
        txt_username1.setBounds(70, 60, 60, 20);

        txt_username2.setText("Firstname");
        Profile_Panel.add(txt_username2);
        txt_username2.setBounds(70, 100, 140, 20);

        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        Profile_Panel.add(btn_logout);
        btn_logout.setBounds(460, 420, 100, 21);

        txt_username3.setText("Username");
        Profile_Panel.add(txt_username3);
        txt_username3.setBounds(70, 140, 60, 20);
        Profile_Panel.add(txt_email);
        txt_email.setBounds(140, 170, 230, 30);
        Profile_Panel.add(txt_Name);
        txt_Name.setBounds(140, 50, 230, 30);
        Profile_Panel.add(txt_firstname);
        txt_firstname.setBounds(140, 90, 230, 30);
        Profile_Panel.add(txt_user);
        txt_user.setBounds(140, 130, 230, 30);
        Profile_Panel.add(txt_role);
        txt_role.setBounds(140, 210, 230, 30);

        txt_username4.setText("role");
        Profile_Panel.add(txt_username4);
        txt_username4.setBounds(70, 210, 40, 20);

        getContentPane().add(Profile_Panel);
        Profile_Panel.setBounds(230, 0, 570, 500);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        btn_Profile.setBackground(new java.awt.Color(255, 255, 255));
        btn_Profile.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_Profile.setText("Profile");
        btn_Profile.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProfileActionPerformed(evt);
            }
        });

        btn_Profile1.setBackground(new java.awt.Color(255, 255, 255));
        btn_Profile1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_Profile1.setText("Profile");
        btn_Profile1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Profile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Profile1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Profile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Profile1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btn_Profile1)
                .addGap(26, 26, 26)
                .addComponent(btn_Profile)
                .addContainerGap(365, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProfileActionPerformed
        // TODO add your handling code here:
        Profile_Panel.setVisible(true);
    }//GEN-LAST:event_btn_ProfileActionPerformed

    private void btn_Profile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Profile1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Profile1ActionPerformed

    public void inLaden() {
        txt_user.setText(info[3]);
        txt_role.setText(info[0]);
        txt_Name.setText(info[1]);
        txt_firstname.setText(info[2]);
        txt_email.setText(info[4]);
    }

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Home_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_JFrame().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Profile_Panel;
    private javax.swing.JButton btn_Profile;
    private javax.swing.JButton btn_Profile1;
    private javax.swing.JButton btn_logout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_role;
    private javax.swing.JTextField txt_user;
    private javax.swing.JLabel txt_username;
    private javax.swing.JLabel txt_username1;
    private javax.swing.JLabel txt_username2;
    private javax.swing.JLabel txt_username3;
    private javax.swing.JLabel txt_username4;
    // End of variables declaration//GEN-END:variables
}