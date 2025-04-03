
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumnos DAW
 */
public class ArrayListCadenaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<>();
        
        lista.add("Juan");
        lista.add("Celia");
        lista.add("Pedro");
        lista.add("Juan");
        lista.add("Maria");
        
        
        
        System.out.println("El elemento en la posicion 2:"+lista.get(2));
        
        System.out.println("El tamaño de la lista es:"+lista.size());
        
        System.out.println("");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        
        System.out.println("");
        for (String string : lista) {
            System.out.println(string);
        }
        
        System.out.println("");
        Iterator it=lista.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        lista.set(4,"Jero");
        imprimir(lista);
        
        Collections.sort(lista);
        imprimir(lista);
        
        lista.remove(4);
        imprimir(lista);
    }
    
    public static void imprimir(ArrayList lista){
        System.out.println("");
        for (Object object : lista) {
            System.out.println(object);
        }
    }
    
}
