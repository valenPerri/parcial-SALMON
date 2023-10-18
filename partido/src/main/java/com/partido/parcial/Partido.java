package com.partido.parcial;

import java.util.ArrayList;
import java.util.List;

public class Partido {

    Equipo local;
    Equipo visitante;
    String fecha;
    String nombrePartido;
    List<Tarjeta> tarjetas = new ArrayList<>();


 public Partido() {
    }

 public Partido(Equipo local, Equipo visitante, String fecha,String nombrePartido, List<Tarjeta> tarjetas) {
    this.local= local;
    this.visitante= visitante;
    this.fecha= fecha;
    this.nombrePartido=nombrePartido;
    this.tarjetas= tarjetas;

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

public List<Tarjeta> getTarjetas(){
   return tarjetas;
}

public void agregar(Tarjeta tarjeta){
   tarjetas.add(tarjeta);
}

public  int cantidadTarjetas(){
   return tarjetas.size();
}






    
}
