/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import edu.kelompok5.projectweew.impl.transaksiDAOimpl;

import edu.kelompok5.projectweew.service.TransaksiDAO;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Naufal Zayn M
 */
public class dbweeew {

    private static Connection connection;
   
    private static TransaksiDAO transaksiDAO;
    
    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            
            MysqlDataSource datasource = new MysqlDataSource();
            datasource.setURL("jdbc:mysql://localhost:3306/dbweeew");
            datasource.setUser("root");
            datasource.setPassword("");
            connection = datasource.getConnection();
        }

        return connection;
    }
   
    public static TransaksiDAO getTransaksiDAO() throws SQLException{
      
        if (transaksiDAO == null){
            transaksiDAO = new transaksiDAOimpl(getConnection());
        }
        
        return transaksiDAO  ;
    }
    
}
