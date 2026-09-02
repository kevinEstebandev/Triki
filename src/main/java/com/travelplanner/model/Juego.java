package com.travelplanner.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.Scanner;

public class Juego {


    Scanner scanner = new Scanner(System.in);
    private List<Jugador> listJugadores;
    public List<Map<Integer, String>> listaCasillas = new ArrayList<>();

    public Juego(List < Jugador > jugadores) {
        listJugadores = jugadores;

        // inicializar las casillas
        Map<Integer, String> c1 = new HashMap<>();
        c1.put(1, "_");
        listaCasillas.add(c1);

        Map<Integer, String> c2 = new HashMap<>();
        c2.put(2, "_");
        listaCasillas.add(c2);

        Map<Integer, String> c3 = new HashMap<>();
        c3.put(3, "_");
        listaCasillas.add(c3);

        Map<Integer, String> c4 = new HashMap<>();
        c4.put(4, "_");
        listaCasillas.add(c4);

        Map<Integer, String> c5 = new HashMap<>();
        c5.put(5, "_");
        listaCasillas.add(c5);

        Map<Integer, String> c6 = new HashMap<>();
        c6.put(6, "_");
        listaCasillas.add(c6);

        Map<Integer, String> c7 = new HashMap<>();
        c7.put(7, "_");
        listaCasillas.add(c7);

        Map<Integer, String> c8 = new HashMap<>();
        c8.put(8, "_");
        listaCasillas.add(c8);

        Map<Integer, String> c9 = new HashMap<>();
        c9.put(9, "_");
        listaCasillas.add(c9);
    }


    public List<Jugador> getListJugadores () {
        return listJugadores;
    }

    public void setListJugadores (List < Jugador > listJugadores) {
        this.listJugadores = listJugadores;
    }


    // metodo para jugar
    public String jugar (List < Jugador > listJugadores) {
        boolean stop = true;
        // optiene el primer jugador
        Jugador jugador = listJugadores.getFirst();
        Jugador jugador2 = listJugadores.getLast();

        while (stop) {
                Jugador jugadorMomento = jugador;
                System.out.println("va " + jugadorMomento);
                int posicion1 = pedirPosicionCasilla();

                Map<Integer, String> casilla = listaCasillas.get(posicion1 - 1);
                System.out.println(casilla);
                System.out.println(casilla.get(posicion1));

                if (casilla.get(posicion1) == "_") {
                    casilla.replace(posicion1, jugadorMomento.getFigura());
                    String tabla1 = ("_" + listaCasillas.getFirst().get(1) + "_|_" + listaCasillas.get(1).get(2) + "_|_" + listaCasillas.get(2).get(3) + "_\n" +
                            "_" + listaCasillas.get(3).get(4) + "_|_" + listaCasillas.get(4).get(5) + "_|_" + listaCasillas.get(5).get(6) + "_\n" +
                            " " + listaCasillas.get(6).get(7) + " | " + listaCasillas.get(7).get(8) + " | " + listaCasillas.getLast().get(9) + "\n");
                    System.out.println(tabla1);


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
            return "Hola como estas ";
        }


        public int pedirPosicionCasilla () {
            System.out.print("En que casilla quieres jugar   ");
            int posicion1 = scanner.nextInt();
            return posicion1;
        }
}
