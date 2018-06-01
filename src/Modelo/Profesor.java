/**
 * @author David Bautista Cazares
 * @version 1
 */
package Modelo;

import java.io.Serializable;
import java.util.Iterator;

public class Profesor implements Usuario, Serializable {

    private String nombre;
    private int numCuent;
    private int password;

    public Profesor(String nombre, int numCuent, int password){
        this.nombre = nombre;
        this.numCuent = numCuent;
        this.password = password;
    }

    /**
     *Devuelve un 1 para verificar si tiene los permisos
     * para usar ciertos metodos del modelo
     * numero uno para identificar a un profesor
     * @return int
     */
    @Override
    public int getPassword() {
        return password;
    }

    /**
     *Devuelve el nombre del profesor
     * @return String
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     *Devuelve el numero de cuenta del profesor, que es 0 por no ser alumno
     * @return
     */
    @Override
    public int getNumCuent() {
        return numCuent;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", numCuent=" + numCuent +
                '}';
    }
}
