/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author Alumnos DAW
 */
public class Persona implements Comparable<Persona>{
    private String DNI;
    private String nombre;
    private int edad;
    
    public Persona(String DNI,String nombre,int edad){
        this.DNI=DNI;
        this.edad=edad;
        this.nombre=nombre;
    }
    
    @Override
    public String toString(){
        return String.format("%s - %s - %d",this.DNI,this.nombre,this.edad);
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona p) {
        if(this.DNI.compareTo(p.getDNI())<0){
            return -1;
        }else if(this.DNI.compareTo(p.getDNI())>0){
            return 1;
        }else{
            return 0;
        }
    }
    
}
