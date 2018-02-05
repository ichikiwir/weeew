/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.controller;

import edu.kelompok5.projectweew.model.jualModel;
import edu.kelompok5.projectweew.view.Jual;
import edu.kelompok5.projectweew.view.Login;
import edu.kelompok5.projectweew.view.Rekap;


import java.text.SimpleDateFormat;
import java.util.Date;
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

    public void resetTransaksi(Jual view) {
        model.resetTransaksi();
    }

    public void insertTransaksi(Login view) {
        String id_penjual = view.getIdpenjualTxt().getText();
        Integer id = Integer.parseInt(id_penjual);
        model.setId_penjual(id);
        try {
            model.insertTransaksi();
            JOptionPane.showMessageDialog(view, "Pembeli berhasil ditambahkan");

        } catch (Throwable throwable) {
            JOptionPane.showMessageDialog(view, new Object[]{"Terjadi error di database dengan pesan", throwable.getMessage()});

        }
    }

    public void insertTransaksi(Jual view) {
        
        

        String nominal = view.getGrupButton1().getSelection().getActionCommand();
        String hasil = view.getGrupButton2().getSelection().getActionCommand();
        String nohp_pembeli = view.getNohp().getText();
        String tanggal = view.getTanggal1().getText();

        if (nohp_pembeli.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Namatidak boleh kosong");
        }

        model.setNominal(nominal);
        model.setHasil(hasil);
        model.setNohp_pembeli(nohp_pembeli);
        model.setTanggal(tanggal);

        try {
            model.insertTransaksi();
            JOptionPane.showMessageDialog(view, "Pembeli berhasil ditambahkan");

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
                JOptionPane.showMessageDialog(view, "data berhasil diubah");
                model.resetTransaksi();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi error di database dengan pesan ", throwable.getMessage()});
            }
        }
    }

}
