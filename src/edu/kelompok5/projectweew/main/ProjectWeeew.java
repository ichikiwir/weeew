/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.main;

import edu.kelompok5.projectweew.database.dbweeew;
import edu.kelompok5.projectweew.entity.pembeli;
import edu.kelompok5.projectweew.error.pembeliException;
import edu.kelompok5.projectweew.service.PembeliDAO;
import java.sql.SQLException;

/**
 *
 * @author Naufal Zayn M
 */
public class ProjectWeeew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, pembeliException {
        // TODO code application logic here
        
       PembeliDAO pem = dbweeew.getPembeliDAO();
       pembeli pembeli = new pembeli();
       pembeli.setNohp_pembeli("082117554742");
       pem.insertPembeli(pembeli);
        
       
       
       
    }
    
}
