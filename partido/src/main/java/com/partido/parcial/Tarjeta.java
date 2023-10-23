package com.partido.parcial;

public class Tarjeta {

    Jugador jugador;
    private String colorTarjeta;

    
public Tarjeta( Jugador jugador, String colorTarjeta){  //constructor jugador y el color de tarjeta
    this.jugador= jugador;
    this.colorTarjeta= colorTarjeta;
}

public Jugador getJugador(){
    return jugador;
}

public String getColorTarjeta(){
    return colorTarjeta;
}
    
}
