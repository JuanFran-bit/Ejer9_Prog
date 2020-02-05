/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema06_09excepciones_alumnos;

/**
 * Revisa que la nota sea correcta, entre 0 y 10
 * @author Juanfran
 */
public class RangoException extends Exception{
    public RangoException(String mensaje){
        super(mensaje);
    }
}
