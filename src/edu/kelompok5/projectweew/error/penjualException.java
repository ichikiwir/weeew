/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok5.projectweew.error;

/**
 *
 * @author Naufal Zayn M
 */
public class penjualException extends Exception {

    /**
     * Creates a new instance of <code>penjualException</code> without detail
     * message.
     */
    public penjualException() {
    }

    /**
     * Constructs an instance of <code>penjualException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public penjualException(String msg) {
        super(msg);
    }
}
