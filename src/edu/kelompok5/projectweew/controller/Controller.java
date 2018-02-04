/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.controller;

import edu.kelompok5.projectweew.model.jualModel;
import edu.kelompok5.projectweew.view.Jual;
import edu.kelompok5.projectweew.view.Login;
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

    public void insertPembeli(Jual view) {
        String nohp_pembeli = view.getNohp().getText();
        String nominal = view.getGrupButton1().getSelection().getActionCommand();
        model.setNohp_pembeli(nohp_pembeli);
        model.setNominal(nominal); 
        
        try {
            model.insertPembeli();
            JOptionPane.showMessageDialog(view, "Pembeli berhasil ditambahkan");
            
        } catch (Throwable throwable) {
            JOptionPane.showMessageDialog(view, new Object[]{"Terjadi error di database dengan pesan", throwable.getMessage()});
            
        }
        
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

    public void insertPenjual(Login view) {
        String id= view.getPenjualTxt().getText();
        Integer id_penjual=Integer.parseInt(id);
        model.setId_penjual(id_penjual);
        try {
            model.insertPenjual();
            JOptionPane.showMessageDialog(view, "Pembeli berhasil ditambahkan");
            
        } catch (Throwable throwable) {
            JOptionPane.showMessageDialog(view, new Object[]{"Terjadi error di database dengan pesan", throwable.getMessage()});
            
        }
    }
    
    public void updatePenjual(Login view) {
        String id= view.getPenjualTxt().getText();
        Integer id_penjual=Integer.parseInt(id);
        model.setId_penjual(id_penjual);
        try {
            model.updatePenjual();
            JOptionPane.showMessageDialog(view, "Pembeli berhasil ditambahkan");
            
        } catch (Throwable throwable) {
            JOptionPane.showMessageDialog(view, new Object[]{"Terjadi error di database dengan pesan", throwable.getMessage()});
            
        }
    }
    

}
