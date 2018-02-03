/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.impl;

import edu.kelompok5.projectweew.entity.transaksi;
import edu.kelompok5.projectweew.error.transaksiException;
import edu.kelompok5.projectweew.service.TransaksiDAO;
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
public class transaksiDAOimpl implements TransaksiDAO {

    private Connection connection;
    private final String insertTransaksi = "INSERT INTO TRANSAKSI (HASIL)VALUES(?)";
    private final String updateTransaksi = "UPDATE TRANSAKSI SET HASIL=? WHERE ID_PEMBELI=?";
    private final String deleteTransaksi = "DELETE FROM TRANSAKSI WHERE ID_PEMBELI=?";
    private final String getById = "SELECT * FROM TRANSAKSI WHERE ID_PEMBELI=?";
    private final String getByHasil = "SELECT * FROM TRANSAKSI WHERE HASIL=?";
    private final String selectAll = "SELECT * FROM TRANSAKSI";

    public transaksiDAOimpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertTransaksi(transaksi transaksi) throws transaksiException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertTransaksi);
            statement.setString(1, transaksi.getHasil());
            statement.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            throw new transaksiException(e.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }

        }
    }

    @Override
    public void updateTransaksi(transaksi transaksi) throws transaksiException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updateTransaksi);
            statement.setString(1, transaksi.getHasil());
            statement.setInt(2, transaksi.getId_pembeli());
            statement.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            throw new transaksiException(e.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }

        }
    }

    @Override
    public void deleteTransaksi(Integer id_pembeli) throws transaksiException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(deleteTransaksi);
            statement.setInt(1, id_pembeli);
            statement.executeUpdate();
            connection.commit();
                    
        } catch (SQLException e) {
            throw new transaksiException(e.getMessage());
        }finally{
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
            
        }
    }

    @Override
    public transaksi getTransaksi(Integer id_pembeli) throws transaksiException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getById);
            statement.setInt(1, id_pembeli);
           ResultSet result = statement.executeQuery();
           transaksi transaksi = null;
           
            if (result.next()) {
                transaksi = new transaksi();
                transaksi.setId_pembeli(result.getInt("ID_PEMBELI"));
                 transaksi.setHasil(result.getString("HASIL"));
                
            } else{
                throw new transaksiException ("Transaksi dengan id pembeli "+id_pembeli+" tidak ditemukan");
            }
            connection.commit();
           return transaksi; 
        } catch (SQLException e) {
            throw new transaksiException(e.getMessage());
        }finally{
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
            
        }
    }

    @Override
    public transaksi getTransaksi(String hasil) throws transaksiException {
      PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getByHasil);
            statement.setString(1, hasil);
           ResultSet result = statement.executeQuery();
           transaksi transaksi = null;
           
            if (result.next()) {
                transaksi = new transaksi();
                transaksi.setId_pembeli(result.getInt("ID_PEMBELI"));
                 transaksi.setHasil(result.getString("HASIL"));
                
            } else{
                throw new transaksiException ("Transaksi dengan hasil "+hasil+" tidak ditemukan");
            }
            connection.commit();
           return transaksi; 
        } catch (SQLException e) {
            throw new transaksiException(e.getMessage());
        }finally{
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
            
        } 
    }

    @Override
    public List<transaksi> selectAllTransaksi() throws transaksiException {
     Statement statement = null;
       
       List <transaksi> list = new ArrayList<transaksi>();
       
        try {
            connection.setAutoCommit(false);
            statement = connection.createStatement();
           
           ResultSet result = statement.executeQuery(selectAll);
           transaksi penjual = null;
           
            while (result.next()) {
                penjual = new transaksi();
                penjual.setId_penjual(result.getInt("ID_PENJUAL"));
                 penjual.setHasil(result.getString("HASIL"));
                list.add(penjual);
            }
            connection.commit();
            return list;                   
        } catch (SQLException e) {
            throw new transaksiException(e.getMessage());
        }finally{
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
            
        }    
    }
}
