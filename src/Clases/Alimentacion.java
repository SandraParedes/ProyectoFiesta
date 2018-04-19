/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public  class Alimentacion {
    protected ArrayList<Usuario> personas;
    protected int numPersonas=personas.size();
    protected String nombre;
    protected Usuario comprador;
    protected String Fiesta;
    protected LocalDate diaConsumo;
   
    
    public Alimentacion(String nombre){
        this.nombre=nombre;
    }
    
     public ArrayList<Usuario>  getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Usuario>  personas) {
        this.personas = personas;
    }
    
    public void añadirPersona(Usuario  persona) {
        this.personas.add(persona);
    }
    
    public int getNumPersonas() {
        return numPersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario getComprador() {
        return comprador;
    }

    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }

    public String getFiesta() {
        return Fiesta;
    }

    public void setFiesta(String Fiesta) {
        this.Fiesta = Fiesta;
    }

  
    
    
   
}
