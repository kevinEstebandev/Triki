package com.travelplanner.app;

import com.travelplanner.model.Juego;
import com.travelplanner.model.Jugador;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Map<Integer, String>> listaCasillas = new ArrayList<>();
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();


        // crear jugadores
        System.out.print("Ingresa tu nombre   ");
        String nombre1 = scanner.nextLine();
        System.out.print("Bienvenido " + nombre1 + "!!!\n");
        String figura1 = "x";

        System.out.print("Ingresa tu nombre   ");
        String nombre2 = scanner.nextLine();
        System.out.print("Bienvenido " + nombre2 + "!!!\n");
        String figura2 = "o";

        Jugador jugador1 = new Jugador(nombre1, figura1);
        Jugador jugador2 = new Jugador(nombre2, figura2);

        jugadores.add(jugador1);
        jugadores.add(jugador2);

        System.out.println("JUGADORES: \n" + jugadores);
        System.out.println(listaCasillas);


        Juego juego1 = new Juego(jugadores);
        juego1.jugar(jugadores);
        // borrador de logica




    }
}