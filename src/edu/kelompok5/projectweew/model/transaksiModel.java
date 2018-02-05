/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.model;

import edu.kelompok5.projectweew.entity.transaksi;
import edu.kelompok5.projectweew.view.Jual;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Naufal Zayn M
 */
public class transaksiModel extends AbstractTableModel {

    private List<transaksi> list = new ArrayList<>();

    public void setList(List<transaksi> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    public boolean add(transaksi e) {
        try {
            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }
    }
    

    public transaksi get(int index) {
        return list.get(index);
    }

    public transaksi set(int index, transaksi element) {
        try {
            return list.set(index, element);
        } finally {
            fireTableRowsUpdated(index, index);
        }

    }

    public transaksi remove(int index) {
        try {
            return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }
    }
    
    

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 :
                return "ID_PEMBELI";
                case 1 :
                return "ID_PENJUAL";
                case 2 :
                return "NOHP_PEMBELI";
                case 3 :
                return "NOMINAL";
                case 4 :
                return "HASIL";
                case 5 :
                return "TANGGAL";
                default: return null;
    }
    }
    
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getId_pembeli();
            case 1:
                return list.get(rowIndex).getId_penjual();
            case 2:
                return list.get(rowIndex).getNohp_pembeli();
            case 3:
                return list.get(rowIndex).getNominal();
            case 4:
                return list.get(rowIndex).getHasil();
            case 5:
                return list.get(rowIndex).getTanggal();
            default:
                return null;
        }
    }

    public void setListener(Jual aThis) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
