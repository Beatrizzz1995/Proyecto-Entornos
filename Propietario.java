/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author Beatriz
 */
public class Propietario {
   
    
protected String id;
private String nombre;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    //Nombre que sólo admita letras y que tenga de 3 a 9 caractéres
    public static boolean validarNombre(String texto){
    return texto.matches("^[A-Za-z]{3,9}$");}
    //número del cero al nuve y de cantidad 4
    public static boolean validarID(String texto){
    return texto.matches("^[0-9]{4}$");}
 
    @Override
    public String toString() {
        return "El cliente se llama " + nombre + " y su número de identificación es "+ getId()+".";
    }

}
