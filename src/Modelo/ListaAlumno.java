/**
 * @author Carlos Alvarez de la Rosa
 * @version 1
 */
package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaAlumno implements Lista{

    ArrayList alumnos;
    public ListaAlumno(){
    }
    public Iterator iterator(){
        return alumnos.listIterator();
    }
    public boolean busca(int numcuenta, int contra){
        Iterator it = this.iterator();
        while(it.hasNext()){
            Alumno alu = (Alumno)it.next();
            if((numcuenta == alu.getNumCuent()) && (contra == alu.getPassword())){
                return true;
            }
        }
        return false;
    }
}
