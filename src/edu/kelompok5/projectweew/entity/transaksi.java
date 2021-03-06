/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.entity;

import java.sql.Date;
import java.util.Objects;


/**
 *
 * @author Naufal Zayn M
 */
public class transaksi {
    private Integer id_pembeli;
    private Integer id_penjual;
    private String nohp_pembeli;
    private String nominal;
    private String hasil;
    private String tanggal;
    
    public transaksi(){
        
    }

    public transaksi(String nominal, String hasil) {
        this.nominal = nominal;
        this.hasil = hasil;
    }
    
    

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    
    public Integer getId_pembeli() {
        return id_pembeli;
    }

    public void setId_pembeli(Integer id_pembeli) {
        this.id_pembeli = id_pembeli;
    }

    public Integer getId_penjual() {
        return id_penjual;
    }

    public void setId_penjual(Integer id_penjual) {
        this.id_penjual = id_penjual;
    }

    public String getNohp_pembeli() {
        return nohp_pembeli;
    }

    public void setNohp_pembeli(String nohp_pembeli) {
        this.nohp_pembeli = nohp_pembeli;
    }

    public String getHasil() {
        return hasil;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
      
        this.tanggal = tanggal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id_pembeli);
        hash = 29 * hash + Objects.hashCode(this.id_penjual);
        hash = 29 * hash + Objects.hashCode(this.nohp_pembeli);
        hash = 29 * hash + Objects.hashCode(this.nominal);
        hash = 29 * hash + Objects.hashCode(this.hasil);
        hash = 29 * hash + Objects.hashCode(this.tanggal);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final transaksi other = (transaksi) obj;
        if (!Objects.equals(this.nohp_pembeli, other.nohp_pembeli)) {
            return false;
        }
        if (!Objects.equals(this.nominal, other.nominal)) {
            return false;
        }
        if (!Objects.equals(this.hasil, other.hasil)) {
            return false;
        }
        if (!Objects.equals(this.id_pembeli, other.id_pembeli)) {
            return false;
        }
        if (!Objects.equals(this.id_penjual, other.id_penjual)) {
            return false;
        }
        if (!Objects.equals(this.tanggal, other.tanggal)) {
            return false;
        }
        return true;
    }

    

    
    
    
    
}
