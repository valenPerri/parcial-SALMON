package com.partido.parcial;

public class Tarjeta {

    Jugador jugador;
    String colorTarjeta;

    
public Tarjeta( Jugador jugador, String colorTarjeta){
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
