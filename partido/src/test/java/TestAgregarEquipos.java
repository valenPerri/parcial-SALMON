import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import com.partido.parcial.Equipo;
import com.partido.parcial.Torneo;

public class TestAgregarEquipos {

@Test
public void test_crearPartido(){
    Torneo torneo = new Torneo("Libertadores");
    assertTrue(torneo.getName().equals("Libertadores"));
}

@Test
    public void torneo_agregar_equipos_parcial_ejercicio_ejemplo_01(){
        Torneo torneo = new Torneo("Copa Conmebol Libertadores");

        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");

        torneo.agregar(boca);        
        torneo.agregar(palmeiras);


        assertEquals("Boca Juniors", boca.getName());            
        assertEquals("BOC", boca.getAbreviaturaEquipo());        
    
       assertEquals("Palmeiras", palmeiras.getName());  
       assertEquals("PAL", palmeiras.getAbreviaturaEquipo());        
        
        assertEquals(2, torneo.equiposCantidad());
    }






    
}
