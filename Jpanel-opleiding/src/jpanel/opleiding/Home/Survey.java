/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel.opleiding.Home;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import jpanel.opleiding.Auth.Login;
import jpanel.opleiding.MyConnection;

import javax.swing.DefaultListModel;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import jpanel.opleiding.Auth.Login;
import jpanel.opleiding.MyConnection;

import java.awt.Dimension;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jpanel.opleiding.Admin.Admin_page;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.WindowEvent;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.JOptionPane;
import jpanel.opleiding.MyConnection;

/**
 *
 * @author singh
 */
public class Survey extends javax.swing.JFrame {

    public userData DataUser;
    public int opleidingId;
    private final ArrayList<Vragen> vragenList = new ArrayList<>();

    public void setOpleidingId(int id) {
        this.opleidingId = id;
    }

    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    /**
     * Creates new form Survey
     */
    public Survey() {
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

        jPanel1 = new javax.swing.JPanel();
        txt_antwoord = new javax.swing.JTextField();
        txt_vraag = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btn_Next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        txt_antwoord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_antwoordActionPerformed(evt);
            }
        });
        jPanel1.add(txt_antwoord);
        txt_antwoord.setBounds(0, 40, 620, 30);

        txt_vraag.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txt_vraag.setText("Vraag ?");
        jPanel1.add(txt_vraag);
        txt_vraag.setBounds(0, 0, 620, 30);

        jButton1.setText("Back");

        btn_Next.setText("Next");
        btn_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(457, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(447, Short.MAX_VALUE)
                    .addComponent(btn_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btn_Next, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_antwoordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_antwoordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_antwoordActionPerformed

    private void btn_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NextActionPerformed
        // TODO add your handling code here:

        Vragen oVragen;
        oVragen = vragenList.get(vragenTeler);
        var id = oVragen.getId();
        try {
            submitAntwoord(id);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Survey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        if (vragenTeler < vragenSize - 1) {
            vragenTeler++;
            ToonVraag();
        } else {
            JOptionPane.showMessageDialog(null, "Bedankt voor u deelname");
            Home_JFrame mf = new Home_JFrame();
            // set the jframe size and location, and make it visible
            mf.setPreferredSize(new Dimension(812, 490));
            mf.pack();
            mf.setTitle("Opleiding System");
            mf.setLocationRelativeTo(null);
            mf.setVisible(rootPaneCheckingEnabled);
            mf.main();
            mf.inLaden();
            this.setVisible(false);
            return;
        }
    }//GEN-LAST:event_btn_NextActionPerformed

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
            java.util.logging.Logger.getLogger(Survey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Survey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Survey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Survey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Survey().setVisible(true);
            }
        });
    }

    public void load() {
        DataUser = Login.user_Data;
        vragenLaden();

    }

    public void vragenLaden() {

        PreparedStatement ps;
        ResultSet rs;

        String query = "SELECT * FROM `vragen` WHERE `opleidingId` = ?";

        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            var user_data = Login.user_Data;
            ps.setInt(1, opleidingId);
            rs = ps.executeQuery();

            while (rs.next()) {

                Vragen vraagElement = buildVraag(rs);
                vragenList.add(vraagElement);
                // this.dispose();
            }
            vragenSize = vragenList.size();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    private Vragen buildVraag(ResultSet result) throws SQLException {
        Vragen vraag = new Vragen();
        vraag.setId(result.getInt("id"));
        vraag.setVraag(result.getString("vraag"));
        vraag.setVraagSoort(result.getString("vraagSoort"));
        vraag.setOpleidingId(result.getInt("opleidingId"));

        return vraag;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Next;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_antwoord;
    private javax.swing.JLabel txt_vraag;
    // End of variables declaration//GEN-END:variables
    public int vragenSize;
    public int vragenTeler = 0;

    public void ToonVraag() {
        Vragen oVragen;
        oVragen = vragenList.get(vragenTeler);
        txt_vraag.setText(oVragen.getVraag());

    }

    private void submitAntwoord(int id) throws Exception {
        String antwoord = txt_antwoord.getText();
        int vraagId = id;
        String userId = DataUser.getId();

        // This will load the MySQL driver, each DB has its own driver
        Class.forName("com.mysql.jdbc.Driver");
        // Setup the connection with the DB
        connect = MyConnection.getConnection();

        // PreparedStatements can use variables and are more efficient
        preparedStatement = connect
                .prepareStatement("INSERT INTO `antwoorden` (`id`, `antwoord`, `vraagId`, `userId`) VALUES (NULL, ?, ?,?)");
        // "myuser, webpage, datum, summary, COMMENTS from feedback.comments");
        // Parameters start with 1
        preparedStatement.setString(1, antwoord);
        preparedStatement.setInt(2, vraagId);
        preparedStatement.setString(3, userId);

        preparedStatement.executeUpdate();

    }

}
