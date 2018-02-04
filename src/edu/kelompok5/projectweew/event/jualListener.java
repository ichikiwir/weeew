/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.event;

import edu.kelompok5.projectweew.entity.pembeli;
import edu.kelompok5.projectweew.entity.transaksi;
import edu.kelompok5.projectweew.model.jualModel;

/**
 *
 * @author Naufal Zayn M
 */
public interface jualListener {
    public void onChange(jualModel model);
    public void onInsertPembeli( pembeli pembeli);
    public void onInsertTransaksi(transaksi transaksi);
    public void onDelete();
    public void onUpdatePembeli(pembeli pembeli);
    public void onUpdateTransaksi(transaksi transaksi);
}
