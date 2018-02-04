/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.controller;

import edu.kelompok5.projectweew.model.ModelRegister;
import edu.kelompok5.projectweew.view.Login;

/**
 *
 * @author ASUS X
 */
public class Pembeli {

    public void setModel(ModelRegister model) {
        this.model = model;
    }

    public String getId_pembeli() {
        return id_pembeli;
    }

    public void setId_pembeli(String id_pembeli) {
        this.id_pembeli = id_pembeli;
    }

    public Pembeli(String id_pembeli) {
        this.id_pembeli = id_pembeli;
    }
    
    private ModelRegister model;
    private String id_pembeli;

  
}
