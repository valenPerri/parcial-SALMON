import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.partido.parcial.Entrada;
import com.partido.parcial.EntradaVip;
import com.partido.parcial.Equipo;
import com.partido.parcial.Estadio;
import com.partido.parcial.Partido;

public class TestParcial {
   @Test
    public void partido_con_fecha_ejercicio_ejemplo_11()
    {              
        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo sanLorenzo = new Equipo("San Lorenzo", "SAL");        
       
        Estadio estadioBombonera = new Estadio("Estadio Pedro Bidegain (El Nuevo Gasometro)", "Buenos Aires", "Argentina");
       
        Partido partido = new Partido(estadioBombonera, sanLorenzo, boca, "Primera Division 2023 | Fecha 12");  


        Calendar calendar = Calendar.getInstance();


        calendar.set(2023, 10, 8); //Mes 10 = Noviembre (comienza en 0)
        Date fecha = calendar.getTime();      
        partido.setFecha(fecha);  
       
        assertEquals(fecha, partido.getFecha());        
        assertEquals("08/11/2023", partido.getFechaFormateada());


        calendar.set(2023, 11, 13); //Mes 11 = Diciembre (comienza en 0)
        Date fecha2 = calendar.getTime();      
        partido.setFecha(fecha2);        
       
        assertEquals(fecha2, partido.getFecha());        
        assertEquals("13/12/2023", partido.getFechaFormateada());
    }


    @Test
    public void entradas_para_partido_ejercicio_ejemplo_12()
    {              
        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo sanLorenzo = new Equipo("San Lorenzo", "SAL");        
       
        Estadio estadioBombonera = new Estadio("Estadio Pedro Bidegain (El Nuevo Gasometro)", "Buenos Aires", "Argentina");
       
        Partido partido = new Partido(estadioBombonera, sanLorenzo, boca, "Primera Division 2023 | Fecha 12");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, 10, 8); //Mes 10 = Noviembre (comienza en 0)
        Date fecha = calendar.getTime();
       
        partido.setFecha(fecha);          
       
        Entrada entradaNormal = new Entrada(partido, "Mi Entrada", 4500);        
        EntradaVip entradaVip = new EntradaVip(partido, 25000);
       
        assertEquals("[Entrada] Partido SAL vs. BOC el 08/11/2023", entradaNormal.toString());        
        assertEquals("[Entrada VIP] Partido SAL vs. BOC el 08/11/2023", entradaVip.toString());
        assertEquals(true, entradaVip.esVip());
    }
}