/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.view;

import edu.kelompok5.projectweew.controller.Controller;

import edu.kelompok5.projectweew.entity.transaksi;
import edu.kelompok5.projectweew.event.jualListener;
import edu.kelompok5.projectweew.model.jualModel;
import edu.kelompok5.projectweew.model.transaksiModel;
import javax.swing.JTextField;


/**
 *
 * @author ASUS X
 */
public class Login extends javax.swing.JFrame implements jualListener{

private jualModel model;
    private Controller controller;
    private transaksiModel m;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
    }

    public JTextField getIdpenjualTxt() {
        return idpenjualTxt;
    }

    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idpenjualTxt = new javax.swing.JTextField();
        oklogin = new javax.swing.JToggleButton();
        loginh3h3 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(idpenjualTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, 30));

        oklogin.setText("ok");
        oklogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okloginMouseClicked(evt);
            }
        });
        oklogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okloginActionPerformed(evt);
            }
        });
        getContentPane().add(oklogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 50, -1));

        loginh3h3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/Logineuy.png"))); // NOI18N
        loginh3h3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginh3h3MouseEntered(evt);
            }
        });
        getContentPane().add(loginh3h3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/curosssu.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/login.png"))); // NOI18N
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/wew2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -120, 790, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
loginh3h3.setVisible(true);
oklogin.setVisible(true);
idpenjualTxt.setVisible(true);

    }//GEN-LAST:event_LoginMouseClicked

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
this.setVisible(false);       
    }//GEN-LAST:event_closeMouseExited

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
    
 
     
     
    }//GEN-LAST:event_formMouseEntered

    private void okloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okloginMouseClicked
        main n = new main();
        n.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_okloginMouseClicked

    private void loginh3h3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginh3h3MouseEntered
        this.setVisible(true);
    }//GEN-LAST:event_loginh3h3MouseEntered

    private void okloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okloginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login;
    private javax.swing.JLabel close;
    private javax.swing.JTextField idpenjualTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel loginh3h3;
    private javax.swing.JToggleButton oklogin;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onChange(jualModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onInsertTransaksi(transaksi transaksi) {
  Rekap
    }

    @Override
    public void onDelete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
