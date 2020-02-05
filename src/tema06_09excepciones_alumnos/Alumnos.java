/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema06_09excepciones_alumnos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Alumnos
 * @author Juanfran
 */
public class Alumnos {
    private static int num_asignaturas=5;
    private String nombre;
    ArrayList<Double> notas = new ArrayList<>();

    /**
     *
     * @param nombre
     */
    public Alumnos(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     */
    public Alumnos(){
        nombre = "";
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Añade la notas a un alumno
     * @throws RangoException 
     */
    public void pedirNotas() throws RangoException{
        Scanner ti = new Scanner(System.in);
        double notaalum;
        System.out.println("Dime las notas: ");
        for (int i = 0; i < num_asignaturas; i++) {
            notaalum = ti.nextDouble();
            if (notaalum < 0 ||notaalum >10){
                throw new RangoException("Error: Nota no valida");
            }
            else{
                notas.add(notaalum);
            }
        }
    }
    
    /**
     * Modifica una de las notas del alumno
     * @param posicion posicion que queremos modificar
     * @param nnota nota que sustituira el valor de la posicion indicada
     * @throws RangoException comprueba que la nota sea valida
     * @throws posicionIncorrectaException comprueba que la posicion sea valida
     */
    public void modificarNota(int posicion, double nnota)throws RangoException, posicionIncorrectaException{
        if (nnota < 0 ||nnota >10){
                throw new RangoException("Error: Nota no valida");
            }
            else{
                if (posicion <0 || posicion > 5){
                    throw new posicionIncorrectaException("Error: posicion del array no valida");
                }
                else{
                    notas.set(posicion, nnota);
                }
            }
    }
    
}
