package edu.pingpong.domain.Estacion;

import edu.pingpong.domain.bicicleta.Bicicleta;
import edu.pingpong.domain.bicicleta.Movil;

import java.util.concurrent.ThreadLocalRandom;

class Anclajes {

    private final Anclaje[] anclajes;

    Anclajes(int numAnclajes) {
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes() {
        for (int i = 0; i < anclajes.length; i++) {
            this.anclajes[i] = new Anclaje();
        }
    }

    Anclaje[] anclajes() {
        return this.anclajes;
    }

    int numAnclajes() {
        return this.anclajes.length;
    }

    @Override
    public String toString() {
        return "Numero de anclajes: " + Integer.toString(numAnclajes());
    }

    void ocuparAnclaje(int posicion, Movil bici) {
        this.anclajes[posicion].anclarBici(bici);
    }

    boolean isAnclajeOcupado(int posicion) {
        return this.anclajes[posicion].isOcupado();
    }

    void liberarAnclaje(int posicion) {
        this.anclajes[posicion].liberarBici();
    }

    Movil getBiciAt(int posicion) {
        return this.anclajes[posicion].getBici();
    }

    /**
     * Substituido por Arrays.stream().findAny()
     */
    int seleccionarAnclaje() {
        Integer idAnclaje = ThreadLocalRandom.current().nextInt(0, numAnclajes());
        return idAnclaje;
    }
}

