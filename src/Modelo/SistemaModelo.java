/**
 * @author David Bautista Cazares
 * @author Carlos Alvarez de la Rosa
 * @version 1
 */
package Modelo;

import java.io.*;
import java.util.ArrayList;
import Data.*;

public class SistemaModelo {

    private ArrayList<Alumno> alumnos;
    private ArrayList<Profesor> profesores;
    public ArrayList<Grupo> grupos;
    private Administrador admin;

    public SistemaModelo(){

    }

    //Operaciones Administrador

    //debe regresar los alumnos en una tabla grafica en la ventana Vista
    public ArrayList<Alumno> listaAlumnos(Usuario u){

        ArrayList<Alumno> listaTotal = null;
        if(esAdmin(u.getNumCuent())){

            for(int i=0;i<grupos.size();i++){
                listaTotal.addAll(grupos.get(i).getAlumnos());
            }

            return listaTotal;
        }else{
            System.out.println("No tienes los permisos necesarios");
            return null;
        }

    }

    //Agrega un nuevo profesor a la lista profesores
    public void addProfesor(Usuario u, Profesor p,int anio,char letra){

        if(u.getPassword() == 2){
            profesores.add(p);
        }else{
            System.out.println("No tienes los permisos necesarios");
        }

        if(esAdmin(u.getNumCuent())){

        }
    }

    public ArrayList<Profesor> listaProfesores(Usuario u){

        if(esAdmin(u.getNumCuent())){
            ArrayList<Profesor> temp = null;
            for(int i = 0; i< grupos.size();i++){
                temp.add(grupos.get(i).profesor);
            }
            return temp;
        }else{
            System.out.println("No tienes los permisos necesarios");
        }
        return null;
    }

    public void addProfesorGrupo(Usuario u, Profesor p){

        if(u.getID() == 2){
            profesores.add(p);
        }else{
            System.out.println("No tienes los permisos necesarios");
        }
    }


    public void graduarAlumno(Usuario u, Usuario a){

        if(u.getID() == 2){
            alumnos.remove(a);
        }else{
            System.out.println("No tienes los permisos necesarios");
        }

    }

    public void ascenderAlumno(Usuario u, Usuario a){

        if(u.getID() == 2){
            //cambiar alumno de grupo
        }else{
            System.out.println("No tienes los permisos necesarios");
        }

    }

    public void inscribirAlumno(Usuario u, Usuario a){

        if(u.getID() == 2){
            //poner al alumno en un grupo de primer grado
        }else{
            System.out.println("No tienes los permisos necesarios");
        }
    }

    public void DarBajaAlumno(Usuario u, Usuario a){

        if(u.getID() == 2){
            //eliminar alumno de la lista y del grupo en el que estaba
        }else{
            System.out.println("No tienes los permisos necesarios");
        }

    }




    //Operaciones Profesor


    //un profesor debe poder actualizar sus datos, como su numero de contacto, correo etc
    public void actualizarProfesor(Usuario p){

    }

    //debe poder ver la lista de alumnos que estan en su grupo
    public void alumnosGrupo(Usuario p){

    }

    //asignar calificaciones a los alumnos
    public void calificarAlumnos(Usuario p){

    }




    //Operaciones Alumnos

    public void historial(Usuario a){

    }

    public void promedioGeneral(Usuario a){

    }

    public void promedioBimestral(Usuario a){

    }

    public void calificacionesBimestrales(Usuario a){

    }

    public void calificacionesAnuales(Usuario a){

    }


    //Serialización


    public void Serializar(){
        FileOutputStream datosPersona = null;

        //escribiendo en el archivo
        try{
            datosPersona = new FileOutputStream("DatosPersona.txt");
            ObjectOutputStream escritura = new ObjectOutputStream(datosPersona);
            escritura.writeObject(grupos);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        //Cerrando escritura
        finally {
            try{
                datosPersona.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }


    public void verificarID(int id){
        //ObjectInputStream lectura = new ObjectInputStream(new FileInputStream(("D")));
    }

    public boolean esAdmin(int numCuen){
        return admin.getNumCuent() == numCuen;
    }

    public void escribirdAdmin(){
        FileOutputStream escritura = null;
        ObjectOutputStream salida = null;
        try{
            escritura = new FileOutputStream("Admin.txt");
            salida = new ObjectOutputStream(escritura);
            salida.writeObject(admin);
            salida.close();
            escritura.close();
        }catch(FileNotFoundException e){
            System.out.println("El archivo no existe");
        }
        catch(IOException e){
            System.out.println("IO Exception");
        }
        finally {
            System.out.println("Guardado de password exitoso");
        }
    }

    public void leerAdmin(){
      try{
          FileInputStream lectura = new FileInputStream("Admin.txt");
          ObjectInputStream entrada = new ObjectInputStream(lectura);
          admin = (Administrador)entrada.readObject();
          entrada.close();
          lectura.close();
      }catch(FileNotFoundException e){
          System.out.println("El archivo no existe");
      }catch(IOException e){
          System.out.println("IO Exception");
      }catch(ClassNotFoundException e){
          System.out.println("La clase a la que pertenece el objeto no existe");
      }
      finally{
          System.out.println("Lectura de password exitoso");
      }
    }


    public void escribirGrupos(){
        FileOutputStream escritura = null;
        ObjectOutputStream salida = null;
        try{
            escritura = new FileOutputStream("grupos.txt");
            salida = new ObjectOutputStream(escritura);
            salida.writeObject(grupos);
            salida.close();
            escritura.close();
        }catch(FileNotFoundException e){
            System.out.println("El archivo no existe");
        }
        catch(IOException e){
            System.out.println("IO Exception");
        }
        finally {
            System.out.println("Guardado de grupos exitoso");
        }
    }


    public void leerGrupos(){
        try{
            FileInputStream lectura = new FileInputStream("Grupos.txt");
            ObjectInputStream entrada = new ObjectInputStream(lectura);
            grupos = (ArrayList<Grupo>)entrada.readObject();
            entrada.close();
            lectura.close();
        }catch(FileNotFoundException e){
            System.out.println("El archivo no existe");
        }catch(IOException e){
            System.out.println("IO Exception");
        }catch(ClassNotFoundException e){
            System.out.println("La clase a la que pertenece el objeto no existe");
        }
        finally{
            System.out.println("Lectura de grupos exitosa");
        }
    }

    public void escribirAlumnos(){
        FileOutputStream escritura = null;
        ObjectOutputStream salida = null;
        try{
            escritura = new FileOutputStream("Alumnos.txt");
            salida = new ObjectOutputStream(escritura);
            salida.writeObject(alumnos);
            salida.close();
            escritura.close();
        }catch(FileNotFoundException e){
            System.out.println("El archivo no existe");
        }
        catch(IOException e){
            System.out.println("IO Exception");
        }
        finally {
            System.out.println("Guardado de alumnos exitoso");
        }
    }

    public void leerAlumnos(){
        try{
            FileInputStream lectura = new FileInputStream("Alumnos.txt");
            ObjectInputStream entrada = new ObjectInputStream(lectura);
            alumnos = (ArrayList<Alumno>)entrada.readObject();
            entrada.close();
            lectura.close();
        }catch(FileNotFoundException e){
            System.out.println("El archivo no existe");
        }catch(IOException e){
            System.out.println("IO Exception");
        }catch(ClassNotFoundException e){
            System.out.println("La clase a la que pertenece el objeto no existe");
        }
        finally{
            System.out.println("Lectura de alumnos exitoso");
        }
    }

    public void escribirProfesores(){
        FileOutputStream escritura = null;
        ObjectOutputStream salida = null;
        try{
            escritura = new FileOutputStream("Profesores.txt");
            salida = new ObjectOutputStream(escritura);
            salida.writeObject(profesores);
            salida.close();
            escritura.close();
        }catch(FileNotFoundException e){
            System.out.println("El archivo no existe");
        }
        catch(IOException e){
            System.out.println("IO Exception");
        }
        finally {
            System.out.println("Guardado de profesores exitoso");
        }
    }

    public void leerProfesores(){
        try{
            FileInputStream lectura = new FileInputStream("Profesores.txt");
            ObjectInputStream entrada = new ObjectInputStream(lectura);
            profesores = (ArrayList<Profesor>)entrada.readObject();
            entrada.close();
            lectura.close();
        }catch(FileNotFoundException e){
            System.out.println("El archivo no existe");
        }catch(IOException e){
            System.out.println("IO Exception");
        }catch(ClassNotFoundException e){
            System.out.println("La clase a la que pertenece el objeto no existe");
        }
        finally{
            System.out.println("Lectura de profesores exitoso");
        }
    }


}
