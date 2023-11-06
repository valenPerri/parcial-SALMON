package com.partido.parcial;

public class Estadio implements IImprimible {

    private String name;    
    private String ciudad;
    private String pais;

public Estadio(String name, String ciudad, String pais){ //constructor nombre, ciudad, pais
    this.name=name;
    this.ciudad= ciudad;
    this.pais= pais;
}

//getters

public String getName(){
    return name;
}

public String getCiudad(){
    return ciudad;
}

public String getPais(){
    return pais;
}


@Override
    public String toString() {  //metodo para obtener una representacion en forma de texto de un objeto
        return name + ", " + ciudad + " (" + pais + ")";
    }

@Override
    public String impresion() { //implementamos 
        return "[Estadio] " + getName() + " (" + getCiudad() + " - " + getPais() + ")";
    }

    
}
