/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.UsuarioDAO;
import Vista.JFLogin;
import Vista.JFPrincipal;
import Vista.JFRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class RegistroController implements ActionListener {

    JFRegistro vista;
    UsuarioDAO modelo;

    public RegistroController(JFRegistro vista, UsuarioDAO modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.jEnviar.addActionListener(this);
        this.vista.jBVolverRegistro.addActionListener(this);
    }

    

    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource() == vista.jEnviar) {
            if (vista.jTANombre.getText().equals("") || this.vista.jTContrasenya.getText().equals("")) {
                this.vista.jLMensaje.setText("Los campos nombre y contraseña son necesarios");
            } else {
                if (modelo.registrarUsuario(vista.jTANombre.getText(), vista.jTContrasenya.getText(), vista.jTAEmail.getText())) {
                    JFPrincipal vista = new JFPrincipal();
                    this.vista.setVisible(false);
                    vista.setVisible(true);
                } else {
                    this.vista.jLMensaje.setText("Usuario Existente");
                }

            }

        }
        

    }

}
