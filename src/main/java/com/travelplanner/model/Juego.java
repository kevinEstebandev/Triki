package com.travelplanner.model;

import java.util.ArrayList;
import java.util.List;

public class Juego {

    public List<Jugador> listJugadores;

    public Juego (){

        listJugadores = new ArrayList<>();
    }


    public List<Jugador> getListJugadores(){
        return listJugadores;
    }

    public void setListJugadores(List<Jugador> listJugadores){
        this.listJugadores = listJugadores;
    }
}
