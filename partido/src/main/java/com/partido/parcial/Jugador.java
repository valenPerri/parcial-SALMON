package com.partido.parcial;

public class Jugador implements IJugador {

    String nombreJugador;
    int numero;

public Jugador( String nombreJugador, int numero){
    this.nombreJugador=nombreJugador;
    this.numero=numero;
}

@Override
public String getNombreJugador(){
    return nombreJugador;
}

@Override
public int getNumero(){
    return numero;
}



    
}
