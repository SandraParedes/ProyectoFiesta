/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Comida extends Alimentacion implements conIngredientes {
    private ArrayList<Ingredientes> ingredientes;
    private double precioTotal;
    
 

    public Comida(String nombre){
        super(nombre);
    }
   @Override 
    public ArrayList<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    @Override 
    public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    @Override 
    public void añadirIngrediente(Ingredientes ingrediente) {
        this.ingredientes.add(ingrediente);
    }
    
   
    
     public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
     
    
    
     @Override 
     public double getPrecio(){
        for (Ingredientes ingrediente : ingredientes) {
            this.precioTotal = this.precioTotal + ingrediente.getPrecio();
        }
        return this.precioTotal;
        
    }
     
     public boolean tieneComprador(){
         boolean comprador=false;
         for (Ingredientes ingrediente : this.ingredientes) {
            if(ingrediente.getComprador()!=null){
                comprador=true;
            }
         }
         return comprador;
     }
     

   

    
   

    
    
    
    
}
