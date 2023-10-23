package com.partido.parcial;

import java.util.ArrayList;
import java.util.List;

public class Torneo {

String nombreTorneo;
String ganador;
List<Equipo> equiposTorneo= new ArrayList<>(); // lista de equipos del torneo que contiene objetos de Equipo
List<Partido> partidos = new ArrayList<>(); //lista de partidos que contiene Partido



public Torneo(String nombreTorneo) {
    this.nombreTorneo= nombreTorneo;
    this.equiposTorneo= new ArrayList<>();
    this.partidos = new ArrayList<>();
}

public String getNombreTorneo(){
    return nombreTorneo;
}

public List<Partido> getPartidos(){
    return partidos;
}

public List<Equipo> getEquiposTorneo(){
    return equiposTorneo;
}

public void agregar(Equipo equipo) {
    equiposTorneo.add(equipo);
}

public void agregar(Partido partido) {
    partidos.add(partido);
}

public int equiposCantidad() {
    return equiposTorneo.size();

}
public int partidosCantidad() {
    return partidos.size();
}



    
}
