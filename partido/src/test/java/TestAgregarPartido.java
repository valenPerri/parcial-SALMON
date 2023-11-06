import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.partido.parcial.Equipo;
import com.partido.parcial.Partido;
import com.partido.parcial.Torneo;

public class TestAgregarPartido {
    
@Test
public void torneo_agregar_partidos_parcial_ejercicio_ejemplo_02() {
    
    Torneo torneo = new Torneo("Copa Conmebol Libertadores");

    Equipo boca = new Equipo("Boca Juniors", "BOC");        
    Equipo palmeiras = new Equipo("Palmeiras", "PAL");
    Equipo internacional = new Equipo("Internacional", "INT");        
    Equipo fluminense = new Equipo("Fluminense", "FLU");

    torneo.agregar(boca);        
    torneo.agregar(palmeiras);
    torneo.agregar(internacional);        
    torneo.agregar(fluminense);
        
    Partido partido1Ida = new Partido(internacional, fluminense, "Semifinal Partido Ida INTxFLU");
    Partido partido1Vuelta = new Partido(fluminense, internacional, "Semifinal Partido Vuelta FLUxINT");   

    Partido partido2Ida = new Partido(palmeiras, boca, "Semifinal Partido Ida PALxBOC");
    Partido partido2Vuelta = new Partido(boca, palmeiras, "Semifinal Partido Vuelta BOCxPAL");    

    
    torneo.agregar(partido1Ida);
    torneo.agregar(partido2Vuelta);
    
    torneo.agregar(partido2Ida);
    torneo.agregar(partido2Vuelta);

    
    assertEquals(4, torneo.partidosCantidad());  
    
    assertEquals("Semifinal Partido Ida INTxFLU", partido1Ida.getName());        
    assertEquals("Semifinal Partido Vuelta FLUxINT", partido1Vuelta.getName()); 
    
    assertEquals("Semifinal Partido Ida PALxBOC", partido2Ida.getName());        
    assertEquals("Semifinal Partido Vuelta BOCxPAL", partido2Vuelta.getName());


}


    
}
