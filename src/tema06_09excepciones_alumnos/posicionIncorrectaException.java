/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema06_09excepciones_alumnos;

/**
 *
 * @author Juanfran
 */
public class posicionIncorrectaException extends Exception {
    public posicionIncorrectaException(String mensaje){
        super(mensaje);
    }
}
