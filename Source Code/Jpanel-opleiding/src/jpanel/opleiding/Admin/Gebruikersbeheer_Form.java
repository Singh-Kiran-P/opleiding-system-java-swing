/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel.opleiding.Admin;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import javax.swing.table.DefaultTableModel;
import jpanel.opleiding.Auth.Login;
import jpanel.opleiding.Home.userData;
import jpanel.opleiding.MyConnection;
import jpanel.opleiding.Auth.Login;
import jpanel.opleiding.Admin.OpleidingToevoegen;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import jpanel.opleiding.MyConnection;
import jpanel.opleiding.MyConnection;

/**
 *
 * @author singh
 */
public class Gebruikersbeheer_Form extends javax.swing.JFrame {

    /**
     * Creates new form Gebruikersbeheer_Form
     */
    public Gebruikersbeheer_Form() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btn_Update = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_user = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_opleiding = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listVragen = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listUsers = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 330, 950, 60);

        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        tbl_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbl_user);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(475, 475, 475)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btn_Update)
                .addGap(21, 21, 21))
        );

        jTabbedPane2.addTab("Users", jPanel2);

        jScrollPane1.setViewportView(list_opleiding);

        jScrollPane3.setViewportView(listVragen);

        jScrollPane4.setViewportView(listUsers);

        jLabel1.setText("Opleidingen");

        jLabel2.setText("Survey vragen");

        jLabel3.setText("Deelnemers");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 361, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Survey", jPanel5);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(10, 50, 960, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Admin_page mf = new Admin_page();
        // set the jframe size and location, and make it visible
        mf.setPreferredSize(new Dimension(950, 345));
        mf.pack();
        mf.setTitle("Opleiding System");
        mf.setLocationRelativeTo(null);
        mf.setVisible(rootPaneCheckingEnabled);
        mf.listInladen();
        mf.main();

        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm01 = (DefaultTableModel) tbl_user.getModel();
        PreparedStatement ps;
        ResultSet rs;
        String sd0 = null;
        for (int i = 1; i < dtm01.getColumnCount(); i++) {

            //  System.out.println(dtm01.getColumnName(1));
            for (int j = 0; j < dtm01.getRowCount(); j++) {
                try {
                    sd0 = dtm01.getValueAt(j, i).toString();

                    String sql = "update user set " + dtm01.getColumnName(i) + "='" + sd0 + "' where id='" + dtm01.getValueAt(j, 0).toString() + "'";

                    ps = MyConnection.getConnection().prepareStatement(sql);
                    ps.executeUpdate();

                    System.out.println(sql);
                } catch (SQLException ex) {
                    // Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
        JOptionPane.showMessageDialog(null, "Table updated !");

    }//GEN-LAST:event_btn_UpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Gebruikersbeheer_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gebruikersbeheer_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gebruikersbeheer_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gebruikersbeheer_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gebruikersbeheer_Form().setVisible(true);
            }
        });
    }
    public userData DataUser;
    public String opleidingId;

    public void main() {
        DataUser = Login.user_Data;
//        MouseListener mouseListener = new MouseAdapter() {
//            public void mouseClicked(MouseEvent mouseEvent) {
//                JList<String> theList = (JList) mouseEvent.getSource();
//                if (mouseEvent.getClickCount() == 1) {
//                    int index = theList.locationToIndex(mouseEvent.getPoint());
//                    if (index >= 0) {
//                        Object o = theList.getModel().getElementAt(index);
//                        String[] parts = o.toString().split("°");
//                        String opleiding_Id = parts[1];
//                        System.out.println(opleiding_Id);
//
//                    }
//                }
//            }
//        };
//        tbl_user.addMouseListener(mouseListener);
        tblInladen();
        list_opleidingInladen();

        MouseListener mouseListener = new MouseAdapter() {
            public void mouseClicked(MouseEvent mouseEvent) {
                JList<String> theList = (JList) mouseEvent.getSource();
                if (mouseEvent.getClickCount() == 1) {
                    int index = theList.locationToIndex(mouseEvent.getPoint());
                    if (index >= 0) {
                        Object o = theList.getModel().getElementAt(index);
                        String[] parts = o.toString().split("°");
                        String opleiding_id = parts[1];

                        opleidingId = opleiding_id;
                        System.out.println(opleiding_id);
                        UserperOpleiding(opleiding_id);

                        DefaultListModel listModel = (DefaultListModel) listVragen.getModel();
                        listModel.removeAllElements();

                    }
                }
            }

        };
        list_opleiding.addMouseListener(mouseListener);

        MouseListener mouseListener1 = new MouseAdapter() {
            public void mouseClicked(MouseEvent mouseEvent) {
                JList<String> theList1 = (JList) mouseEvent.getSource();
                if (mouseEvent.getClickCount() == 1) {
                    int index = theList1.locationToIndex(mouseEvent.getPoint());
                    if (index >= 0) {
                        Object o = theList1.getModel().getElementAt(index);
                        String[] parts = o.toString().split("°");
                        String UserId = parts[1];

                        System.out.println(UserId);
                        showvragen(opleidingId, UserId);

                    }
                }
            }

        };
        listUsers.addMouseListener(mouseListener1);

    }

    public void tblInladen() {

        PreparedStatement ps;
        ResultSet rs;

        String[] columnNames = {"id ", "role", "name", "firstname", "gender", "birthDate", "username", "email"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        String query = "SELECT * FROM `user`";

        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            var user_data = Login.user_Data;
            rs = ps.executeQuery();

            while (rs.next()) {
                String id = rs.getString("id");
                String role = rs.getString("role");
                String name = rs.getString("name");
                String firstname = rs.getString("firstname");
                String gender = rs.getString("gender");
                String birthDate = rs.getString("birthDate");
                String username = rs.getString("username");
                String email = rs.getString("email");

                // create a single array of one row's worth of data
                String[] data = {id, role, name, firstname, gender, birthDate, username, email};

                // and add this row of data into the table model
                tableModel.addRow(data);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        tbl_user.setModel(tableModel);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_Update;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JList<String> listUsers;
    private javax.swing.JList<String> listVragen;
    private javax.swing.JList<String> list_opleiding;
    private javax.swing.JTable tbl_user;
    // End of variables declaration//GEN-END:variables

    public void list_opleidingInladen() {
        PreparedStatement ps;
        ResultSet rs;

        DefaultListModel model = new DefaultListModel();

        String query = "SELECT * FROM `opleiding`";

        try {
            ps = MyConnection.getConnection().prepareStatement(query);

            rs = ps.executeQuery();

            while (rs.next()) {

                model.addElement(rs.getString("opleiding") + "                                                                          °" + rs.getString("id") + "");

                // this.dispose();
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        jScrollPane1.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);

        list_opleiding.setModel(model);

    }

    public void showvragen(String opleiding_Id, String userId) {

        listVragen.setVisible(true);
        PreparedStatement ps;
        ResultSet rs;
        DefaultListModel model = new DefaultListModel();

        String query = "SELECT * FROM `vragen` WHERE opleidingId =  ?";

        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, opleiding_Id);
            rs = ps.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Geen survey gevond voor deze user");

            }
            int vraagnummer = 1;
            while (rs.next()) {

                String Antwoord = ToonAntwoord(rs.getString("id"), userId);

                model.addElement(vraagnummer + "° " + rs.getString("vraag") + "  Antwoord: " + Antwoord);
                vraagnummer += 1;
                // this.dispose();
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        listVragen.setModel(model);

    }

    public void UserperOpleiding(String opleiding_Id) {
        PreparedStatement ps;
        ResultSet rs;
        DefaultListModel model = new DefaultListModel();

        String query = "SELECT user.id,user.firstname,user.name from user_opleiding inner join user on user_opleiding.userId = user.id where opleidingId = ?";

        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, opleiding_Id);
            rs = ps.executeQuery();

            while (rs.next()) {

                model.addElement(rs.getString("firstname") + " " + rs.getString("name") + "                                                                                                                                                                                                                                                                                                                                       °" + rs.getString("id"));

                // this.dispose();
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        jScrollPane4.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);

        listUsers.setModel(model);
    }

    private String ToonAntwoord(String vraagId, String userId) {

        PreparedStatement ps;
        ResultSet rs;
        DefaultListModel model = new DefaultListModel();

        String query = "SELECT * From antwoorden WHERE vraagId = ? && userId = ?";
        String antwoord = "";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, vraagId);
            ps.setString(2, userId);

            rs = ps.executeQuery();

            while (rs.next()) {

                antwoord = rs.getString("antwoord");
                // this.dispose();
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return antwoord;
    }
}
