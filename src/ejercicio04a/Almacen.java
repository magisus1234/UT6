/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Alumnos DAW
 */
public class Almacen {
    public int ultimoCodigo;
    private HashMap<Integer,Producto> mapaProductos;
    
    public Almacen(){
        mapaProductos=new HashMap();
        ultimoCodigo=1001;
    }
    
    public void añadirProducto(String descripcion,double precio,int unidades){
        
        Producto p= new Producto(this.ultimoCodigo,descripcion,precio,unidades);
        mapaProductos.put(ultimoCodigo, p);
        ultimoCodigo++;
    }
    
    public void modificarPrecio(int codigo,double precio){
        Producto p=mapaProductos.get(codigo);
        p.setPrecio(precio);
        mapaProductos.put(codigo, p);
        
    }
    
    public void añadirUnidades(int codigo,int unidades){
        Producto p=mapaProductos.get(codigo);
        p.setUnidades(p.getUnidades()+unidades);
        mapaProductos.put(codigo, p);
        System.out.println("Unidades añadidas");
    }
    
    private Producto obtenerProducto(int codigo){
        Producto p=mapaProductos.get(codigo);
        return p;
    }
    
    public void venderProducto(int codigo,int unidades){
        boolean a=true;
        Producto p=mapaProductos.get(codigo);
        if (unidades<=p.getUnidades()) {
            p.setUnidades(p.getUnidades()-unidades);
            mapaProductos.put(codigo, p);
            if (unidades==1) {
                System.out.println("\033[32mVendida "+unidades+" unidad!\033[30m");
            }else{
                System.out.println("\033[32mVendidas "+unidades+" unidades!!\033[30m"); 
            }
            
        }else{
            System.out.println("\033[31mERROR. No hay suficientes unidades\033[30m");
            a=false;
        }
        if (p.getUnidades()<=10 && a) {
            System.out.println("\033[31mQuedan pocas unidades!!!!\033[30m");
        }
    }
    
    public void listarAlmacen(){
        
        System.out.println("LISTA DEL ALMACEN");
        System.out.println("==========================================");
        Integer codigo;
        Producto p;
        
        Iterator<Integer> it=mapaProductos.keySet().iterator();
        while(it.hasNext()){
            Integer keyCodigo = it.next();
            p = mapaProductos.get(keyCodigo);
            System.out.println(p);
            

        }

        System.out.println("==========================================");
    }
    
    public void listarAlmacenPorUnidadesPrecio(){
        System.out.println("LISTA DEL ALMACEN");
        System.out.println("==========================================");
        Integer codigo;
        Producto p;
        ArrayList<Producto> lista = new ArrayList();
        Iterator<Integer> it=mapaProductos.keySet().iterator();
        while(it.hasNext()){
            Integer keyCodigo = it.next();
            p = mapaProductos.get(keyCodigo);
            lista.add(p);
            
            

        }
        Collections.sort (lista);
        for (Producto pe : lista) {
            System.out.println(pe);
        }
        System.out.println("==========================================");
    }

    public int getUltimoCodigo() {
        return ultimoCodigo;
    }
    
}
