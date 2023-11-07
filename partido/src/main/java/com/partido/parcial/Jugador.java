package com.partido.parcial;

import java.util.List;

public class Jugador implements IJugador, IImprimible {

    String name;
    int numero;
    String posicion;
    String value;

public Jugador( String name, int numero){
    this. name= name;
    this.numero=numero;
    posicion= " ";
}


public void add(List<Jugador> equipo) {
 
}

public String getName(){
    return  name;
}

public int getNumero(){
    return numero;
}

public void setPosicion(String value) {
    this.posicion = value;
}

public String getPosicion() {
   return posicion;
}

@Override
    public String impresion(){
        return "[Jugador " + getNumero() + "] " + getName() + " > " + getPosicion();  
    }




    
}
