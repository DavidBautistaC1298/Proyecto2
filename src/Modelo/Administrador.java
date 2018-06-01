/**
 * @author David Bautista Cazares
 */
package Modelo;

import java.io.Serializable;

public class Administrador implements Usuario, Serializable {

    private String nombre;
    private int numCuent;
    private int password;


    public Administrador(String nombre, int numCuent, int password) {
        this.nombre = nombre;
        this.numCuent = numCuent;
        this.password = password;
    }

    /**
     * Devuelve un 2 para verificar si tiene los permisos
     * para usar ciertos metodos del modelo
     * numero dos para identificar un administrador
     * @return int
     */
    @Override
    public int getPassword() {
        return password;
    }

    /**
     *Devuelve el nombre del administrador
     * @return String
     */
    @Override
    public String getNombre() {
        return nombre;

    }

    /**
     *Devuelve el numero de cuenta del administrador, que es 0 por no ser alumno
     * @return
     */
    @Override
    public int getNumCuent() {
        return numCuent;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "nombre='" + nombre + '\'' +
                ", numCuent=" + numCuent +
                '}';
    }
}
