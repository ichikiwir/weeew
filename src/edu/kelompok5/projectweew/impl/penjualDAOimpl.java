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
import java.util.List;

/**
 *
 * @author Naufal Zayn M
 */
public class penjualDAOimpl implements PenjualDAO {
private Connection connection;

    public penjualDAOimpl(Connection connection) {
        this.connection = connection;
    }
    @Override
    public void insertPenjual(penjual penjual) throws penjualException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePenjual(penjual penjual) throws penjualException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
