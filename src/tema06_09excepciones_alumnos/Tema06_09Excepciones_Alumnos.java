/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema06_09excepciones_alumnos;

import java.util.Scanner;

/**
 *
 * @author ITP1DAM
 */
public class Tema06_09Excepciones_Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumnos alum = new Alumnos();
        alum.setNombre("Juan");
        String name;
        int pos, opcion;
        double not;
        Scanner ts = new Scanner(System.in);
        Scanner ti = new Scanner(System.in);
        Scanner td = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("---------");
        System.out.println("1.- Añadir notas");
        System.out.println("2.- Cambiar nota");
        System.out.println("3.- Imprimir notas");
        System.out.println("0.- Salir");
        do{
            System.out.println("****************");
            System.out.println("1.-");
            System.out.println("2.-");
            System.out.println("3.-");
            System.out.println("0.-");
            System.out.println("****************");
            opcion = ti.nextInt();
            switch(opcion){
                case 1:
                    try{
                        alum.pedirNotas();
                    }
                    catch(RangoException error){
                        System.err.println("Notas no validas");
                    }
                    break;
                case 2:
                    try{
                        System.out.println("¿Que posicion deseas modificar?");
                        pos = ti.nextInt();
                        System.out.println("¿Que nota le pones?");
                        not = td.nextDouble();
                        alum.modificarNota(pos, not);
                    }
                    catch(RangoException error){
                        System.err.println("Notas no validas");
                    }
                    catch(posicionIncorrectaException error){
                        System.err.println("posicion del array no valida");
                    }
                    break;
                case 3:
                    alum.imprimirClificaciones();
                    break;
            }
        }while(opcion != 0);
        System.out.println("Adios!");
        
        
        
        
    }
    
}
