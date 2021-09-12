package com.mycompany.db;

public class Jugador {
    //Atributos de la clase
    String nombreJugador;

    public Jugador(String nombre) {
        this.nombreJugador = nombre;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombre) {
        this.nombreJugador = nombre;
    }
    
    //Metodo de la clase
    public void desplegarInformacion(){
        System.out.println("Nombre: " + this.nombreJugador);
    }
}