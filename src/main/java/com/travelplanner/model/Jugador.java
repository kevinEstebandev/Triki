package com.travelplanner.model;

public class Jugador {

    private String nombre;
    private String figura;

    public Jugador(String nombre,String figura){

        this.nombre = nombre;
        this.figura = figura;
    }



    public String getFigura(){
        return figura;
    }

    public void setFigura(String figura){
        this.figura = figura;
    }


    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
