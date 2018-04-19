/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;



/**
 *
 * @author Usuario
 */
public class Bebida extends Alimentacion{
    protected int cantidad;
    private double precioUnidad;
    

    public Bebida(String nombre, int cantidad, double precioUnidad) {
        super(nombre);
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }
    
    public Bebida (String nombre){
        super(nombre);
    }

    public Bebida(String nombre, int cantidad) {
        super(nombre);
        this.cantidad = cantidad;
       
    }
    public Bebida(String nombre, double precioUnidad) {
        super(nombre);
        this.precioUnidad = precioUnidad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


   
    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecio(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

 
    
    
}
