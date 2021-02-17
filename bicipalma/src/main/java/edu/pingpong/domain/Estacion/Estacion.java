package edu.pingpong.domain.Estacion;

public class Estacion {

    int id = 0;
    String direccion = "";
    int numAnclajes = 0;
    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numAnclajes = numAnclajes;
    }

    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void consultarEstacion(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("id: %d %ndireccion: %s %nanclajes: %s",
                getId(), getDireccion());
    }
}
