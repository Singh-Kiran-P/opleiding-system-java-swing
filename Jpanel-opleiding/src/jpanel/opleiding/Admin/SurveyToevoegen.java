/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel.opleiding.Admin;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import jpanel.opleiding.MyConnection;

/**
 *
 * @author singh
 */
public class SurveyToevoegen extends javax.swing.JFrame {

    private int opleidingID;

    public void setopleidingID(int id) {
        this.opleidingID = id;
    }

    /**
     * Creates new form SurveyToevoegen
     */
    public SurveyToevoegen() {
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

        soortVraag = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_vraag = new javax.swing.JTextArea();
        btn_Toevoegen = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbtn_ja_nee = new javax.swing.JRadioButton();
        rbtn_Meerkeuze = new javax.swing.JRadioButton();
        rbtn_Schaalvraag = new javax.swing.JRadioButton();
        rbtn_Openvraag = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txt_vraag.setColumns(20);
        txt_vraag.setRows(5);
        jScrollPane1.setViewportView(txt_vraag);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 570, 70);

        btn_Toevoegen.setText("Vraag Toevoegen");
        btn_Toevoegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ToevoegenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Toevoegen);
        btn_Toevoegen.setBounds(10, 140, 140, 30);

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

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

        soortVraag.add(rbtn_ja_nee);
        rbtn_ja_nee.setText("Ja/Nee vraag");

        soortVraag.add(rbtn_Meerkeuze);
        rbtn_Meerkeuze.setText("Meerkeuze vraag");

        soortVraag.add(rbtn_Schaalvraag);
        rbtn_Schaalvraag.setText("Schaal vraag");

        soortVraag.add(rbtn_Openvraag);
        rbtn_Openvraag.setText("Open vraag");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtn_ja_nee, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(rbtn_Meerkeuze, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(rbtn_Schaalvraag, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(rbtn_Openvraag, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_ja_nee)
                    .addComponent(rbtn_Meerkeuze)
                    .addComponent(rbtn_Schaalvraag)
                    .addComponent(rbtn_Openvraag))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 100, 580, 40);

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

        rbtn_Meerkeuze.setActionCommand("meerkeuze");
        rbtn_Openvraag.setActionCommand("openvraag");
        rbtn_Schaalvraag.setActionCommand("schaalvraag");
        rbtn_ja_nee.setActionCommand("ja-nee");
        
        try {
            
            sendVraag_Db();
        } catch (Exception ex) {
            Logger.getLogger(SurveyToevoegen.class.getName()).log(Level.SEVERE, null, ex);
        }
        


    }//GEN-LAST:event_btn_ToevoegenActionPerformed

    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public void sendVraag_Db() throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = MyConnection.getConnection();

            // PreparedStatements can use variables and are more efficient
            preparedStatement = connect
                    .prepareStatement("INSERT INTO `vragen` (`id`, `vraag`, `vraagSoort`, `opleidingId`) VALUES (NULL, ?, ?, ?)");
            // "myuser, webpage, datum, summary, COMMENTS from feedback.comments");
            // Parameters start with 1
            
            String soortvraag = soortVraag.getSelection().getActionCommand();
            preparedStatement.setString(1, txt_vraag.getText());
            preparedStatement.setString(2, soortvraag);
            preparedStatement.setInt(3, this.opleidingID);

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "vraag toegevoegd");       
            txt_vraag.setText("");

        } catch (Exception e) {
            throw e;
        }

    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Toevoegen;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtn_Meerkeuze;
    private javax.swing.JRadioButton rbtn_Openvraag;
    private javax.swing.JRadioButton rbtn_Schaalvraag;
    private javax.swing.JRadioButton rbtn_ja_nee;
    private javax.swing.ButtonGroup soortVraag;
    private javax.swing.JTextArea txt_vraag;
    // End of variables declaration//GEN-END:variables
}
