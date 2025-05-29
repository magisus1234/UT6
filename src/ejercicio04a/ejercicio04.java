/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04a;

import java.util.Scanner;

/**
 *
 * @author Alumnos DAW
 */
public class ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner data= new Scanner(System.in);
        Almacen mialmacen=new Almacen();
        
        mialmacen.añadirProducto("iphone11",900,50); //cod 1001
        mialmacen.añadirProducto("galaxy12",800,30); //cod 1002
        mialmacen.añadirProducto("ps3",400,100);     //cod 1003
        mialmacen.añadirProducto("Satisfyer",50,300); //cod 1004
        double precio;
        int codigo;
        int unidades;
        int opcion=0;
        do {
            
            if (opcion!=4 && opcion!=5) {
                System.out.println("            -----Almacen-----");
                System.out.println("==========================================");
               mialmacen.listarAlmacen(); 
            }
            
            
            System.out.println("1. Modificar Precio");
            System.out.println("2. Añadir Unidades");
            System.out.println("3. Vender Producto");
            System.out.println("4. Listar Almacen");
            System.out.println("5. Listar por Orden");
            System.out.println("Elige una opcion");
            opcion=Integer.parseInt(data.nextLine());
            
            switch(opcion){
                case 1:
                    do {
                        System.out.println("Dime el codigo del producto modificar");
                        codigo=Integer.parseInt(data.nextLine());
                        if (codigo>mialmacen.getUltimoCodigo()-1 || codigo<1001) {
                            System.out.println("Codigo invalido");
                        }
                    } while (codigo>mialmacen.getUltimoCodigo()-1 || codigo<1001);
                    do {
                        System.out.println("Dime el precio nuevo");
                        precio=Double.parseDouble(data.nextLine());
                    } while (precio<0);
                    
                    mialmacen.modificarPrecio(codigo, precio);
                    break;
                case 2:
                    do {
                        System.out.println("Dime el codigo del producto a añadir unidades");
                        codigo=Integer.parseInt(data.nextLine()); 
                        if (codigo>mialmacen.getUltimoCodigo()-1 || codigo<1001) {
                            System.out.println("Codigo invalido");
                        }
                    } while (codigo>mialmacen.getUltimoCodigo()-1 || codigo<1001);
                    
                    do {
                        System.out.println("Dime cuantas unidades");
                        unidades=Integer.parseInt(data.nextLine());  
                    } while (unidades<0);
                    mialmacen.añadirUnidades(codigo, unidades);
                    break;
                case 3:
                    do {
                        System.out.println("Dime el codigo del producto a vender");
                        codigo=Integer.parseInt(data.nextLine()); 
                        if (codigo>mialmacen.getUltimoCodigo()-1 || codigo<1001) {
                            System.out.println("Codigo invalido");
                        }
                    } while (codigo>mialmacen.getUltimoCodigo()-1 || codigo<1001);
                    do {
                        System.out.println("Dime cuantas unidades a vender");
                        unidades=Integer.parseInt(data.nextLine());  
                    } while (unidades<0);
                    
                    mialmacen.venderProducto(codigo,unidades);
                    break;
                case 4:
                    System.out.println("==========================================");
                    System.out.println("            -----Almacen-----");
                    System.out.println("==========================================");
                    mialmacen.listarAlmacen();
                    break;
                case 5:
                    System.out.println("==========================================");
                    System.out.println("            -----Almacen-----");
                    System.out.println("==========================================");
                    mialmacen.listarAlmacenPorUnidadesPrecio();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            
            
            if (opcion!=4 && opcion!=5) {
                System.out.println("==========================================");
            }
            
        } while (opcion!=6);
        
//        mialmacen.modificarPrecio(1001, 950);
//       
//        mialmacen.añadirUnidades(1003,100);
//        
//        mialmacen.venderProducto(1002,1);
//        
//        mialmacen.venderProducto(1002,20);
//        
//        mialmacen.venderProducto(1004,300);
//        
//        mialmacen.listarAlmacen();
//        
//        mialmacen.listarAlmacenPorUnidadesPrecio();
//        
//        mialmacen.añadirUnidades(1001,150);
//        
//        mialmacen.listarAlmacenPorUnidadesPrecio();
        
    }
    
}
