/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.main;

import edu.kelompok5.projectweew.database.dbweeew;
import java.sql.SQLException;

/**
 *
 * @author Naufal Zayn M
 */
public class ProjectWeeew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        dbweeew.getConnection();
    }
    
}
