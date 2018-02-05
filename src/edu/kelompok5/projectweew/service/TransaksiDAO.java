/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.service;

import edu.kelompok5.projectweew.entity.transaksi;
import edu.kelompok5.projectweew.error.transaksiException;
import java.util.List;

/**
 *
 * @author Naufal Zayn M
 */
public interface TransaksiDAO {
    public void insertTransaksi(transaksi transaksi) throws transaksiException;

    

    public void deleteTransaksi(Integer id_pembeli) throws transaksiException;

    public transaksi getTransaksi(Integer id_pembeli) throws transaksiException;

    public transaksi getTransaksi(String hasil) throws transaksiException;

    public List<transaksi> selectAllTransaksi() throws transaksiException;
    
}
