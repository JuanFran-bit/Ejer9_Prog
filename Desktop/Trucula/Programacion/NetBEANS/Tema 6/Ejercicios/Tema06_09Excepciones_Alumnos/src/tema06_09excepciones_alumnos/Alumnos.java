/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema06_09excepciones_alumnos;

import java.util.ArrayList;

/**
 *
 * @author ITP1DAM
 */
public class Alumnos {
    private static int num_asignaturas=5;
    private String nombre;
    ArrayList<Double> notas = new ArrayList<>();

    public Alumnos(String nombre) {
        this.nombre = nombre;
    }
    public Alumnos(){
        nombre = "";
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
