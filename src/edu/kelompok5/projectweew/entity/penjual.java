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
public class penjual {
    private Integer id_penjual;
    private String nama_penjual;

   public penjual(){
       
   }

    public penjual(Integer id_penjual, String nama_penjual) {
        this.id_penjual = id_penjual;
        this.nama_penjual = nama_penjual;
    }

    

    
    
    public Integer getId_penjual() {
        return id_penjual;
    }

    public void setId_penjual(Integer id_penjual) {
        this.id_penjual = id_penjual;
    }

    public String getNama_penjual() {
        return nama_penjual;
    }

    public void setNama_penjual(String nama_penjual) {
        this.nama_penjual = nama_penjual;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id_penjual);
        hash = 97 * hash + Objects.hashCode(this.nama_penjual);
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
        final penjual other = (penjual) obj;
        if (!Objects.equals(this.nama_penjual, other.nama_penjual)) {
            return false;
        }
        if (!Objects.equals(this.id_penjual, other.id_penjual)) {
            return false;
        }
        return true;
    }

    
    
    
}
