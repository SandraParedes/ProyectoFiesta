/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class UsuarioDAO {

    Conexion conexion;

    public UsuarioDAO() {
        conexion = new Conexion();
    }

    public boolean registrarUsuario(String nombre, String contraseña, String email) {
        Connection accesoBD = conexion.getConexion();
        boolean registrado = false;
        try {
            if (!buscarUsuario(nombre)) {
                PreparedStatement s = accesoBD.prepareStatement("Insert into Usuario values (?,?,?)");   
                s.setString(1, nombre);
                s.setString(2, contraseña);
                s.setString(3, email);
                s.executeUpdate();
                registrado = true;
            }

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            return registrado;
        }
    }

    private boolean buscarUsuario(String nombre) {
        Connection accesoBD = conexion.getConexion();
        boolean encontrado=false;
        try {
            PreparedStatement s = accesoBD.prepareStatement("SELECT * FROM USUARIO WHERE NOMBRE=?");
            s.setString(1, nombre);
            ResultSet r= s.executeQuery();
            if(r != null){
                encontrado=true;
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }finally{
            return encontrado;
        }
    }
    
    public String logIn(String nombre, String contrasena){
     Connection accesoBD = conexion.getConexion();
     String logIn="";
     if(buscarUsuario(nombre)){
          try {
            PreparedStatement s = accesoBD.prepareStatement("SELECT CONTRASENA FROM USUARIO WHERE NOMBRE=?");
            s.setString(1, nombre);
            ResultSet r= s.executeQuery();
            if(r.equals(contrasena)){
                logIn="Exito";
            }else{
                logIn="Contraseña incorrecta"; 
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }finally{
            return logIn;
        }
     }else{
         logIn="Usuario no existente";
     } 
     return logIn;
    }

}
