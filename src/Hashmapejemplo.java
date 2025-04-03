
import java.util.HashMap;
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumnos DAW
 */
public class Hashmapejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        HashMap <Integer, String> mapa=new HashMap();
        
        HashMap <String, String> mapaCapitales=new HashMap();
        
        mapa.put(1, "Casillas");
        mapa.put(6, "Iniesta");
        mapa.put(5, "Puyol");
        mapa.put(7, "Villa");
        mapa.put(3, "Pique");
        
        mapaCapitales.put("España","Madrid");
        mapaCapitales.put("Ecuador","Quito");
        mapaCapitales.put("Marruecos","Rabat");
        mapaCapitales.put("Australia","Camberra");
        
        
        HashMap <String, Integer> UsuPin=new HashMap();
        
        
        UsuPin.put("Pedro",3232);
        UsuPin.put("Cuello",4321);
        UsuPin.put("Paco",1234);
        UsuPin.put("Naaman",1233);
        
        
        
        Iterator it = UsuPin.keySet().iterator();
        
        System.out.println("\n Imprimo con iterador");
        while (it.hasNext()){
            String key = (String)it.next();
            System.out.println(key+" ----> "+UsuPin.get(key));
        }
    }
    
}
