package com.travelplanner.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Juego {

    private List<Jugador> listJugadores;
    private List<Map<Integer, String>> listaCasillas;

    public Juego (List<Jugador> jugadores, List<Map<Integer, String>> casillas){

        listJugadores = jugadores;
        listaCasillas = casillas;
    }


    public List<Jugador> getListJugadores(){
        return listJugadores;
    }

    public void setListJugadores(List<Jugador> listJugadores){
        this.listJugadores = listJugadores;
    }


    // metodo para jugar
    public String jugar(List<Jugador> listJugadores, int posicion1) {
        boolean stop = true;
        // optiene el primer jugador
        Jugador jugador = listJugadores.getFirst();
        Jugador jugador2 = listJugadores.getLast();

        while (stop) {
            Jugador jugadorMomento = jugador;
            System.out.println("va " + jugadorMomento);




            Map<Integer, String> casilla = listaCasillas.get(posicion1 - 1);
            System.out.println(casilla);
            System.out.println(casilla.get(posicion1));

            if (casilla.get(posicion1) == "_") {
                casilla.replace(posicion1, jugadorMomento.getFigura());
                String tabla1 = ("_" + c1.get(1) + "_|_" + c2.get(2)+ "_|_" + c3.get(3) + "_\n" +
                        "_" + c4.get(4)+ "_|_" + c5.get(5) + "_|_"+ c6.get(6) + "_\n" +
                        " " + c7.get(7)+ " | " + c8.get(8) + " | "+ c9.get(9) + "\n");



                if (jugadorMomento == jugador) {
                    jugadorMomento = jugador2;
                } else {
                    jugadorMomento = jugador;
                }
                System.out.println(tabla1);
            } else {
                System.out.println("esa casilla ya esta ocupada, sorry");
                stop = false;
            }
        }
    }

    public int pedirPosicionCasilla(){
        System.out.print("En que casilla quieres jugar   ");
        
    }
}
