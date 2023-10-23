package com.partido.parcial;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

   private String nombreEquipo;
   private String abreviaturaEquipo;
   private List<Jugador> equipo = new ArrayList<>();  //lista del equipo que contiene Jugador


public Equipo(String nombreEquipo, String abreviaturaEquipo){  //constructor nombre del equipo y abreviatura
    this.nombreEquipo = nombreEquipo;
    this.abreviaturaEquipo = abreviaturaEquipo;

} 
//getters y setters 

public String getNombreEquipo(){
    return nombreEquipo;
}

public void setNombreEquipo(String nombreEquipo){
      this.nombreEquipo = nombreEquipo;
}

public String getAbreviaturaEquipo() {
    return abreviaturaEquipo;
}

public void setAbreviaturaEquipo(String abreviaturaEquipo) {
    this.abreviaturaEquipo = abreviaturaEquipo;
}
public List<Jugador> getEquipo(){
    return equipo;
}

public void setEquipo(List<Jugador> equipo){
    this.equipo = equipo;
}

public Jugador obtenerJugador(int numero){  //jugador con su numero correspondiente
    for(Jugador nombreJugador: equipo){
        if(nombreJugador.getNumero()==numero){
            return nombreJugador;
        }
    }
    return null;
}

public void agregar(Jugador jugador) { //FIJARSE
}



//agregar imprimir plantel 

}
