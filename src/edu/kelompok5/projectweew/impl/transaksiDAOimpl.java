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
    private final String insertTransaksi = "INSERT INTO TRANSAKSI (ID_PENJUAL,NOHP_PEMBELI,HASIL,NOMINAL,TANGGAL)VALUES(?,?,?,?,?)";
    private final String updateTransaksi = "UPDATE TRANSAKSI SET ID_PENJUAL=?,NOHP_PEMBELI=?,HASIL=?,NOMINAL=? WHERE ID_PEMBELI=?";
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
            statement.setInt(1, transaksi.getId_penjual());
            statement.setString(2, transaksi.getNohp_pembeli());
            statement.setString(3, transaksi.getHasil());
            statement.setString(4, transaksi.getNominal());
            statement.setDate(5, transaksi.getTanggal());
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
            statement.setInt(1, transaksi.getId_penjual());
            statement.setInt(2, transaksi.getId_pembeli());
            statement.setString(3, transaksi.getNohp_pembeli());
            statement.setString(4, transaksi.getNominal());
            statement.setString(5, transaksi.getHasil());
            statement.setDate(6, transaksi.getTanggal());
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
                transaksi.setId_penjual(result.getInt("ID_PENJUAL"));
                transaksi.setNohp_pembeli(result.getString("NOHP_PEMBELI"));
                transaksi.setHasil(result.getString("HASIL"));
                transaksi.setNominal(result.getString("NOMINAL"));
                transaksi.setTanggal(result.getDate("TANGGAL"));

            } else {
                throw new transaksiException("Transaksi dengan id pembeli " + id_pembeli + " tidak ditemukan");
            }
            connection.commit();
            return transaksi;
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
                transaksi.setId_penjual(result.getInt("ID_PENJUAL"));
                transaksi.setNohp_pembeli(result.getString("NOHP_PEMBELI"));
                transaksi.setHasil(result.getString("HASIL"));
                transaksi.setNominal(result.getString("NOMINAL"));
                transaksi.setTanggal(result.getDate("TANGGAL"));

            } else {
                throw new transaksiException("Transaksi dengan hasil " + hasil + " tidak ditemukan");
            }
            connection.commit();
            return transaksi;
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
    public List<transaksi> selectAllTransaksi() throws transaksiException {
        Statement statement = null;

        List<transaksi> list = new ArrayList<transaksi>();

        try {
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            ResultSet result = statement.executeQuery(selectAll);
            transaksi transaksi = null;

            while (result.next()) {
                transaksi = new transaksi();
                transaksi.setId_pembeli(result.getInt("ID_PEMBELI"));
                transaksi.setId_penjual(result.getInt("ID_PENJUAL"));
                transaksi.setNohp_pembeli(result.getString("NOHP_PEMBELI"));
                transaksi.setHasil(result.getString("HASIL"));
                transaksi.setNominal(result.getString("NOMINAL"));
                transaksi.setTanggal(result.getDate("TANGGAL"));
                list.add(transaksi);
            }
            connection.commit();
            return list;
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
}
