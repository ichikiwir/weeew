/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.kelompok5.projectweew.impl.pembeliDAOimpl;
import edu.kelompok5.projectweew.impl.penjualDAOimpl;
import edu.kelompok5.projectweew.service.PembeliDAO;
import edu.kelompok5.projectweew.service.PenjualDAO;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Naufal Zayn M
 */
public class dbweeew {

    private static Connection connection;
    private static PembeliDAO pembeliDAO;
    private static PenjualDAO penjualDAO;
    
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
    public static PembeliDAO getPembeliDAO() throws SQLException{
      
        if (pembeliDAO == null){
            pembeliDAO = new pembeliDAOimpl(getConnection());
        }
        
        return pembeliDAO  ;
    }
    
    public static PenjualDAO getPenjualDAO() throws SQLException{
      
        if (penjualDAO == null){
            penjualDAO = new penjualDAOimpl(getConnection());
        }
        
        return penjualDAO  ;
    }
    
}
