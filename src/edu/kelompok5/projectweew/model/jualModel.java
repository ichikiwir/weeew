/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.model;

import edu.kelompok5.projectweew.database.dbweeew;
import edu.kelompok5.projectweew.entity.pembeli;
import edu.kelompok5.projectweew.error.pembeliException;
import edu.kelompok5.projectweew.event.jualListener;
import edu.kelompok5.projectweew.service.PembeliDAO;
import java.sql.SQLException;

/**
 *
 * @author Naufal Zayn M
 */
public class jualModel {
    
    private String nominal;
    private String nohp_pembeli;
    
 private jualListener listener;

    public jualListener getListener() {
        return listener;
    }

    public void setListener(jualListener listener) {
        this.listener = listener;
    }
 
 

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public String getNohp_pembeli() {
        return nohp_pembeli;
    }

    public void setNohp_pembeli(String nohp_pembeli) {
        this.nohp_pembeli = nohp_pembeli;
    }

    protected void fireOnChange(){
        if(listener!=null){
            listener.onChange(this);
        }
    }
    protected void fireOnInsert(pembeli pembeli){
        if(listener!=null){
            listener.onInsert(pembeli);
        }
    }
    protected void fireOnUpdate(pembeli pembeli){
        if(listener!=null){
            listener.onUpdate(pembeli);
        }
    }
    protected void fireOnDelete(){
        if(listener!=null){
            listener.onDelete();
        }
        
        
    }
    
            
    public void insertPembeli() throws SQLException, pembeliException{
       PembeliDAO dao = dbweeew.getPembeliDAO();
        pembeli pembeli = new pembeli();
        pembeli.setNohp_pembeli(nohp_pembeli);
                pembeli.setNominal(nominal);
                dao.insertPembeli(pembeli);
                fireOnInsert(pembeli);
    }
    
    public void updatePembeli() throws SQLException, pembeliException{
       PembeliDAO dao = dbweeew.getPembeliDAO();
        pembeli pembeli = new pembeli();
        pembeli.setNohp_pembeli(nohp_pembeli);
                pembeli.setNominal(nominal);
                dao.updatePembeli(pembeli);
                fireOnUpdate(pembeli);
    }
    
     public void deletePembeli() throws SQLException, pembeliException{
       PembeliDAO dao = dbweeew.getPembeliDAO();
        pembeli pembeli = new pembeli();
        pembeli.setNohp_pembeli(nohp_pembeli);
                pembeli.setNominal(nominal);
                dao.insertPembeli(pembeli);
                fireOnInsert(pembeli);
    }
    
}
