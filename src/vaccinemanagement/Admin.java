/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vaccinemanagement;


import java.awt.Color;
import javax.swing.JLabel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
/**
 *
 * @author shivbhonde
 */
public class Admin extends javax.swing.JFrame {
    
    /**
     * Creates new form Admin
     */
    Connection conn = null;
    PreparedStatement ps = null;
    
    public Admin() {
        initComponents();
        getUsersTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnUsers = new javax.swing.JLabel();
        btnHospitals = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AdminHome = new javax.swing.JPanel();
        Users = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        Hospitals = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hospitalTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        header.setBackground(new java.awt.Color(0, 126, 200));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("ADMIN DASHBOARD");

        btnUsers.setBackground(new java.awt.Color(0, 94, 148));
        btnUsers.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnUsers.setForeground(new java.awt.Color(255, 255, 255));
        btnUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUsers.setText("Users");
        btnUsers.setOpaque(true);
        btnUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsersMouseClicked(evt);
            }
        });

        btnHospitals.setBackground(new java.awt.Color(0, 126, 200));
        btnHospitals.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnHospitals.setForeground(new java.awt.Color(255, 255, 255));
        btnHospitals.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHospitals.setText("Hospitals");
        btnHospitals.setOpaque(true);
        btnHospitals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHospitalsMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 126, 200));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vaccinemanagement/admin.png"))); // NOI18N

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(btnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        AdminHome.setLayout(new java.awt.CardLayout());

        Users.setBackground(new java.awt.Color(255, 255, 255));

        userTable.setForeground(new java.awt.Color(51, 51, 51));
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Shiv ", "Bhonde",  new Integer(2), "Titan"},
                {"Aadil", "Saudagar",  new Integer(1), "Kem"},
                {"Praitk", "Uchiha",  new Integer(0), null},
                {null, null, null, null}
            },
            new String [] {
                "Firt Name", "Last Name", "Number of Vaccines", "Hospital"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        userTable.setRowHeight(20);
        userTable.setSelectionBackground(new java.awt.Color(0, 126, 200));
        jScrollPane2.setViewportView(userTable);

        javax.swing.GroupLayout UsersLayout = new javax.swing.GroupLayout(Users);
        Users.setLayout(UsersLayout);
        UsersLayout.setHorizontalGroup(
            UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
            .addGroup(UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE))
        );
        UsersLayout.setVerticalGroup(
            UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
            .addGroup(UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE))
        );

        AdminHome.add(Users, "card3");

        Hospitals.setBackground(new java.awt.Color(255, 255, 255));
        Hospitals.setLayout(new javax.swing.BoxLayout(Hospitals, javax.swing.BoxLayout.LINE_AXIS));

        hospitalTable.setForeground(new java.awt.Color(51, 51, 51));
        hospitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Titan", "Thane",  new Integer(100)},
                {"Kem", "Andheri",  new Integer(200)},
                {"AIMS", "Leaf",  new Integer(300)},
                {null, null, null}
            },
            new String [] {
                "Name", "Address", "Total Vaccines"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        hospitalTable.setRowHeight(20);
        hospitalTable.setSelectionBackground(new java.awt.Color(0, 126, 200));
        jScrollPane1.setViewportView(hospitalTable);

        Hospitals.add(jScrollPane1);

        AdminHome.add(Hospitals, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdminHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void getUsersTable(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Vaccine_Management?user=root&password=vaja3253");
            String sql = "select * from USER";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            userTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void getHospitalsTable(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Vaccine_Management?user=root&password=vaja3253");
            String sql = "select * from HOSPITAL";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            hospitalTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void setLblColor(JLabel lbl)
    {
        lbl.setBackground(new Color(0,94,148));
    }
    
      public void resetLblColor(JLabel lbl)
    {
        lbl.setBackground(new Color(0,126,200));
    }
    
    
    private void btnUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsersMouseClicked
        // TODO add your handling code here: 
        setLblColor(btnUsers);
        resetLblColor(btnHospitals);
        Hospitals.setVisible(false);
        Users.setVisible(true);
        getUsersTable();
        
    }//GEN-LAST:event_btnUsersMouseClicked

    private void btnHospitalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHospitalsMouseClicked
        // TODO add your handling code here:
        setLblColor(btnHospitals);
        resetLblColor(btnUsers);
        Users.setVisible(false);
        Hospitals.setVisible(true);
        getHospitalsTable();

    }//GEN-LAST:event_btnHospitalsMouseClicked

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminHome;
    private javax.swing.JPanel Hospitals;
    private javax.swing.JPanel Users;
    private javax.swing.JLabel btnHospitals;
    private javax.swing.JLabel btnUsers;
    private javax.swing.JPanel header;
    private javax.swing.JTable hospitalTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
