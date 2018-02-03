/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.impl;

import edu.kelompok5.projectweew.entity.transaksi;
import edu.kelompok5.projectweew.error.transaksiException;
import edu.kelompok5.projectweew.service.TransaksiDAO;
import java.util.List;

/**
 *
 * @author Naufal Zayn M
 */
public class transaksiDAOimpl implements TransaksiDAO {

    @Override
    public void insertPenjual(transaksi transaksi) throws transaksiException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePenjual(transaksi transaksi) throws transaksiException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePenjual(Integer id_penjual) throws transaksiException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public transaksi getPenjual(Integer id_penjual) throws transaksiException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public transaksi getPenjual(String nama_penjual) throws transaksiException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<transaksi> selectAllPenjual() throws transaksiException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
