/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Alumnos DAW
 */
public class ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner data = new Scanner(System.in);
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        int opcion=0;
        do {
            System.out.println("=================================");
            for (Persona pe : listaPersonas) {
                System.out.println(pe);
            }
            System.out.println("=================================");
            System.out.println("       MENU");
            System.out.println("1.  Añadir persona");
            System.out.println("2.  Eliminar persona");
            System.out.println("3.  Salir");
            System.out.println("Elige una opcion");
            opcion=Integer.parseInt(data.nextLine());
            switch(opcion){
                case 1:
                    boolean existenombre=true;
                    boolean existeDNI=true;
                    System.out.println("Dime el nombre");
                    String nombre=data.nextLine();
                    do {
                        existenombre=true;
                        for (Persona pe : listaPersonas) {
                            if(nombre.equals(pe.getNombre())){
                                System.out.println("El nombre ya esta en uso pon otro");
                                nombre=data.nextLine();
                                existenombre=false;
                                break;
                            }
                        }
                        
                    } while (!existenombre);
                    System.out.println("Dime el DNI");
                    String DNI=data.nextLine();
                    do {
                        existeDNI=true;
                        for (Persona pe : listaPersonas) {
                            if(DNI.equals(pe.getDNI())){
                                System.out.println("El DNI ya existe pon otro");
                                DNI=data.nextLine();
                                existeDNI=false;
                                break;
                            }
                        }
                        
                    } while (!existeDNI);
                    System.out.println("Dime la edad");
                    int edad=Integer.parseInt(data.nextLine());
                    Persona p =new Persona(DNI,nombre,edad);
                    listaPersonas.add(p);
                    break;
                case 2:
                    System.out.println("Dime el DNI de la persona que quieras eliminar");
                    DNI=data.nextLine();
                    boolean existe=false;
                    for (Persona Pe : listaPersonas) {
                        if (DNI.equals(Pe.getDNI())) {
                            existe=true;
                            listaPersonas.remove(Pe);
                            break;
                        }
                    }
                    if (existe==true) {
                        System.out.println("Eliminado");
                    }else{
                        System.out.println("No existe esa persona");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida");
                    break;
            }
            Collections.sort(listaPersonas);
        } while (opcion!=3);
    }
    
}
