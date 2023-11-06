package com.partido.parcial;

import java.util.List;

public class Jugador implements IJugador, IImprimible {

    String name;
    int numero;
    String posicion;
    //String value;

public Jugador( String name, int numero){
    this. name= name;
    this.numero=numero;
    //posicion= " ";
}


public void add(List<Jugador> equipo) {
 
}

@Override
public String getName(){
    return  name;
}

@Override
public int getNumero(){
    return numero;
}

@Override
public String getPosicion() {
   return posicion;
}

@Override
public void setPosicion(String value) {
   return;
}

@Override
    public String impresion(){
        return "[Jugador " + getNumero() + "] " + getName() + " > " + getPosicion();  
    }




    
}
