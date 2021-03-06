/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.view;

import edu.kelompok5.projectweew.controller.Controller;
import edu.kelompok5.projectweew.database.dbweeew;

import edu.kelompok5.projectweew.entity.transaksi;
import edu.kelompok5.projectweew.error.transaksiException;
import edu.kelompok5.projectweew.event.jualListener;
import edu.kelompok5.projectweew.model.jualModel;
import edu.kelompok5.projectweew.model.transaksiModel;
import edu.kelompok5.projectweew.service.TransaksiDAO;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author ASUS X
 */
public class Rekap extends javax.swing.JFrame implements jualListener, ListSelectionListener{
    
  private jualModel model;
    private Controller controller;
    private transaksiModel m;

 
   
  
    public Rekap() {
       m = new transaksiModel();
        initComponents();
        
        Rekap.getSelectionModel().addListSelectionListener(this);
        Rekap.setModel(m);
    }

    public JTable getRekap() {
        return Rekap;
    }

    public JTextField getTxtid() {
        return txtid;
    }

    public JTextField getTxthasil() {
        return txthasil;
    }

    public JTextField getTxtidpen() {
        return txtidpen;
    }

    public JTextField getTxtnohp() {
        return txtnohp;
    }

    public JTextField getTxtnominal() {
        return txtnominal;
    }

    public JTextField getTxttanggal() {
        return txttanggal;
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
        jScrollPane2 = new javax.swing.JScrollPane();
        Rekap = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        close = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtidpen = new javax.swing.JTextField();
        txtnohp = new javax.swing.JTextField();
        txtnominal = new javax.swing.JTextField();
        txthasil = new javax.swing.JTextField();
        txttanggal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Rekap.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Rekap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id_penjual", "id_pembeli", "no_hp", "Nominal", "Hasil", "Tanggal"
            }
        ));
        Rekap.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(Rekap);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, 350));

        jButton2.setText("Hapus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, -1));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/curosssu.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/bacc.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/rekap2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok5/projectweew/view/main3.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -300, -1, -1));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        txtidpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpenActionPerformed(evt);
            }
        });
        jPanel1.add(txtidpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        txtnohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnohpActionPerformed(evt);
            }
        });
        jPanel1.add(txtnohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        txtnominal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnominalActionPerformed(evt);
            }
        });
        jPanel1.add(txtnominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        txthasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthasilActionPerformed(evt);
            }
        });
        jPanel1.add(txthasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        txttanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttanggalActionPerformed(evt);
            }
        });
        jPanel1.add(txttanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
     main n = new main();
    n.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
this.setVisible(false);
    }//GEN-LAST:event_closeMouseExited

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_txtidActionPerformed

    private void txtidpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpenActionPerformed

    private void txtnohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnohpActionPerformed

    private void txtnominalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnominalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnominalActionPerformed

    private void txthasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthasilActionPerformed

    private void txttanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttanggalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        controller.deleteTransaksi(this);
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Rekap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rekap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rekap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rekap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rekap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Rekap;
    private javax.swing.JLabel close;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txthasil;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtidpen;
    private javax.swing.JTextField txtnohp;
    private javax.swing.JTextField txtnominal;
    private javax.swing.JTextField txttanggal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onChange(jualModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onInsertTransaksi(transaksi transaksi) {
        m.add(transaksi);
    }

    @Override
    public void onDelete() {
      int index= Rekap.getSelectedRow();
       m.remove(index);
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        try {
            transaksi model = m.get(Rekap.getSelectedRow());
            
        } catch (IndexOutOfBoundsException exception) {
        }
        
        
}
    public void loadDatabase() throws SQLException, transaksiException{
            TransaksiDAO dao = dbweeew.getTransaksiDAO();
            m.setList(dao.selectAllTransaksi());}
}

   

