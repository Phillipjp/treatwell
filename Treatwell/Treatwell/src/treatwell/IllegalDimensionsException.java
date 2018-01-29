/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treatwell;

/**
 *
 * @author phillipperks
 */
public class IllegalDimensionsException extends Exception {

    /**
     * Creates a new instance of <code>IncorrectDimensionsException</code>
     * without detail message.
     */
    public IllegalDimensionsException() {
    }

    /**
     * Constructs an instance of <code>IncorrectDimensionsException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public IllegalDimensionsException(String msg) {
        super(msg);
    }
}
