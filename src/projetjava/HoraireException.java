/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

/**
 *
 * @author Coline
 */
public class HoraireException extends Exception {

    /**
     * Creates a new instance of <code>HoraireException</code> without detail
     * message.
     */
    public HoraireException() {
    }

    /**
     * Constructs an instance of <code>HoraireException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public HoraireException(String msg) {
        super(msg);
    }
}
