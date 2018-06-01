/**
 * @author Bautista Cazares
 * @version 1
 */

import Controlador.Controlador;
import Modelo.SistemaModelo;
import Vista.SistemaVista;

import java.util.ArrayList;

public class Main {

    public static void  main (String args[]){

        System.out.print("Hola mamá");

        SistemaVista interfaz = new SistemaVista();
        SistemaModelo modelo = new SistemaModelo();

        Controlador controlador = new Controlador(interfaz,modelo);

    }
}
