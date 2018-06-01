/**
 * @author David Bautista Cazares
 * @version 1
 */
package Controlador;

import Vista.*;
import Modelo.*;
import java.util.Scanner;

public class Controlador {

    private SistemaVista interfaz;
    private SistemaModelo modelo;
    private Usuario usuario;

    public Controlador (SistemaVista v, SistemaModelo m){
        interfaz = v;
        modelo = m;
    }

    public void accion(Usuario u){
        System.out.println("Escribe la accion que quieres realizar");
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();
        switch(opcion){

            case 1:
                interfaz.printAlumnos(modelo.listaAlumnos(u));
                break;

            case 2:

        }
    }

    public void iniciarSesion(){
        boolean login = false;
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        while(login == false){

            int numCuent = 0;
            String password = null;
            try{
                System.out.println("Escribe tu numero de cuenta");
                numCuent = entrada.nextInt();
                System.out.println("Escribe tu contraseña");
                password = entrada2.nextLine();
            }catch (IllegalArgumentException e){
                System.out.println("Has ingresado mal la contraseña o un numero de cuenta no existente");
            }finally {

                for(int i=0;i<modelo.grupos.size();i++){

                }
            }

        }
    }
}
