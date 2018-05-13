/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.UsuarioDAO;
import Vista.JFLogin;
import Vista.JFPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class LoginController implements ActionListener {

    JFLogin vista;
    UsuarioDAO modelo;

    public LoginController(JFLogin vista, UsuarioDAO modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.jBEnviarLogin.addActionListener(this);
        this.vista.jBVolverLogin.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == vista.jBEnviarLogin) {
            if (vista.JTAUsuarioLogin.getText().equals("") || this.vista.jPasswordLogin.getText().equals("")) {
                this.vista.jLMensajeLogin.setText("Los campos nombre y contraseña son requeridos");
            } else {
                String logIn=modelo.logIn(vista.JTAUsuarioLogin.getText(),vista.jPasswordLogin.getText());
                if (logIn.equals("Exito")) {
                    JFPrincipal vista = new JFPrincipal();
                    this.vista.setVisible(false);
                    vista.setVisible(true);
                } else{
                    this.vista.jLMensajeLogin.setText(logIn);
                }

            }
        }
    }
}
