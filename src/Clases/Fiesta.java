/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

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
    private ArrayList<Usuario> personas;
    private ArrayList<Usuario> administradores;
    private ArrayList<Cancion> musica;
    private LocalDate fechaEntrada;
    private int numeroDias;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private LocalDate fechaSalida=fechaEntrada.plusDays(numeroDias);

    public Fiesta(String nombre, ArrayList<Alimentacion> alimentos, ArrayList<Usuario> personas, ArrayList<Usuario> administradores, ArrayList<Cancion> musica, LocalDate fechaEntrada, int numeroDias, LocalTime horaEntrada, LocalTime horaSalida) {
        this.nombre = nombre;
        this.alimentos = alimentos;
        this.personas = personas;
        this.administradores = administradores;
        this.musica = musica;
        this.fechaEntrada = fechaEntrada;
        this.numeroDias = numeroDias;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }
    
    

    public Fiesta(String nombre, ArrayList<Alimentacion> alimentos, ArrayList<Usuario> personas, ArrayList<Cancion> musica, LocalDate fechaEntrada, int numeroDias) {
        this.nombre = nombre;
        this.alimentos = alimentos;
        this.personas = personas;
        this.musica = musica;
        this.fechaEntrada = fechaEntrada;
        this.numeroDias = numeroDias;
    }

    public Fiesta(String nombre, ArrayList<Usuario> personas) {
        this.nombre = nombre;
        this.personas = personas;
    }
    
    public Fiesta(String nombre, LocalDate fechaEntrada, int numeroDias){
        this.fechaEntrada=fechaEntrada;
        this.numeroDias=numeroDias;
        idFiesta++;
    }

    public Fiesta(String nombre, int numeroDias, LocalTime horaEntrada) {
        this.nombre = nombre;
        this.numeroDias = numeroDias;
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
        return personas;
    }

    public void setPersonas(ArrayList<Usuario> personas) {
        this.personas=personas;
    }
    public void añadirPersona(Usuario persona) {
        this.personas.add(persona);
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

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
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
