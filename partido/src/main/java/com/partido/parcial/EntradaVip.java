package com.partido.parcial;

public class EntradaVip extends Entrada {

    public EntradaVip(Partido partido,int valor){
        super(partido, "Entrada VIP", valor);
}
public boolean esVip(){
    if(tipo == "Entrada VIP"){
        return true;
    }
    return false;
}

@Override
public String toString() {
    return "[" + "Entrada VIP" + "] Partido " + partido.local.getAbreviaturaEquipo() + " vs. " + partido.visitante.getAbreviaturaEquipo() + " el " + partido.getFechaFormateada();
}

}

