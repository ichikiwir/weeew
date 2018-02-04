/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.model;

import edu.kelompok5.projectweew.event.jualListener;

/**
 *
 * @author Naufal Zayn M
 */
public class jualModel {
    private String nohp_pembeli;
    private String nominal;
    private String hasil;
    
    jualListener listener;

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
    
    
}
