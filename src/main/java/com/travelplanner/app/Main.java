package com.travelplanner.app;

import com.travelplanner.model.Jugador;
import com.travelplanner.model.Juego;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Map<Integer, String>> listaCasillas = new ArrayList<>();

        listaCasillas = [{}];
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

        System.out.print("Ingresa tu nombre");
        String nombre1 = scanner.nextLine();
        System.out.print("Bienvenido " + nombre1 + "!!!");
        String figura1 = "x";

        System.out.print("Ingresa tu nombre");
        String nombre2 = scanner.nextLine();
        System.out.print("Bienvenido " + nombre2 + "!!!");
        String figura2 = "x";

        Jugador jugador1 = new Jugador(nombre1, figura1);
        Jugador jugador2 = new Jugador(nombre2, figura2);

        jugadores.add(jugador1);
        jugadores.add(jugador2);

        Juego juego = new Juego();
        juego.setJugadores



    }
}