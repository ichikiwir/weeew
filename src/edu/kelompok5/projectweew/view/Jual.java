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
import java.awt.Color;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ASUS X
 */
public class Jual extends javax.swing.JFrame implements jualListener {

    private final jualModel model;
    private final Controller controller;
    private final transaksiModel t;

    public Jual() {

        model = new jualModel();

        t = new transaksiModel();
        controller = new Controller();
        controller.setModel(model);

        initComponents();
        gocengbtn.setActionCommand("5");
        cebanbtn.setActionCommand("10");
        duacebanbtn.setActionCommand("20");
        dualima.setActionCommand("25");
        gocap.setActionCommand("50");
        cepe.setActionCommand("100");
        BerhasilBtn.setActionCommand("Berhasil");
        TBerhasilBtn.setActionCommand("Tidak Berhasil");

    }

    public ButtonGroup getGrupButton1() {
        return grupButton1;
    }

    public ButtonGroup getGrupButton2() {
        return grupButton2;
    }

    public JRadioButton getCebanbtn() {
        return cebanbtn;
    }

    public JRadioButton getCepe() {
        return cepe;
    }

    public JRadioButton getDuacebanbtn() {
        return duacebanbtn;
    }

    public JRadioButton getGocap() {
        return gocap;
    }

    public JRadioButton getGocengbtn() {
        return gocengbtn;
    }

    public JRadioButton getTigacebanbtn() {
        return tigacebanbtn;
    }

    public JTextField getNohp() {
        return nohp;
    }

    public JTextField getTanggal1() {
        return tanggal1;
    }

    public JTextField getTxtid() {
        return txtid;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupButton1 = new javax.swing.ButtonGroup();
        grupButton2 = new javax.swing.ButtonGroup();
        nohp = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        tanggal1 = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        gocengbtn = new javax.swing.JRadioButton();
        cebanbtn = new javax.swing.JRadioButton();
        duacebanbtn = new javax.swing.JRadioButton();
        tigacebanbtn = new javax.swing.JRadioButton();
        gocap = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cepe = new javax.swing.JRadioButton();
        dualima = new javax.swing.JRadioButton();
        BerhasilBtn = new javax.swing.JRadioButton();
        TBerhasilBtn = new javax.swing.JRadioButton();
        close = new javax.swing.JLabel();
        transaksi = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nohpActionPerformed(evt);
            }
        });
        getContentPane().add(nohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 410, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tanggal1.setEditable(false);
        tanggal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggal1ActionPerformed(evt);
            }
        });
        getContentPane().add(tanggal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 100, -1));

        txtid.setEditable(false);
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 100, -1));

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        grupButton1.add(gocengbtn);
        gocengbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gocengbtnActionPerformed(evt);
            }
        });
        getContentPane().add(gocengbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        grupButton1.add(cebanbtn);
        cebanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cebanbtnActionPerformed(evt);
            }
        });
        getContentPane().add(cebanbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        grupButton1.add(duacebanbtn);
        duacebanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duacebanbtnActionPerformed(evt);
            }
        });
        getContentPane().add(duacebanbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        grupButton1.add(tigacebanbtn);
        tigacebanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigacebanbtnActionPerformed(evt);
            }
        });
        getContentPane().add(tigacebanbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        grupButton1.add(gocap);
        gocap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gocapActionPerformed(evt);
            }
        });
        getContentPane().add(gocap, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));

        jLabel14.setText("tanggal");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, -1, -1));

        jLabel12.setText("id_pembeli");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/5k.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        grupButton1.add(cepe);
        cepe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepeActionPerformed(evt);
            }
        });
        getContentPane().add(cepe, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, -1, -1));

        grupButton1.add(dualima);
        getContentPane().add(dualima, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        grupButton2.add(BerhasilBtn);
        BerhasilBtn.setText("Berhasil?");
        BerhasilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BerhasilBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BerhasilBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        grupButton2.add(TBerhasilBtn);
        TBerhasilBtn.setText("Tidak Berhasil?");
        TBerhasilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBerhasilBtnActionPerformed(evt);
            }
        });
        getContentPane().add(TBerhasilBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/curosssu.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/transaksi.png"))); // NOI18N
        transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transaksiMouseClicked(evt);
            }
        });
        getContentPane().add(transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/25.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/no.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 70, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/100.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/50.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/30.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/20.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/10k.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/bacc.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/jualz.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/jualbutton.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/main2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, -300, 950, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        main n = new main();
        n.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jLabel4MouseClicked

    private void transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiMouseClicked
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-mm-yy");
        String h = s.format(d);
        tanggal1.setText(h);
        
        controller.insertTransaksi(this);


    }//GEN-LAST:event_transaksiMouseClicked

    private void tigacebanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigacebanbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tigacebanbtnActionPerformed

    private void gocengbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gocengbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gocengbtnActionPerformed

    private void cebanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cebanbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cebanbtnActionPerformed

    private void duacebanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duacebanbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duacebanbtnActionPerformed

    private void gocapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gocapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gocapActionPerformed

    private void cepeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepeActionPerformed

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        this.setVisible(false);
    }//GEN-LAST:event_closeMouseExited

    private void BerhasilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BerhasilBtnActionPerformed
        BerhasilBtn.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_BerhasilBtnActionPerformed

    private void TBerhasilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBerhasilBtnActionPerformed
        TBerhasilBtn.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_TBerhasilBtnActionPerformed

    private void tanggal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggal1ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        controller.resetTransaksi(this);
    }//GEN-LAST:event_resetActionPerformed

    private void nohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nohpActionPerformed

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
            java.util.logging.Logger.getLogger(Jual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Jual().setVisible(true);
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BerhasilBtn;
    private javax.swing.JRadioButton TBerhasilBtn;
    private javax.swing.JRadioButton cebanbtn;
    private javax.swing.JRadioButton cepe;
    private javax.swing.JLabel close;
    private javax.swing.JRadioButton duacebanbtn;
    private javax.swing.JRadioButton dualima;
    private javax.swing.JRadioButton gocap;
    private javax.swing.JRadioButton gocengbtn;
    private javax.swing.ButtonGroup grupButton1;
    private javax.swing.ButtonGroup grupButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nohp;
    private javax.swing.JButton reset;
    private javax.swing.JTextField tanggal1;
    private javax.swing.JRadioButton tigacebanbtn;
    private javax.swing.JLabel transaksi;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onChange(jualModel model) {
        grupButton1.getSelection().setActionCommand(model.getNominal());
        grupButton2.getSelection().setActionCommand(model.getHasil());
        txtid.setText(model.getId_pembeli() + "");
        tanggal1.setText(model.getTanggal());
        nohp.setText(model.getNohp_pembeli());
    }

    @Override
    public void onInsertTransaksi(transaksi transaksi) {
        t.add(transaksi);
    }

    @Override
    public void onDelete() {

    }

}
