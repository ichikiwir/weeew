/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.database;

import java.sql.Connection;
import java.sql.SQLException;




/**
 *
 * @author Naufal Zayn M
 */
public class dbweeew {
    private static Connection connection;
    
    public static Connection getConnection() throws SQLException{
        if (connection == null){

        }       
        
        return connection;
        
    }
}
