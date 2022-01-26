/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vaccinemanagement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author prati
 */
public class HomePage extends javax.swing.JFrame {
    Connection con;
    PreparedStatement ps;
    

    /**
     * Creates new form HomePage
     */
    
    int flag =0 ;
    
    public HomePage() {
        initComponents();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Vaccine_Management?user=root&password=vaja3253");
           // ps=con.prepareStatement("insert into hospital");
           String sql="Select * from hospital where h_id like 1";
           ps=con.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               lbl_hospital1.setText(rs.getString("name"));
               txt_vaccine1.setText(rs.getString("stock"));
           }
           sql="Select * from hospital where h_id like 2";
           ps=con.prepareStatement(sql);
           ResultSet rs2 = ps.executeQuery();
           while(rs2.next()){
               lbl_hospital2.setText(rs2.getString("name"));
               txt_vaccine2.setText(rs2.getString("stock"));
           }
           sql="Select * from hospital where h_id like 3";
           ps=con.prepareStatement(sql);
           ResultSet rs3 = ps.executeQuery();
           while(rs3.next()){
               lbl_hospital3.setText(rs3.getString("name"));
               txt_vaccine3.setText(rs3.getString("stock"));
           }
           
           ps.executeUpdate();
                    } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_exit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl_hospital1 = new javax.swing.JLabel();
        txt_vaccine1 = new javax.swing.JTextField();
        btn_book1 = new javax.swing.JButton();
        lbl_available1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbl_hospital2 = new javax.swing.JLabel();
        lbl_available2 = new javax.swing.JLabel();
        txt_vaccine2 = new javax.swing.JTextField();
        btn_book2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lbl_hospital3 = new javax.swing.JLabel();
        lbl_available3 = new javax.swing.JLabel();
        txt_vaccine3 = new javax.swing.JTextField();
        btn_book3 = new javax.swing.JButton();
        btn_profile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 184, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 102, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VACCINATION CENTRES");
        jLabel1.setToolTipText("");

        lbl_exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_exit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_exit.setText("X");
        lbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        lbl_hospital1.setFont(new java.awt.Font("Lucida Sans", 1, 20)); // NOI18N
        lbl_hospital1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_hospital1.setText("HOSPITAL1");

        txt_vaccine1.setForeground(new java.awt.Color(0, 181, 204));
        txt_vaccine1.setText(" 20");

        btn_book1.setForeground(new java.awt.Color(0, 181, 204));
        btn_book1.setText("BOOK");
        btn_book1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 181, 204)));
        btn_book1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_book1ActionPerformed(evt);
            }
        });

        lbl_available1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_available1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_available1.setText("Available VACCINES:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_hospital1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_available1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_vaccine1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_book1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_vaccine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_book1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_available1)
                    .addComponent(lbl_hospital1))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        lbl_hospital2.setFont(new java.awt.Font("Lucida Sans", 1, 20)); // NOI18N
        lbl_hospital2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_hospital2.setText("HOSPITAL2");

        lbl_available2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_available2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_available2.setText("Available VACCINES:");

        txt_vaccine2.setForeground(new java.awt.Color(0, 181, 204));
        txt_vaccine2.setText("0");

        btn_book2.setForeground(new java.awt.Color(0, 181, 204));
        btn_book2.setText("BOOK");
        btn_book2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 181, 204)));
        btn_book2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_book2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_hospital2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(lbl_available2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_vaccine2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_book2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_available2)
                    .addComponent(txt_vaccine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_book2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_hospital2))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        lbl_hospital3.setFont(new java.awt.Font("Lucida Sans", 1, 20)); // NOI18N
        lbl_hospital3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_hospital3.setText("HOSPITAL3");

        lbl_available3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_available3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_available3.setText("Available VACCINES:");

        txt_vaccine3.setForeground(new java.awt.Color(0, 181, 204));
        txt_vaccine3.setText("10");

        btn_book3.setForeground(new java.awt.Color(0, 181, 204));
        btn_book3.setText("BOOK");
        btn_book3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 181, 204)));
        btn_book3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_book3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_hospital3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_available3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_vaccine3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_book3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_vaccine3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_available3)
                    .addComponent(btn_book3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_hospital3))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        btn_profile.setBackground(new java.awt.Color(255, 255, 255));
        btn_profile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_profile.setForeground(new java.awt.Color(0, 181, 204));
        btn_profile.setText("PROFILE");
        btn_profile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 181, 204)));
        btn_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_profileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_profile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_profile)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_profileActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new User_details().setVisible(true);
    }//GEN-LAST:event_btn_profileActionPerformed

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lbl_exitMouseClicked
    
    private void btn_book1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_book1ActionPerformed
        if(flag==0){
        try {
            // TODO add your handling code here:
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Vaccine_Management?user=root&password=vaja3253");
            String sql = "Select stock from hospital where h_id like 1";
            ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                int x=Integer.parseInt(rs.getString("stock"));
                if(x>0){
                txt_vaccine1.setText(Integer.toString(--x));
                String sql_decrementStock="UPDATE hospital SET stock = stock - 1 where h_id like 1 AND stock > 0";
                ps=con.prepareStatement(sql_decrementStock);
                ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Vaccine booked succcessfully");
                flag=1;

                }else{
                     JOptionPane.showMessageDialog(this, "Vaccine not available");
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }//GEN-LAST:event_btn_book1ActionPerformed

    private void btn_book2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_book2ActionPerformed
        // TODO add your handling code here:
        if(flag==0){
         try {
            // TODO add your handling code here:
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Vaccine_Management?user=root&password=vaja3253");
            String sql = "Select stock from hospital where h_id like 2";
            ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                int x=Integer.parseInt(rs.getString("stock"));
                if(x>0){
                txt_vaccine2.setText(Integer.toString(--x));
                String sql_decrementStock="UPDATE hospital SET stock = stock - 1 where h_id like 2 AND stock > 0";
                ps=con.prepareStatement(sql_decrementStock);
                ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Vaccine booked succcessfully");
                flag=1;
                }else{
                    JOptionPane.showMessageDialog(this, "Vaccine not available");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }//GEN-LAST:event_btn_book2ActionPerformed

    private void btn_book3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_book3ActionPerformed
        // TODO add your handling code here:
        if(flag==0){ 
        try {
            // TODO add your handling code here:
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Vaccine_Management?user=root&password=vaja3253");
            String sql = "Select stock from hospital where h_id like 3";
            ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                int x=Integer.parseInt(rs.getString("stock"));
                if(x>0){
                txt_vaccine3.setText(Integer.toString(--x));
                String sql_decrementStock="UPDATE hospital SET stock = stock - 1 where h_id like 3 AND stock > 0";
                ps=con.prepareStatement(sql_decrementStock);
                ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Vaccine booked succcessfully");
                flag=1;
                }else{
                   JOptionPane.showMessageDialog(this, "Vaccine not available");
                }
                 
                 
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btn_book3ActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_book1;
    private javax.swing.JButton btn_book2;
    private javax.swing.JButton btn_book3;
    private javax.swing.JButton btn_profile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lbl_available1;
    private javax.swing.JLabel lbl_available2;
    private javax.swing.JLabel lbl_available3;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_hospital1;
    private javax.swing.JLabel lbl_hospital2;
    private javax.swing.JLabel lbl_hospital3;
    private javax.swing.JTextField txt_vaccine1;
    private javax.swing.JTextField txt_vaccine2;
    private javax.swing.JTextField txt_vaccine3;
    // End of variables declaration//GEN-END:variables
}
