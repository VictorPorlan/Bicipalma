package edu.pingpong.domain.Estacion;

import edu.pingpong.domain.bicicleta.Bicicleta;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnclajeTest {
    @Test
    public void anclarBiciTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(new Bicicleta(911));
        assertTrue(anclaje.isOcupado());
    }
    @Test
    public void liberarBiciTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(new Bicicleta(911));
        assertTrue(anclaje.isOcupado());

        anclaje.liberarBici();
        assertFalse(anclaje.isOcupado());
    }
}
