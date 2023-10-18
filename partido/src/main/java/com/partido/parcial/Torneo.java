package com.partido.parcial;

import java.util.ArrayList;
import java.util.List;

public class Torneo {

String nombreTorneo;
String ganador;
List<Equipo> equiposTorneo= new ArrayList<>();
List<Partido> partidos = new ArrayList<>();



public Torneo(String nombreTorneo,List<Equipo> equipos) {
    this.nombreTorneo= nombreTorneo;
    this.equiposTorneo.addAll(0, equipos);

}

public Torneo(String nombreTorneo) {
    this.nombreTorneo= nombreTorneo;
   
}


public void agregar() {
}

public int equiposCantidad() {
    return equiposTorneo.size();

}
public int partidosCantidad() {
    return partidos.size();
}

public List<Partido> getPartidos(){
    return partidos;
}

public List<Equipo> getEquiposTorneo(){
    return equiposTorneo;
}


    
}
