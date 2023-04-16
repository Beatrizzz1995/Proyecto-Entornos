/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyecto;

import java.util.Scanner;

/**
 *
 * @author Beatriz
 */
public class TestMain {
static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        
        String nombre;
        String id;
        System.out.println("Escribe el nombre del cliente");
        nombre=sc.nextLine();

        System.out.println("Escribe la identificación del cliente");
        id=sc.nextLine();
        Propietario cliente = new Propietario();
        cliente.setNombre(nombre);
        cliente.setId(id);
       
  
        if(Propietario.validarID(id)&& Propietario.validarNombre(nombre)){System.out.println(cliente.toString());}
        else {System.out.println("Identificación del cliente no válida");}
        
    }
    

    
    
}
