/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


/**
 *
 * @author Usuario
 */
public class Fiesta {
    private static int idFiesta;
    private String nombre;
    private ArrayList<Alimentacion> alimentos;
    private ArrayList<Usuario> invitados;
    private ArrayList<Usuario> administradores;
    private ArrayList<Cancion> musica;
    private LocalDate fechaEntrada;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private LocalDate fechaSalida;

    public Fiesta(String nombre, ArrayList<Alimentacion> alimentos, ArrayList<Usuario> personas, ArrayList<Usuario> administradores, ArrayList<Cancion> musica, LocalDate fechaEntrada, int numeroDias, LocalTime horaEntrada, LocalTime horaSalida) {
        this.nombre = nombre;
        this.alimentos = alimentos;
        this.invitados = personas;
        this.administradores = administradores;
        this.musica = musica;
        this.fechaEntrada = fechaEntrada;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public Fiesta(String nombre, ArrayList<Alimentacion> alimentos, ArrayList<Usuario> personas, ArrayList<Usuario> administradores, ArrayList<Cancion> musica, LocalDate fechaEntrada, LocalTime horaEntrada, LocalTime horaSalida, LocalDate fechaSalida) {
        this.nombre = nombre;
        this.alimentos = alimentos;
        this.invitados = personas;
        this.administradores = administradores;
        this.musica = musica;
        this.fechaEntrada = fechaEntrada;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.fechaSalida = fechaSalida;
    }
    
    

    public Fiesta(String nombre, ArrayList<Alimentacion> alimentos, ArrayList<Usuario> personas, ArrayList<Cancion> musica, LocalDate fechaEntrada,LocalDate fechaSalida) {
        this.nombre = nombre;
        this.alimentos = alimentos;
        this.invitados = personas;
        this.musica = musica;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida=fechaSalida;
    }

    public Fiesta(String nombre, ArrayList<Usuario> personas) {
        this.nombre = nombre;
        this.invitados = personas;
    }
    
    public Fiesta(String nombre, LocalDate fechaEntrada){
        this.fechaEntrada=fechaEntrada;
        idFiesta++;
    }

    public Fiesta(String nombre, LocalTime horaEntrada) {
        this.nombre = nombre;
        this.horaEntrada = horaEntrada;
    }

    public Fiesta(String nombre) {
        this.nombre = nombre;
    }

    
    public void añadirAlimento(Alimentacion alimento) {
        this.alimentos.add(alimento); 
        alimento.setFiesta(this.nombre);
    }

    public ArrayList<Usuario> getpersonas() {
        return invitados;
    }

    public void setInvitados(ArrayList<Usuario> invitados) {
        this.invitados=invitados;
    }
    public void añadirPersona(Usuario persona) {
        this.invitados.add(persona);
    }
    
    public ArrayList<Alimentacion> getAlimentos(){
        return this.alimentos;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getMusica() {
        return musica;
    }

    public void setMusica(ArrayList<Cancion> musica) {
        this.musica = musica;
    }

    public void añadirCancion(Cancion cancion){
        this.musica.add(cancion);
    }

    public ArrayList<Usuario> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<Usuario> administradores) {
        this.administradores = administradores;
    }

    public static int getIdFiesta() {
        return idFiesta;
    }

    public static void setIdFiesta(int idFiesta) {
        Fiesta.idFiesta = idFiesta;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    
    
    
    
   
    
}
