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
        String jugadorGanador = iniciarRonda(listJugadores);
        String mensaje = generarMensaje(jugadorGanador);
        mostrarMensaje(mensaje);
    }


    public int pedirPosicionCasilla () {
        System.out.print("En que casilla quieres jugar   ");
        int posicion1 = scanner.nextInt();
        return posicion1;
    }

    public String iniciarRonda (List < Jugador > listJugadores) {
        // optiene el primer jugador
        Jugador jugadorMomento = listJugadores.getFirst();

        while (true) {
            System.out.println("va " + jugadorMomento);
            int posicion = pedirPosicionCasilla();
            boolean stopOcupado = armarTabla(posicion, jugadorMomento);
            boolean stopGanador = pararJuegoSiGana();
            boolean stopEmpate = pararJuegoSiEmpate();

            if (!stopOcupado) {
                continue;
            }

            if (!stopGanador) {
                return jugadorMomento.getNombre();
            }

            if (stopEmpate) {
                return "NADIE";
            }

            if (jugadorMomento.getTurno() == 1) {
                jugadorMomento = listJugadores.getLast();

            } else {
                jugadorMomento = listJugadores.getFirst();

            }
        }
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


    public boolean pararJuegoSiGana (){
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
            return true;
        }
    }

    public boolean pararJuegoSiEmpate (){
        String c1 = listaCasillas.getFirst().get(1);
        String c2 = listaCasillas.get(1).get(2);
        String c3 = listaCasillas.get(2).get(3);
        String c4 = listaCasillas.get(3).get(4);
        String c5 = listaCasillas.get(4).get(5);
        String c6 = listaCasillas.get(5).get(6);
        String c7 = listaCasillas.get(6).get(7);
        String c8 = listaCasillas.get(7).get(8);
        String c9 = listaCasillas.getLast().get(9);
        
        boolean booleano = false;
        
        if (c1 != "_" && c2 != "_" && c3 != "_" && c4 != "_" && c5 != "_" && c6 != "_" && c7 != "_" && c8 != "_" && c9 != "_") {
            if (!(c1 == "x" && c2 == "x" && c3 == "x") && !(c1 == "o" && c2 == "o" && c3 == "o")){
                booleano = true;
            }

            else if (!(c4 == "x" && c5 == "x" && c6 == "x") && !(c4 == "o" && c5 == "o" && c6 == "o")){
                booleano =  true;
            }

            else if (!(c7 == "x" && c8 == "x" && c9 == "x") && !(c7 == "o" && c8 == "o" && c9 == "o")){
                booleano =  true;
            }

            else if (!(c1 == "x" && c5 == "x" && c9 == "x") && !(c1 == "o" && c5 == "o" && c9 == "o")){
                booleano =  true;
            }

            else if (!(c3 == "x" && c5 == "x" && c7 == "x") && !(c3 == "o" && c5 == "o" && c7 == "o")){
                booleano =  true;
            }

            else if (!(c1 == "x" && c4 == "x" && c7 == "x") && !(c1 == "o" && c4 == "o" && c7 == "o")){
                booleano =  true;
            }

            else if (!(c2 == "x" && c5 == "x" && c8 == "x") && !(c2 == "o" && c5 == "o" && c8 == "o")){
                booleano =  true;
            }

            else if (!(c3 == "x" && c6 == "x" && c9 == "x") && !(c3 == "o" && c6 == "o" && c9 == "o")){
                booleano =  true;
            }

            else {
                booleano =  false;
            }
        }
        return booleano;
    }

    public String generarMensaje(String mensaje) {
        return mensaje + " ha ganado. Besitos";
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
