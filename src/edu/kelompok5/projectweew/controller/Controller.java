/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.controller;

import edu.kelompok5.projectweew.model.jualModel;
import edu.kelompok5.projectweew.view.Jual;

import edu.kelompok5.projectweew.view.Rekap;
import javax.swing.JOptionPane;


/**
 *
 * @author Naufal Zayn M
 */
public class Controller {

    private jualModel model;

    public void setModel(jualModel model) {
        this.model = model;
    }

    public void insertTransaksi(Jual view) {
        String hasil = view.getGrupButton2().getSelection().getActionCommand();
        model.setHasil(hasil);

        try {
            model.insertTransaksi();
            JOptionPane.showMessageDialog(view, "Pembeli berhasil ditambahkan");

        } catch (Throwable throwable) {
            JOptionPane.showMessageDialog(view, new Object[]{"Terjadi error di database dengan pesan", throwable.getMessage()});

        }
    }

    public void updateTransaksi(Jual view) {
        String hasil = view.getGrupButton2().getSelection().getActionCommand();
        model.setHasil(hasil);

        try {
            model.insertTransaksi();
            JOptionPane.showMessageDialog(view, "Transaksi berhasil ditambahkan");

        } catch (Throwable throwable) {
            JOptionPane.showMessageDialog(view, new Object[]{"Terjadi error di database dengan pesan", throwable.getMessage()});

        }
    }

    public void deleteTransaksi(Rekap view) {
        if (view.getRekap().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Silahkan pilih baris data yang akan dihapus");
            return;
        }
        if (JOptionPane.showConfirmDialog(view, "Ända yakin akan menghapus?") == JOptionPane.OK_OPTION) {
            Integer id = Integer.parseInt(view.getTxtid().getText());
            model.setId_pembeli(id);

            try {
                model.deleteTransaksi();
                JOptionPane.showMessageDialog(view, "Penjual berhasil diubah");

            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi error di database dengan pesan ", throwable.getMessage()});
            }
        }
    }

}
