package com.partido.parcial;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Partido {

    Arbitro arbitro , arbitro2;
    Arbitro arbitrolinea1 , arbitrolinea2;
    Arbitro Asistente;
    Equipo local;
    Equipo visitante;
    Date fecha;
    String name;
    List<TarjetaBase> equipos = new ArrayList<>();   //lista de las distintas tarjetas que contiene onjetos de Tarjeta base
    Estadio estadio;


 public Partido() {
    }

 public Partido(Equipo local, Equipo visitante,String name) { //constructor local, visitante, nombre
    this.local= local;
    this.visitante= visitante;
    this.name=name;
    this.equipos= new ArrayList<>();

    }

public Partido( Estadio estadio, Equipo local,Equipo visitante,String name){ //constructor (agregado en clase) estadio, local, visitante, nombre
   this.local= local;
   this.visitante= visitante;
   this.name=name;
   this.estadio= estadio;

}

//getters y setters 
public Equipo getLocal(){
   return local;
}

public Equipo getVisitante(){
   return visitante;
}

public String getName(){
   return name;
}

public Estadio getEstadio(){
   return estadio;
}

public int tarjetasCantidad(){
   return equipos.size();
}
    
public void agregar(TarjetaBase tarjeta) {
   equipos.add(tarjeta);
}

public List<TarjetaBase> getTarjetas(){
   return equipos;
}

//metodos agregados en el parcial


public Date getFecha() {
   return fecha;
}


public void setFecha(Date fecha) {
   this.fecha = fecha;
}


public String getFechaFormateada() {
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
return sdf.format(fecha);
}

}
