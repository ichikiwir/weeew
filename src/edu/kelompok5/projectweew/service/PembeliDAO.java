/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.service;

import edu.kelompok5.projectweew.entity.pembeli;
import edu.kelompok5.projectweew.error.pembeliException;
import java.util.List;

/**
 *
 * @author Naufal Zayn M
 */
public interface PembeliDAO {

    public void insertPembeli(pembeli pembeli) throws pembeliException;

    public void updatePembeli(pembeli pembeli) throws pembeliException;

    public void deletePembeli(String nohp_pembeli) throws pembeliException;

    public pembeli getPembeli(Integer id_pembeli) throws pembeliException;

    public pembeli getPembeli(String nohp_pembeli) throws pembeliException;

    public List<pembeli> selectAllPembeli() throws pembeliException;

}
