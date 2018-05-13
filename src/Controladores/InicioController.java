/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.UsuarioDAO;
import Vista.JFInicio;
import Vista.JFLogin;
import Vista.JFRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class InicioController implements ActionListener {
    JFInicio vista;
    
    public InicioController(JFInicio vista){
        this.vista=vista;
        this.vista.jLogin.addActionListener(this);
        this.vista.jRegistrarse.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()== vista.jLogin){
         JFLogin vistaLogin= new JFLogin ();
         UsuarioDAO modelo= new UsuarioDAO();
         LoginController controlador= new LoginController(vistaLogin,modelo);
         vistaLogin.setVisible(true);
         vista.setVisible(false);
       }
       if(ae.getSource()== vista.jRegistrarse){
          JFRegistro vistaRegistro= new JFRegistro();
          UsuarioDAO modelo= new UsuarioDAO();
         RegistroController controlador= new RegistroController(vistaRegistro,modelo);
          vistaRegistro.setVisible(true);
          vista.setVisible(false);
       }
      
    }

    public JFInicio getVista() {
        return vista;
    }
    
    
}
