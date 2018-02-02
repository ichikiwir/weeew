/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.service;

import edu.kelompok5.projectweew.entity.penjual;
import edu.kelompok5.projectweew.error.penjualException;
import java.util.List;

/**
 *
 * @author Naufal Zayn M
 */
public interface PenjualDAO {
    
     public void insertPenjual(penjual penjual) throws penjualException;

    public void updatePenjual(penjual penjual) throws penjualException;

    public void deletePenjual(Integer id_penjual) throws penjualException;

    public penjual getPenjual(Integer id_penjual) throws penjualException;

    public penjual getPenjual(String nama_penjual) throws penjualException;

    public List<penjual> selectAllPenjual() throws penjualException;
}
