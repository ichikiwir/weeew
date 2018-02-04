/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.model;

import edu.kelompok5.projectweew.database.dbweeew;
import edu.kelompok5.projectweew.entity.pembeli;
import edu.kelompok5.projectweew.entity.transaksi;
import edu.kelompok5.projectweew.error.pembeliException;
import edu.kelompok5.projectweew.error.transaksiException;
import edu.kelompok5.projectweew.event.jualListener;
import edu.kelompok5.projectweew.service.PembeliDAO;
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

    private jualListener listener;

    public jualListener getListener() {
        return listener;
    }

    public void setListener(jualListener listener) {
        this.listener = listener;
    }

    public String getNohp_pembeli() {
        return nohp_pembeli;
    }

    public void setNohp_pembeli(String nohp_pembeli) {
        this.nohp_pembeli = nohp_pembeli;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public String getHasil() {
        return hasil;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }

    protected void fireonChange() {
        if (listener != null) {
            listener.onChange(this);
        }

    }

    protected void fireonInsertPembeli(pembeli pembeli) {
        if (listener != null) {
            listener.onInsertPembeli(pembeli);
        }

    }

    protected void fireonInsertTransaksi(transaksi transaksi) {
        if (listener != null) {
            listener.onInsertTransaksi(transaksi);
        }
    }

    protected void fireonUpdatePembeli(pembeli pembeli) {
        if (listener != null) {
            listener.onUpdatePembeli(pembeli);
        }

    }

    protected void fireonUpdateTransaksi(transaksi transaksi) {
        if (listener != null) {
            listener.onUpdateTransaksi(transaksi);
        }

    }

    protected void fireonDelete() {
        if (listener != null) {
            listener.onDelete();
        }

    }

    public void insertPembeli() throws SQLException, pembeliException {
        PembeliDAO dao = dbweeew.getPembeliDAO();
        pembeli pembeli = new pembeli();
        pembeli.setNohp_pembeli(nohp_pembeli);
        pembeli.setNominal(nominal);
        dao.insertPembeli(pembeli);
        fireonInsertPembeli(pembeli);
    }

    public void insertTransaksi() throws SQLException, transaksiException {
        TransaksiDAO dao = dbweeew.getTransaksiDAO();
        transaksi transaksi = new transaksi();
        transaksi.setHasil(hasil);
        dao.insertTransaksi(transaksi);
        fireonInsertTransaksi(transaksi);
    }

    public void updateTransaksi() throws SQLException, transaksiException {
        TransaksiDAO dao = dbweeew.getTransaksiDAO();
        transaksi transaksi = new transaksi();
        transaksi.setHasil(hasil);
        dao.insertTransaksi(transaksi);
        fireonInsertTransaksi(transaksi);
    }

}
