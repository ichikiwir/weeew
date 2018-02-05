/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.model;

import edu.kelompok5.projectweew.database.dbweeew;
import edu.kelompok5.projectweew.entity.transaksi;
import edu.kelompok5.projectweew.error.transaksiException;
import edu.kelompok5.projectweew.event.jualListener;
import edu.kelompok5.projectweew.service.TransaksiDAO;

import java.sql.SQLException;

/**
 *
 * @author Naufal Zayn M
 */
public class jualModel {

    private String nohp_pembeli;
    private String nominal;
    private String hasil;
    private String tanggal;
    private Integer id_penjual;
    private Integer id_pembeli;

    private jualListener listener;

    public jualListener getListener() {
        return listener;
    }

    public void setListener(jualListener listener) {
        this.listener = listener;
    }

    public Integer getId_penjual() {
        return id_penjual;
    }

    public void setId_penjual(Integer id_penjual) {
        this.id_penjual = id_penjual;
        fireonChange();
    }

    public Integer getId_pembeli() {
        return id_pembeli;
    }

    public void setId_pembeli(Integer id_pembeli) {
        this.id_pembeli = id_pembeli;
        fireonChange();
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
        fireonChange();
    }

    public String getNohp_pembeli() {
        return nohp_pembeli;
    }

    public void setNohp_pembeli(String nohp_pembeli) {
        this.nohp_pembeli = nohp_pembeli;
        fireonChange();
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
        fireonChange();
    }

    public String getHasil() {
        return hasil;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
        fireonChange();
    }

    protected void fireonChange() {
        if (listener != null) {
            listener.onChange(this);
        }

    }

    protected void fireonInsertTransaksi(transaksi transaksi) {
        if (listener != null) {
            listener.onInsertTransaksi(transaksi);
        }
    }

   

    protected void fireonDelete() {
        if (listener != null) {
            listener.onDelete();
        }

    }

    public void insertTransaksi() throws SQLException, transaksiException {
        TransaksiDAO dao = dbweeew.getTransaksiDAO();
        transaksi transaksi = new transaksi();
        transaksi.setId_penjual(id_penjual);
        transaksi.setNohp_pembeli(nohp_pembeli);
        transaksi.setNominal(nominal);
        transaksi.setHasil(hasil);
        transaksi.setTanggal(tanggal);
        dao.insertTransaksi(transaksi);
        fireonInsertTransaksi(transaksi);
    }

    

    public void deleteTransaksi() throws SQLException, transaksiException {
        TransaksiDAO dao = dbweeew.getTransaksiDAO();
        dao.deleteTransaksi(id_pembeli);
        fireonDelete();
    }
    
    public void resetTransaksi(){
        setHasil("");
        setNohp_pembeli("");
        setNominal("");
    }

}
