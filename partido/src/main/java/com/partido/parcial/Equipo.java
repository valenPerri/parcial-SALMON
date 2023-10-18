package com.partido.parcial;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    String nombreEquipo = " ";
    String abreviaturaEquipo = " ";
    List<Jugador> equipo = new ArrayList<>();


public Equipo(String nombreEquipo, String abreviaturaEquipo){
    this.nombreEquipo = nombreEquipo;
    this.abreviaturaEquipo = abreviaturaEquipo;

} 

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

}
