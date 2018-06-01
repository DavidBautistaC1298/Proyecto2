/**
 * @author David Bautista Cazares
 * @version 1
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Grupo implements Serializable {

    private ArrayList<Alumno> grupo;
    public Profesor profesor;
    public int anio;
    public char letra;

    public Grupo(ArrayList<Alumno> grupo) {

        this.grupo = grupo;
    }

    public void getAlumno(Alumno a){

    }

    public ArrayList<Alumno> getAlumnos(){
        return grupo;
    }


}
