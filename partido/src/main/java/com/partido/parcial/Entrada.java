package com.partido.parcial;

public class Entrada {
    public Partido partido;
    public String tipo;
    private int valor;


    public Entrada (Partido partido, String tipo, int valor){
        this.partido = partido;
        this.tipo = tipo;
        this.valor = valor;
    }


    @Override
    public String toString() {
        return "[" + "Entrada" + "] Partido " + partido.local.getAbreviaturaEquipo() + " vs. " + partido.visitante.getAbreviaturaEquipo() + " el " + partido.getFechaFormateada();
    }

    
}
