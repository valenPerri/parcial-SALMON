package com.partido.parcial;

import java.util.ArrayList;
import java.util.List;

public class Equipo implements IImprimible {

   private String name;
   private String abreviaturaEquipo;
   private List<IJugador> equipo = new ArrayList<>(); //lista del equipo que contiene Jugador
   List<String> posiciones = new ArrayList<>();
   List<TarjetaBase> tarjetas = new ArrayList<>();



public Equipo(String name, String abreviaturaEquipo){  //constructor nombre del equipo y abreviatura
    this.name = name;
    this.abreviaturaEquipo = abreviaturaEquipo;

} 
//getters y setters 

public String getName(){
    return name;
}

public void setName(String name){
      this.name = name;
}

public String getAbreviaturaEquipo() {
    return abreviaturaEquipo;
}

public void setAbreviaturaEquipo(String abreviaturaEquipo) {
    this.abreviaturaEquipo = abreviaturaEquipo;
}

public List<IJugador> getEquipo(){
    return equipo;
}

public void setEquipo(List<IJugador> equipo){
    this.equipo = equipo;
}

public List<TarjetaBase> getTarjetas() {
    return tarjetas;
}

public void setTarjetas(List<TarjetaBase> tarjetas) {
    this.tarjetas = tarjetas;
}

public IJugador obtenerJugador(int numero){  //jugador con su numero correspondiente
    for(IJugador name: equipo){
        if(name.getNumero()==numero){
            return name;
        }
    }
    return null;
}

public void setPosicion(String Posicion){
    List<String> posiciones = new ArrayList<>();
    posiciones.add("Portero");
}

public void agregar(IJugador jugador){ //agregamos jugadores al equipo
    equipo.add(jugador);
}

public int jugadoresCantidad(){ //cantidad de jugadores por equipo
    return equipo.size();
}


public void imprimirPlantel(){  //fijarse como imprimir el plantel
    






}

@Override
public String impresion() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'impresion'");
}


}