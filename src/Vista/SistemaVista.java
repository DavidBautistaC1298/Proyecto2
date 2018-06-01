/**
 * @author David Bautista Cazares
 * @version 1
 */
package Vista;

import Modelo.Alumno;
import Modelo.Profesor;

import java.util.ArrayList;

public class SistemaVista {

    public SistemaVista(){

    }

    public void printAlumnos(ArrayList<Alumno> a){
        for(int i = 0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }

    public void printProfesores(ArrayList<Profesor> p){
        for(int i = 0;i<p.size();i++){
            System.out.println(p.get(i));
        }
    }


}
