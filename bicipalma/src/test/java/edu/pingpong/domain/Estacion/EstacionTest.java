package edu.pingpong.domain.Estacion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EstacionTest {
    Estacion estacion;

    @Before
    public void setUpEstacion(){
        this.estacion = new Estacion(13232323, "caracas", 6);
    }
    @Test
    public void constructorTest(){
        assertNotNull(this.estacion);
    }
    @Test
    public void getDireccionTest(){
        assertEquals("caracas", this.estacion.getDireccion());
    }
    @Test
    public void getIdTest(){
        assertEquals(13232323, this.estacion.getId());
    }
}
