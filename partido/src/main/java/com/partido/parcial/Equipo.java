package com.partido.parcial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipo implements IImprimible {

   String name= " ";
   String abreviaturaEquipo = " ";
   List<IJugador> equipo = new ArrayList<>(); //lista del equipo que contiene Jugador
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

public IJugador obtenerJugador(int numero) {
    for (int i = 0; i < equipo.size(); i++) {
        IJugador jugador = equipo.get(i);
        if (numero == jugador.getNumero()) {
            return jugador;
        }
    }
    // Si no se encuentra ningún jugador con el número proporcionado, puedes devolver null o lanzar una excepción según tus necesidades.
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


public String imprimirPlantel(){ 
        Collections.sort(equipo, (jugador1, jugador2) -> jugador1.getNumero() - jugador2.getNumero()); // Ordenamos la lista por el número del jugador

        // cadena de los jugadores ordenados
        StringBuilder plantel = new StringBuilder();
        for (IJugador jugador : equipo) {
            plantel.append("[").append(jugador.getNumero()).append("] ")
                  .append(jugador.getName()).append(" (").append(jugador.getPosicion()).append("), ");
        }

        // Devolver la cadena 
        return plantel.toString().substring(0, plantel.length() - 2);
    } 
    

@Override
public String impresion() {
    return "[Equipo] " + getName() + " > " + getAbreviaturaEquipo(); //plantel impreso

}

public Object cantidadMediocampoConNumerosMayorQue7() {
    return null;
}


}