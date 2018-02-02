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
public class pembeliException extends Exception {

    /**
     * Creates a new instance of <code>pembeliException</code> without detail
     * message.
     */
    public pembeliException() {
    }

    /**
     * Constructs an instance of <code>pembeliException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public pembeliException(String msg) {
        super(msg);
    }
}
