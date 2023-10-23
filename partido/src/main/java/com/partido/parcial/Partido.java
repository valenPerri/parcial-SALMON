package com.partido.parcial;

import java.util.ArrayList;
import java.util.List;

public class Partido {

    Equipo local;
    Equipo visitante;
    private String fecha;
    private String nombrePartido;
    List<TarjetaBase> tarjetas = new ArrayList<>();   //lista de las distintas tarjetas que contiene onjetos de Tarjeta base
    Estadio estadio;


 public Partido() {
    }

 public Partido(Equipo local, Equipo visitante,String nombrePartido) { //constructor local, visitante, nombre
    this.local= local;
    this.visitante= visitante;
    this.nombrePartido=nombrePartido;
    this.tarjetas= new ArrayList<>();

    }

public Partido( Estadio estadio, Equipo local,Equipo visitante,String nombrePartido){ //constructor (agregado en clase) estadio, local, visitante, nombre
   this.local= local;
   this.visitante= visitante;
   this.nombrePartido=nombrePartido;
   this.estadio= estadio;

}

//getters y setters 
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

public void agregar(TarjetaRoja tarjetaRoja){  //FIJARSE

}

public void agregar(TarjetaAmarilla tarjetaAmarilla){ //FIJARSE

}



}
