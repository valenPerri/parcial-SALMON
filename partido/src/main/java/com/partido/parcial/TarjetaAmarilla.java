package com.partido.parcial;


public class TarjetaAmarilla extends TarjetaBase  { 

    public TarjetaAmarilla(IJugador jugador){ //color de la tarjeta correspondiente
        super("AMARILLA", jugador);
    }
    public TarjetaAmarilla(String color,IJugador jugador) {
        super("AMARILLA", jugador);
    }

@Override
    public String toString(){
        return String.format("Tarjeta %s para %s",
                    getColor(),
                    getJugador().getName());


    }
}
    
