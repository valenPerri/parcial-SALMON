package com.partido.parcial;

public class PantallaLed implements IImprimible {

    public String imprimir(IImprimible algoImprimible){
        return algoImprimible.impresion();
      }
  
      @Override
      public String impresion() {
         return null;
      }


    
}
