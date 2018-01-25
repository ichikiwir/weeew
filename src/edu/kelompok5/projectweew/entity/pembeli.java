/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.entity;

import java.util.Objects;

/**
 *
 * @author Naufal Zayn M
 */
public class pembeli {
    
    private  int id_pembeli ;
    private String nohp_pembeli;

    public int getId_pembeli() {
        return id_pembeli;
    }

    public void setId_pembeli(int id_pembeli) {
        this.id_pembeli = id_pembeli;
    }

    public String getNohp_pembeli() {
        return nohp_pembeli;
    }

    public void setNohp_pembeli(String nohp_pembeli) {
        this.nohp_pembeli = nohp_pembeli;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id_pembeli;
        hash = 97 * hash + Objects.hashCode(this.nohp_pembeli);
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
        final pembeli other = (pembeli) obj;
        if (this.id_pembeli != other.id_pembeli) {
            return false;
        }
        if (!Objects.equals(this.nohp_pembeli, other.nohp_pembeli)) {
            return false;
        }
        return true;
    }
    
        
}
