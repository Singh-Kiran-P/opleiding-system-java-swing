/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel.opleiding.Admin;

import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import jpanel.opleiding.Auth.Login;
import jpanel.opleiding.MyConnection;
import jpanel.opleiding.Auth.Login;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import jpanel.opleiding.MyConnection;

/**
 *
 * @author singh
 */
public class SurveyTonen extends javax.swing.JFrame {

    private int opleidingID;

    public void setopleidingID(int id) {
        this.opleidingID = id;
    }

    /**
     * Creates new form SurveyTonen
     */
    public SurveyTonen() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        list_opleiding = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_Verwijderen = new javax.swing.JButton();
        btn_Toevoegen = new javax.swing.JButton();
        btn_Wijzigen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(list_opleiding);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 30, 680, 220);

        jPanel3.setBackground(new java.awt.Color(0, 102, 203));

        jLabel5.setBackground(new java.awt.Color(240, 240, 241));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 31, 29);

        btn_Verwijderen.setText("Verwijderen");
        btn_Verwijderen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerwijderenActionPerformed(evt);
            }
        });

        btn_Toevoegen.setText("Toevoegen");
        btn_Toevoegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ToevoegenActionPerformed(evt);
            }
        });

        btn_Wijzigen.setText("Wijzigen");
        btn_Wijzigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_WijzigenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btn_Verwijderen, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btn_Toevoegen, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btn_Wijzigen, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_Wijzigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Verwijderen)
                        .addComponent(btn_Toevoegen)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 250, 740, 60);

        jLabel1.setText("Vragen");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 10, 100, 13);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        Admin_page mf = new Admin_page();
        // set the jframe size and location, and make it visible
        mf.setPreferredSize(new Dimension(950, 350));
        mf.pack();
        mf.setTitle("Opleiding System");
        mf.main();
        mf.listInladen();
        mf.setLocationRelativeTo(null);
        mf.setVisible(rootPaneCheckingEnabled);

        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btn_ToevoegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ToevoegenActionPerformed
        // TODO add your handling code here:
        SurveyToevoegen1 st = new SurveyToevoegen1();
        st.setVisible(rootPaneCheckingEnabled);
        st.setPreferredSize(new Dimension(605, 240));
        st.setopleidingID(opleidingID);
        st.pack();
        st.setLocationRelativeTo(null);
        st.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_ToevoegenActionPerformed

    private void btn_VerwijderenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerwijderenActionPerformed
        try {
            // TODO add your handling code here:
            verwijder_vraag_DB();
        } catch (Exception ex) {
            Logger.getLogger(SurveyTonen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_VerwijderenActionPerformed

    private void btn_WijzigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_WijzigenActionPerformed
        // TODO add your handling code here:

        int firstSelIx = list_opleiding.getSelectedIndex();
        Object sel = list_opleiding.getModel().getElementAt(firstSelIx);
        String string = sel.toString();
        String[] parts = string.split("°");
        String vraag = parts[0].trim();
        String[] partss = string.split("");
        
        VraagWijzigen st = new VraagWijzigen();
        st.setVisible(rootPaneCheckingEnabled);
        st.setPreferredSize(new Dimension(578, 165));
        st.pack();
        st.setopleidingID(opleidingID);
        st.setVraag(vraag);
        st.setVraagId(Integer.parseInt( parts[1]));
        st.load();
        st.setLocationRelativeTo(null);
        st.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_WijzigenActionPerformed
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public void verwijder_vraag_DB() throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = MyConnection.getConnection();
            // PreparedStatements can use variables and are more efficient
            preparedStatement = connect
                    .prepareStatement("DELETE FROM `vragen` WHERE `vragen`.`id` = ?");
            // "myuser, webpage, datum, summary, COMMENTS from feedback.comments");
            // Parameters start with 1
            int firstSelIx = list_opleiding.getSelectedIndex();
            Object sel = list_opleiding.getModel().getElementAt(firstSelIx);
            String string = sel.toString();
            String[] parts = string.split("°");
            String vraagId = parts[1];

            preparedStatement.setString(1, vraagId);

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vraag verwijderd");

            listInladen();

        } catch (Exception e) {
            throw e;
        }

    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SurveyTonen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SurveyTonen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SurveyTonen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SurveyTonen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SurveyTonen().setVisible(true);
            }
        });
    }

    public void listInladen() {

        PreparedStatement ps;
        ResultSet rs;
        DefaultListModel model = new DefaultListModel();

        String query = "SELECT * FROM `vragen` WHERE opleidingId =  ?";

        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setInt(1, this.opleidingID);
            rs = ps.executeQuery();

            int vraagnummer = 1;
            while (rs.next()) {

                model.addElement( rs.getString("vraag") + "                                                                                                                                                                                                                                                                                                                                       °" + rs.getString("id"));
                vraagnummer += 1;
                // this.dispose();
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        jScrollPane1.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);

        list_opleiding.setModel(model);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Toevoegen;
    private javax.swing.JButton btn_Verwijderen;
    private javax.swing.JButton btn_Wijzigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list_opleiding;
    // End of variables declaration//GEN-END:variables
}
