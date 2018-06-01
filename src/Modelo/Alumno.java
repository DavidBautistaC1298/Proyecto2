/**
 * @author David Bautista
 * @version 1
 */

package Modelo;

import java.io.Serializable;

public class Alumno implements Usuario, Serializable {

    private String nombre;
    private int numCuent;
    private int password;
    private int[] calificaciones;


    /**
     * Constructor para Alumno
     * @param nombre nombre del alumno
     * @param numCuent numero de cuenta del alumno
     */
    public Alumno(String nombre, int numCuent, int password){
        this.nombre = nombre;
        this.numCuent = numCuent;
        this.password = password;
    }

    /**
     * Regresa un 0 para verificar si tiene los permisos
     * para usar ciertos metodos del modelo
     * numero cero para identificar a un alumno
     * @return int
     */
    @Override
    public int getPassword() {
        return password;
    }

    /**
     * Regresa el nombre del alumno
     * @return String
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Regresa el numero de cuenta del alumno
     * @return int
     */
    @Override
    public int getNumCuent() {
        return numCuent;
    }

    /**
     * ToString para el objeto alumno devuelve los datos del alumno
     * @return String
     */
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", numCuent=" + numCuent +
                '}';
    }
}
