package com.partido.parcial;

import java.util.ArrayList;
import java.util.List;

public class Partido {

    Equipo local;
    Equipo visitante;
    String fecha;
    String nombrePartido;
    List<TarjetaBase> tarjetas = new ArrayList<>();

    Estadio estadio;


 public Partido() {
    }

 public Partido(Equipo local, Equipo visitante,String nombrePartido) {
    this.local= local;
    this.visitante= visitante;
    this.nombrePartido=nombrePartido;
    this.tarjetas= new ArrayList<>();

    }

public Partido( Estadio estadio, Equipo local,Equipo visitante,String nombrePartido){
   this.local= local;
   this.visitante= visitante;
   this.nombrePartido=nombrePartido;

   this.estadio= estadio;

}

public Equipo getLocal(){
   return local;
}

public Equipo getVisitante(){
   return visitante;
}

public String getFecha(){
   return fecha;
}

public String getNombrePartido(){
   return nombrePartido;
}

public List<TarjetaBase> getTarjetas(){
   return tarjetas;
}

public Estadio getEstadio(){
   return estadio;
}

public  int cantidadTarjetas(){
   return tarjetas.size();
}

public Object tarjetasCantidad() {
    return null;
}

}
