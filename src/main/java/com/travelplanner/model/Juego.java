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
    public void jugar (List < Jugador > listJugadores) {
        Jugador jugadorGanador = iniciarRonda(listJugadores);
        String mensaje = generarMensaje(jugadorGanador);
        mostrarMensaje(mensaje);
    }


    public int pedirPosicionCasilla () {
        System.out.print("En que casilla quieres jugar   ");
        int posicion1 = scanner.nextInt();
        return posicion1;
    }

    public Jugador iniciarRonda (List < Jugador > listJugadores) {
        // optiene el primer jugador
        Jugador jugadorMomento = listJugadores.getFirst();

        boolean stop = true;
        while (true) {
            System.out.println("va " + jugadorMomento);
            int posicion = pedirPosicionCasilla();
            boolean stopOcupado = armarTabla(posicion, jugadorMomento);
            stop = pararJuegoSiGana(listJugadores);

            if (!stopOcupado) {
                continue;
            }

            if (!stop) {
                break;
            }

            if (jugadorMomento.getTurno() == 1) {
                jugadorMomento = listJugadores.getLast();

            } else {
                jugadorMomento = listJugadores.getFirst();

            }
        }
        return jugadorMomento;
    }


    public boolean armarTabla(int posicion, Jugador jugadorMomento) {

        Map<Integer, String> casilla = listaCasillas.get(posicion - 1);
        if (casilla.get(posicion) == "_") {
            casilla.replace(posicion, jugadorMomento.getFigura());
            String tabla = ("_" + listaCasillas.getFirst().get(1) + "_|_" + listaCasillas.get(1).get(2) + "_|_" + listaCasillas.get(2).get(3) + "_\n" +
                    "_" + listaCasillas.get(3).get(4) + "_|_" + listaCasillas.get(4).get(5) + "_|_" + listaCasillas.get(5).get(6) + "_\n" +
                    " " + listaCasillas.get(6).get(7) + " | " + listaCasillas.get(7).get(8) + " | " + listaCasillas.getLast().get(9) + "\n");
            mostrarMensaje(tabla);
            return true;
        } else {
            System.out.println("esa casilla ya esta ocupada, sorry");
            return false;
        }
    }


    public boolean pararJuegoSiGana (List < Jugador > listJugadores){
        String c1 = listaCasillas.getFirst().get(1);
        String c2 = listaCasillas.get(1).get(2);
        String c3 = listaCasillas.get(2).get(3);
        String c4 = listaCasillas.get(3).get(4);
        String c5 = listaCasillas.get(4).get(5);
        String c6 = listaCasillas.get(5).get(6);
        String c7 = listaCasillas.get(6).get(7);
        String c8 = listaCasillas.get(7).get(8);
        String c9 = listaCasillas.getLast().get(9);


        if (c1 == c2 && c2 == c3 && c3 == "x" || c1 == c2 && c2 == c3 && c3 == "o"){
            return false;  // si la condicion para ganar se cumple entonces para el juego
        }

        else if (c4 == c5 && c5 == c6 && c6 == "x" || c4 == c5 && c5 == c6 && c6 == "o" ){
            return false;
        }

        else if (c7 == c8 && c8 == c9 && c9 == "x" ||c7 == c8 && c8 == c9 && c9 == "o" ){
            return false;
        }

        else if (c1 == c5 && c5 == c9 && c9 == "x" || c1 == c5 && c5 == c9 && c9 == "o" ){
            return false;
        }

        else if (c3 == c5 && c5 == c7 && c7 == "x" || c3 == c5 && c5 == c7 && c7 == "o" ){
            return false;
        }

        else if (c1 == c4 && c4 == c7 && c7 == "x" || c1 == c4 && c4 == c7 && c7 == "o" ){
            return false;
        }

        else if (c2 == c5 && c5 == c8 && c8 == "x" || c2 == c5 && c5 == c8 && c8 == "o" ){
            return false;
        }

        else if (c3 == c6 && c6 == c9 && c9 == "x" || c3 == c6 && c6 == c9 && c9 ==  "o" ){
            return false;
        }

        else {
            // aca debe estar la logica para que pare y que ninguno haya ganado
            return true;
        }
    }

    public String generarMensaje(Jugador jugador) {
        return "Felicidades " + jugador.toString() + " ha ganado. Besitos";
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
