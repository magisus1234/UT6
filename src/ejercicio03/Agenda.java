/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Alumnos DAW
 */
public class Agenda {
    
    private HashMap<String, Contacto> contactos;
    
    public Agenda(){
        contactos = new HashMap();
    }
    
    public void addContacto(String nombre,int telefono){
        Contacto c = new Contacto (nombre,telefono);
        
        contactos.put(nombre, c);
        
        
    }
    
    public void listarContactos(){
        
        
        Iterator it = contactos.keySet().iterator();
        
        while(it.hasNext()){
            String key = (String)it.next();
            Contacto c = contactos.get(key);
            System.out.println(c);
        }
        
        
        for (String key : contactos.keySet()){
            Contacto c = contactos.get(key);
            System.out.println(c);
        }
    }
}
