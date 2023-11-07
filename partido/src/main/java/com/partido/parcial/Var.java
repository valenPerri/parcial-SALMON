package com.partido.parcial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Var {

AVAR nose1,nose2,nose3;
AsistenteDeVideo Asistente;
Partido partido;
TarjetaAmarilla tarjetaAmarilla;
TarjetaRoja tarjetaRoja;   

public Var(Partido partido){
this.partido = partido;
}   

public int cantidadTarjetasRojas() {
    // lista de tarjetas del partido 
    List<TarjetaBase> tarjetas = partido.getTarjetas();

    long cantidadTarjetasRojas = tarjetas.stream()  //la convertimos en stream
                                       .filter(tarjeta -> tarjeta instanceof TarjetaRoja)//método filter para obtener un stream de tarjetas rojas y contarlas
                                       .count();

    return (int) cantidadTarjetasRojas; //numero de tarjetas encontradas(entero)
}

public int cantidadTarjetasAmarillas() {
    // Obtener la lista de tarjetas del partido 
    List<TarjetaBase> tarjetas = partido.getTarjetas();
    
    long cantidadTarjetasAmarillas = tarjetas.stream()//la convertimos en stream
                                              .filter(tarjeta -> tarjeta instanceof TarjetaAmarilla)//método filter para obtener un stream de tarjetas rojas y contarlas
                                              .count();
    
    return (int) cantidadTarjetasAmarillas;//numero de tarjetas encontradas (entero)
}


  public int cantidadTarjetas(Equipo equipo){
        List<TarjetaBase> listaTarjetas = new ArrayList<>();
        Predicate<TarjetaBase> buscarTarjeta = tarjeta -> equipo.getEquipo().contains(tarjeta.getJugador());
        listaTarjetas.addAll(partido.getTarjetas().stream().filter(buscarTarjeta).collect(Collectors.toList()));
        return listaTarjetas.size();
    }

}