/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package excercise53;

/**
 *
 * @author Dominik
 */
public class MyException extends Exception {

    /**
     * Creates a new instance of <code>MyException</code> without detail
     * message.
     */
    public MyException() {
        System.out.println("Jestę wyjątkię");
    }

    /**
     * Constructs an instance of <code>MyException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public MyException(String msg) {
        super(msg);
    }
}
