/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.main;

import edu.kelompok5.projectweew.view.Rekap;
import javax.swing.SwingUtilities;







/**
 *
 * @author Naufal Zayn M
 */
public class ProjectWeeew {


    public static void main(String[] args)  {
        // TODO code application logic here
        
        SwingUtilities.invokeLater(() -> {
            try {
                Rekap n = new Rekap();
                n.getTxthasil();
            } catch (Exception e) {
                
            }
        });
       
       
    }
    
}
