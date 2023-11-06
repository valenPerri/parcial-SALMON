import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.partido.parcial.Equipo;
import com.partido.parcial.Estadio;
import com.partido.parcial.IImprimible;
import com.partido.parcial.IJugador;
import com.partido.parcial.Jugador;
import com.partido.parcial.PantallaLed;

public class TestPantallasLed {
    
    @Test
    public void pantallas_estadio_parcial_ejercicio_ejemplo_10()
    {        
        IJugador jugadorBoca6 = new Jugador("Marcos Rojo", 6);
        jugadorBoca6.setPosicion("Defensor");


        Equipo boca = new Equipo("Boca Juniors", "BOC");          
     
        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");
       


        PantallaLed pantallaLed = new PantallaLed();
       
        assertEquals("[Jugador 6] Marcos Rojo > Defensor", pantallaLed.imprimir((IImprimible)jugadorBoca6));        
        assertEquals("[Equipo] Boca Juniors > BOC", pantallaLed.imprimir((IImprimible)boca));
        assertEquals("[Estadio] La Bombonera (Buenos Aires - Argentina)", pantallaLed.imprimir((IImprimible)estadioBombonera));
    }

    
}
