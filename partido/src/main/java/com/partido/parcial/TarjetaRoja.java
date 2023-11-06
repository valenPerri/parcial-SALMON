package com.partido.parcial;

public class TarjetaRoja extends TarjetaBase { //herencia

    public TarjetaRoja(IJugador jugador){
        super("ROJA", jugador);  //color de la tarjeta correspondiente
    }

    public TarjetaRoja(String color,IJugador jugador) {
        super("ROJA", jugador);
    }

 @Override
    public String toString(){
        return String.format("Tarjeta %s para %s",
                    getColor(),
                    getJugador().getName());
    }



}