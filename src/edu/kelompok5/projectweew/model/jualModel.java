/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.model;

import edu.kelompok5.projectweew.database.dbweeew;
import edu.kelompok5.projectweew.entity.pembeli;
import edu.kelompok5.projectweew.entity.penjual;
import edu.kelompok5.projectweew.entity.transaksi;
import edu.kelompok5.projectweew.error.pembeliException;
import edu.kelompok5.projectweew.error.penjualException;
import edu.kelompok5.projectweew.error.transaksiException;
import edu.kelompok5.projectweew.event.jualListener;
import edu.kelompok5.projectweew.service.PembeliDAO;
import edu.kelompok5.projectweew.service.PenjualDAO;
import edu.kelompok5.projectweew.service.TransaksiDAO;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author Naufal Zayn M
 */
public class jualModel {

    private String nohp_pembeli;
    private String nominal;
    private String hasil;
    private Date tanggal;
    private Integer id_penjual;
    private Integer id_pembeli;
    private String nama_penjual;

    private jualListener listener;

    public jualListener getListener() {
        return listener;
    }

    public void setListener(jualListener listener) {
        this.listener = listener;
    }

    public String getNama_penjual() {
        return nama_penjual;
    }

    public void setNama_penjual(String nama_penjual) {
        this.nama_penjual = nama_penjual;
        fireonChange();
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

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        tanggal.toLocalDate();
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

    protected void fireonInsertPenjual(penjual penjual) {
        if (listener != null) {
            listener.onInsertPenjual(penjual);
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

    protected void fireonUpdatePenjual(penjual penjual) {
        if (listener != null) {
            listener.onUpdatePenjual(penjual);
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

    public void insertPenjual() throws SQLException, penjualException {
        PenjualDAO dao = dbweeew.getPenjualDAO();
        penjual penjual = new penjual();
        penjual.setId_penjual(id_penjual);
        dao.insertPenjual(penjual);
        fireonInsertPenjual(penjual);
    }

    public void updateTransaksi() throws SQLException, transaksiException {
        TransaksiDAO dao = dbweeew.getTransaksiDAO();
        transaksi transaksi = new transaksi();
        transaksi.setHasil(hasil);
        transaksi.setId_pembeli(id_pembeli);
        transaksi.setId_penjual(id_penjual);
        transaksi.setNohp_pembeli(nohp_pembeli);
        transaksi.setNominal(nominal);
        transaksi.setTanggal(tanggal);
        dao.updateTransaksi(transaksi);
        fireonUpdateTransaksi(transaksi);
    }

    public void updatePembeli() throws SQLException, pembeliException {
        PembeliDAO dao = dbweeew.getPembeliDAO();
        pembeli pembeli = new pembeli();
        pembeli.setNohp_pembeli(nohp_pembeli);
        pembeli.setNominal(nominal);
        pembeli.setId_pembeli(id_pembeli);
        dao.updatePembeli(pembeli);
        fireonUpdatePembeli(pembeli);
    }

    public void updatePenjual() throws SQLException, penjualException {
        PenjualDAO dao = dbweeew.getPenjualDAO();
        penjual penjual = new penjual();
        penjual.setId_penjual(id_penjual);
        penjual.setNama_penjual(nama_penjual);
        dao.updatePenjual(penjual);
        fireonUpdatePenjual(penjual);
    }

    public void deletePembeli() throws SQLException, pembeliException {
        PembeliDAO dao = dbweeew.getPembeliDAO();
        dao.deletePembeli(nohp_pembeli);
        fireonDelete();
    }
    
    public void deletePenjual() throws SQLException, penjualException {
        PenjualDAO dao = dbweeew.getPenjualDAO();
        dao.deletePenjual(id_penjual);
        fireonDelete();
    }
    
    public void deleteTransaksi() throws SQLException, transaksiException {
        TransaksiDAO dao = dbweeew.getTransaksiDAO();
        dao.deleteTransaksi(id_pembeli);
        fireonDelete();
    }

}
