/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04a;

/**
 *
 * @author Alumnos DAW
 */
public class Producto implements Comparable<Producto> {
    private int codigo;
    private String descripcion;
    private double precio;
    private int unidades;
    
    public Producto(int codigo,String descripcion,double precio,int unidades){
        this.descripcion=descripcion;
        this.precio=precio;
        this.unidades=unidades;
        this.codigo=codigo;
    }
    @Override
    public String toString(){
        return String.format("[%4d] %-10s %8.2f€  %3d unidades",codigo,descripcion,precio,unidades);
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    @Override
    public int compareTo(Producto p) {
        if(this.unidades-(p.getUnidades())<0){
            return -1;
        }else if(this.unidades-(p.getUnidades())>0){
            return 1;
        }else{
            if(this.precio-(p.getPrecio())<0){
                return -1;
            }else if(this.precio-(p.getPrecio())>0){
                return 1;
            }else{
            return 0;
            }
        }
    }
    
}
