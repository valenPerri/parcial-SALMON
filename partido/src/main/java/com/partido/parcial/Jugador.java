package com.partido.parcial;

import java.util.List;

public class Jugador {

    String nombreJugador;
    int numero;

public Jugador( String nombreJugador, int numero){
    this.nombreJugador=nombreJugador;
    this.numero=numero;
}

public String getNombreJugador(){
    return nombreJugador;
}

public void setNombreJugador(String nombreJugador){
      this.nombreJugador = nombreJugador;
}

public int getNumero(){
    return numero;
}

public void setNumero(int numero){
    this.numero=numero;
}

public void add(List<Jugador> equipo){
    
}




    
}
