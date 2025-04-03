/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author Alumnos DAW
 */
public class Contacto {
    private String nombre;
    private int ID;
    private int telefono;
    private static int contadorID = 0;
    
    public Contacto(String nombre,int telefono){
        this.contadorID++;
        this.nombre=nombre;
        this.telefono=telefono;
        this.ID=this.contadorID;
        
    }
    
    @Override
    public String toString(){
        return String.format("%s --> %d",this.nombre,this.telefono);
    }
}
