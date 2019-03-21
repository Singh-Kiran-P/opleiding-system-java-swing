/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel.opleiding;

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

/**
 *
 * @author singh
 */
public class OpleidingToevoegen extends javax.swing.JFrame {

    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public void readDataBase() throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/stagedb?"
                            + "user=root&password=");

            // PreparedStatements can use variables and are more efficient
            preparedStatement = connect
                    .prepareStatement("INSERT INTO `opleiding` (`id`,`opleiding`,`location`,`datum`, `userId`) VALUES (NULL,?, ?, ?,'0')");
            // "myuser, webpage, datum, summary, COMMENTS from feedback.comments");
            // Parameters start with 1
            preparedStatement.setString(1, txt_opleiding.getText());
            preparedStatement.setString(2, txt_locatie.getText());

            String sDate1 = txt_datum.getText();
      

            preparedStatement.setDate(3, java.sql.Date.valueOf(sDate1));

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Opleiding Toegevoegd");
            Admin_page mf = new Admin_page();
            // set the jframe size and location, and make it visible
            mf.setPreferredSize(new Dimension(950, 350));
            mf.pack();
            mf.main();
            mf.listInladen();
            mf.setLocationRelativeTo(null);
            mf.setVisible(rootPaneCheckingEnabled);

            this.setVisible(false);

        } catch (Exception e) {
            throw e;
        }

    }

    /**
     * Creates new form OpleidingToevoegen
     */
    public OpleidingToevoegen() {
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

        jLabel1 = new javax.swing.JLabel();
        btn_toevoegen = new javax.swing.JButton();
        txt_locatie = new javax.swing.JTextField();
        txt_opleiding = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_datum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Opleiding Toevoegen");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 0, 170, 47);

        btn_toevoegen.setText("Toevoegen");
        btn_toevoegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_toevoegenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_toevoegen);
        btn_toevoegen.setBounds(100, 250, 130, 30);
        getContentPane().add(txt_locatie);
        txt_locatie.setBounds(50, 140, 240, 30);
        getContentPane().add(txt_opleiding);
        txt_opleiding.setBounds(50, 80, 240, 30);

        jLabel2.setText("Opleiding");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 60, 210, 13);

        jLabel3.setText("Locatie");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 120, 140, 13);
        getContentPane().add(txt_datum);
        txt_datum.setBounds(50, 200, 240, 30);

        jLabel4.setText("Datum");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 180, 140, 13);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_toevoegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_toevoegenActionPerformed
        try {
            readDataBase();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(OpleidingToevoegen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_toevoegenActionPerformed

    /**
     * @param args the command line arguments
     */
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_toevoegen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_datum;
    private javax.swing.JTextField txt_locatie;
    private javax.swing.JTextField txt_opleiding;
    // End of variables declaration//GEN-END:variables
}
