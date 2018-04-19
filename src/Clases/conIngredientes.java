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
public interface conIngredientes {
     public ArrayList<Ingredientes> getIngredientes();
     public void setIngredientes(ArrayList<Ingredientes> ingredientes);
     public void añadirIngrediente(Ingredientes ingrediente);
     public double getPrecio();
     public boolean tieneComprador();
}
