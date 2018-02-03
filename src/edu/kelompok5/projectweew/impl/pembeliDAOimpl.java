/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.impl;

import edu.kelompok5.projectweew.entity.pembeli;
import edu.kelompok5.projectweew.error.pembeliException;
import edu.kelompok5.projectweew.service.PembeliDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Naufal Zayn M
 */
public class pembeliDAOimpl implements PembeliDAO {

    
    private Connection connection;
    private final String insertPembeli = "INSERT INTO PEMBELI (NOHP_PEMBELI)VALUES(?)";
    private final String updatePembeli = "UPDATE PEMBELI SET NOHP_PEMBELI=? WHERE ID_PEMBELI=?";
    private final String deletePembeli = "DELETE FROM PEMBELI WHERE ID_PEMBELI=?";   
    private final String getById = "SELECT * FROM PEMBELI WHERE ID_PEMBELI=?";
    private final String getByNohp = "SELECT * FROM PEMBELI WHERE NOHP_PEMBELI=?";
    private final String selectAll="SELECT * FROM PEMBELI";
    
    
    public pembeliDAOimpl(Connection connection) {
        this.connection = connection;
    }
    
    
    
    @Override
    public void insertPembeli(pembeli pembeli) throws pembeliException {
        PreparedStatement statement = null;
        try {
            
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertPembeli);
            statement.setString(1, pembeli.getNohp_pembeli());
            statement.executeUpdate();
            
            connection.commit();
                    
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new pembeliException(e.getMessage());
        }finally{
            
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
            }
            
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
            
        }
    }

    @Override
    public void updatePembeli(pembeli pembeli) throws pembeliException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updatePembeli);
            statement.setString(1, pembeli.getNohp_pembeli());
            statement.setInt(2,pembeli.getId_pembeli());
            statement.executeUpdate();
                     connection.commit();
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new pembeliException(e.getMessage());
        }finally{
            
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
            }
            
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
            
        }
    }

    @Override
    public void deletePembeli(Integer id_pembeli) throws pembeliException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(deletePembeli);
            statement.setInt(1, id_pembeli);
            statement.executeUpdate();
                 connection.commit();    
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new pembeliException(e.getMessage());
        }finally{
            
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
            }
            
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
            
        }
    }

    @Override
    public pembeli getPembeli(Integer id_pembeli) throws pembeliException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getById);
            statement.setInt(1, id_pembeli);
           ResultSet result = statement.executeQuery();
           pembeli pembeli = null;
           
            if (result.next()) {
                pembeli = new pembeli();
                pembeli.setId_pembeli(result.getInt("ID_PEMBELI"));
                 pembeli.setNohp_pembeli(result.getString("NOHP_PEMBELI"));
                
            } else{
                throw new pembeliException ("Pembeli dengan id "+id_pembeli+" tidak ditemukan");
            }
             connection.commit();
           return pembeli; 
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new pembeliException(e.getMessage());
        }finally{
            
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
            }
            
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
            
        }
    }

    @Override
    public pembeli getPembeli(String nohp_pembeli) throws pembeliException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getByNohp);
            statement.setString(1, nohp_pembeli );
           ResultSet result = statement.executeQuery();
           pembeli pembeli = null;
           
            if (result.next()) {
                pembeli = new pembeli();
                pembeli.setId_pembeli(result.getInt("ID_PEMBELI"));
                 pembeli.setNohp_pembeli(result.getString("NOHP_PEMBELI"));
                
            } else{
                throw new pembeliException ("Pembeli dengan no hp "+nohp_pembeli+" tidak ditemukan");
            
            }
             connection.commit();
            return pembeli;                   
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new pembeliException(e.getMessage());
        }finally{
            
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
            }
            
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
            
        }
    }

    @Override
    public List<pembeli> selectAllPembeli() throws pembeliException {
       Statement statement = null;
       
       List <pembeli> list = new ArrayList<pembeli>();
       
        try {
            connection.setAutoCommit(false);
            statement = connection.createStatement();
           
           ResultSet result = statement.executeQuery(selectAll);
           pembeli pembeli = null;
           
            while (result.next()) {
                pembeli = new pembeli();
                pembeli.setId_pembeli(result.getInt("ID_PEMBELI"));
                 pembeli.setNohp_pembeli(result.getString("NOHP_PEMBELI"));
                list.add(pembeli);
            }
             connection.commit();
            return list;                   
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new pembeliException(e.getMessage());
        }finally{
            
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
            }
            
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
            
        }
    
}
}
