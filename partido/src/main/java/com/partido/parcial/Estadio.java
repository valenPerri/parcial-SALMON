package com.partido.parcial;

public class Estadio {

    private String nombreEstadio;
    private String ciudad;
    private String pais;

public Estadio(String nombreEstadio, String ciudad, String pais){
    this.nombreEstadio=nombreEstadio;
    this.ciudad= ciudad;
    this.pais= pais;
}

@Override
    public String toString() {
        return nombreEstadio + ", " + ciudad + " (" + pais + ")";
    }

public String getNombreEstadio(){
    return nombreEstadio;
}

public String getCiudad(){
    return ciudad;
}

public String getPais(){
    return pais;
}

    
}
