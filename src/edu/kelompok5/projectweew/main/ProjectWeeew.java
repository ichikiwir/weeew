/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.main;

import edu.kelompok5.projectweew.error.transaksiException;
import edu.kelompok5.projectweew.view.Rekap;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;







/**
 *
 * @author Naufal Zayn M
 */
public class ProjectWeeew {


    public static void main(String[] args)  {
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Rekap transaksi = new Rekap();
                    transaksi.loadDatabase();
                    transaksi.setVisible(true);
                } catch (SQLException e) {
                    
                } catch (transaksiException ex) {
                    Logger.getLogger(ProjectWeeew.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
       
    }
    
}
