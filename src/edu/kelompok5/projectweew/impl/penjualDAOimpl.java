/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.impl;

import edu.kelompok5.projectweew.entity.penjual;
import edu.kelompok5.projectweew.error.penjualException;
import edu.kelompok5.projectweew.service.PenjualDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Naufal Zayn M
 */
public class penjualDAOimpl implements PenjualDAO {
private Connection connection;
private final String insertPenjual = "INSERT INTO PENJUAL (ID_PENJUAL,NAMA_PENJUAL)VALUES(?,?)";
    private final String updatePenjual = "UPDATE PENJUAL SET ID_PENJUAL=?, NAMA_PENJUAL=? WHERE ID_PENJUAL=?";
    private final String deletePenjual = "DELETE FROM PENJUAL WHERE ID_PENJUAL=?";   
    private final String getById = "SELECT * FROM PENJUAL WHERE ID_PENJUAL=?";
    private final String getByNama = "SELECT * FROM PENJUAL WHERE NAMA_PENJUAL=?";
    private final String selectAll="SELECT * FROM PENJUAL";

    public penjualDAOimpl(Connection connection) {
        this.connection = connection;
    }
    @Override
    public void insertPenjual(penjual penjual) throws penjualException {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insertPenjual);
            statement.setInt(1, penjual.getId_penjual());
            statement.setString(2, penjual.getNama_penjual());
            statement.executeUpdate();
                    
        } catch (SQLException e) {
            throw new penjualException(e.getMessage());
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
    public void updatePenjual(penjual penjual) throws penjualException {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(updatePenjual);
            statement.setInt(1, penjual.getId_penjual());
            statement.setString(2, penjual.getNama_penjual());
            statement.executeUpdate();
                    
        } catch (SQLException e) {
            throw new penjualException(e.getMessage());
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
    public void deletePenjual(Integer id_penjual) throws penjualException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public penjual getPenjual(Integer id_penjual) throws penjualException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public penjual getPenjual(String nama_penjual) throws penjualException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<penjual> selectAllPenjual() throws penjualException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
