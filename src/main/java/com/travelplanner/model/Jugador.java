package com.travelplanner.model;

public class Jugador {

    private String nombre;
    private String figura;
    private int turno;

    public Jugador(String nombre, String figura) {

        this.nombre = nombre;
        this.figura = figura;
        this.turno = turno;
    }


    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", figura: " + figura + ", turno: " + turno +"\n";
    }
}
