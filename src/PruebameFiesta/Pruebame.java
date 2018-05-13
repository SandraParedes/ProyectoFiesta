/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebameFiesta;

import Controladores.InicioController;
import Vista.JFInicio;

/**
 *
 * @author Usuario
 */
public class Pruebame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFInicio vista= new JFInicio();
        InicioController controlador= new InicioController(vista);
        vista.setVisible(true);
    }
    
}
