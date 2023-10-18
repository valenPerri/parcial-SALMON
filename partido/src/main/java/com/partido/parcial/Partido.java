package com.partido.parcial;

import java.util.ArrayList;
import java.util.List;

public class Partido {

    Equipo local;
    Equipo visitante;
    String fecha;
    List<Tarjeta> equipos = new ArrayList<>();


 public Partido() {
    }

 public Partido(Equipo local, Equipo visitante, String fecha, List<Tarjeta> equipos) {
    this.local= local;
    this.visitante= visitante;
    this.fecha= fecha;
    this.equipos= equipos;

    }

 public Partido(Equipo local, Equipo visitante, String fecha) {
    this.local= local;
    this.visitante= visitante;
    this.fecha= fecha;
    
    }
 public String PalabraClave(Partido partido){
    

}


    public String getNombre() {
  
    }
    
}
