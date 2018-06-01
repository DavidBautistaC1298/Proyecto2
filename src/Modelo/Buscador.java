/**
 * @author Carlos Alvarez de la Rosa
 * @version 1
 */
package Modelo;

import java.util.Iterator;
import java.util.ArrayList;

public class Buscador{

    ArrayList<Usuario> usuarios;

    public Buscador (ArrayList<Usuario> usuarios){
        this.usuarios = usuarios;
    }

    public boolean busca(){
        Iterator busca = usuarios.iterator();
        while(busca.hasNext()){
            Usuario u = (Usuario)busca.next();
            u.busca();
        }
        return false;
    }
}
