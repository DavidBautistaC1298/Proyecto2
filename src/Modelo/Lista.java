/**
 * @author Carlos Alvarez De la Rosa
 * @version 1
 */
package Modelo;

import java.util.Iterator;

public interface Lista {

    public Iterator iterator();

    public boolean busca(int numcuenta, int contra);
}
