package com.partido.parcial;

public class Estadio {

    private String nombreEstadio;    
    private String ciudad;
    private String pais;

public Estadio(String nombreEstadio, String ciudad, String pais){ //constructor nombre, ciudad, pais
    this.nombreEstadio=nombreEstadio;
    this.ciudad= ciudad;
    this.pais= pais;
}

@Override
    public String toString() {  //metodo para obtener una representacion en forma de texto de un objeto
        return nombreEstadio + ", " + ciudad + " (" + pais + ")";
    }
//getters

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
