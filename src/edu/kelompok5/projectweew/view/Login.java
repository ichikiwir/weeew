/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.view;
import AppPackage.AnimationClass;
/**
 *
 * @author ASUS X
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        idpenjualTxt = new javax.swing.JTextField();
        pinTxt = new javax.swing.JTextField();
        penjualTxt = new javax.swing.JTextField();
        okBtn = new javax.swing.JButton();
        oklogin = new javax.swing.JToggleButton();
        loginh3h3 = new javax.swing.JLabel();
        idpenjualregist = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        Register = new javax.swing.JLabel();
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
        getContentPane().add(pinTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 210, 30));
        getContentPane().add(penjualTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, 30));

        okBtn.setText("OK");
        okBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okBtnMouseClicked(evt);
            }
        });
        getContentPane().add(okBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));

        oklogin.setText("ok");
        oklogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okloginMouseClicked(evt);
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

        idpenjualregist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/regissss.png"))); // NOI18N
        idpenjualregist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                idpenjualregistMouseReleased(evt);
            }
        });
        getContentPane().add(idpenjualregist, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 560));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/curosssu.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/register.png"))); // NOI18N
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
        });
        getContentPane().add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, 70));

        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/login.png"))); // NOI18N
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/wew2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -120, 790, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
loginh3h3.setVisible(true);
idpenjualregist.setVisible(false);
pinTxt.setVisible(false);
penjualTxt.setVisible(false);
okBtn.setVisible(false);
oklogin.setVisible(true);
idpenjualTxt.setVisible(true);

    }//GEN-LAST:event_LoginMouseClicked

    private void idpenjualregistMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idpenjualregistMouseReleased
      AnimationClass AC = new AnimationClass();
      AC.jLabelXRight(-260, 0, 10, 2, jLabel1);
      
    }//GEN-LAST:event_idpenjualregistMouseReleased

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
this.setVisible(false);       
    }//GEN-LAST:event_closeMouseExited

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked
     idpenjualregist.setVisible(true);
     pinTxt.setVisible(true);
     penjualTxt.setVisible(true);
     okBtn.setVisible(true);
     loginh3h3.setVisible(false);
     oklogin.setVisible(false);
     idpenjualTxt.setVisible(false);
    }//GEN-LAST:event_RegisterMouseClicked

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
     idpenjualregist.setVisible(false);
     pinTxt.setVisible(false);
     penjualTxt.setVisible(false);
     okBtn.setVisible(false);
     loginh3h3.setVisible(false);
     oklogin.setVisible(false);
     idpenjualTxt.setVisible(false);
 
     
     
    }//GEN-LAST:event_formMouseEntered

    private void okloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okloginMouseClicked
        main n = new main();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_okloginMouseClicked

    private void okBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okBtnMouseClicked
         main n = new main();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_okBtnMouseClicked

    private void loginh3h3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginh3h3MouseEntered
        this.setVisible(true);
    }//GEN-LAST:event_loginh3h3MouseEntered

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
    private javax.swing.JLabel Register;
    private javax.swing.JLabel close;
    private javax.swing.JTextField idpenjualTxt;
    private javax.swing.JLabel idpenjualregist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel loginh3h3;
    private javax.swing.JButton okBtn;
    private javax.swing.JToggleButton oklogin;
    private javax.swing.JTextField penjualTxt;
    private javax.swing.JTextField pinTxt;
    // End of variables declaration//GEN-END:variables
}
