package edu.pingpong.domain.Estacion;

import edu.pingpong.domain.bicicleta.Movil;

public class Anclaje {
    public boolean ocupado = false;
    Movil bici;
    public Anclaje() {}

    boolean isOcupado(){
        return this.ocupado;
    }

    Movil getBici(){
        return this.bici;
    }

    void anclarBici(Movil bici){
        this.bici = bici;
        this.ocupado = true;
    }
    void liberarBici(){
        this.bici = null;
        this.ocupado = false;
    }
    @Override
    public String toString(){
        return "Ocupado:"+ Boolean.toString(isOcupado());
    }
}
