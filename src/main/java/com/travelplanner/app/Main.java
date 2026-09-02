package com.travelplanner.app;

import com.travelplanner.model.Jugador;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Map<Integer, String>> listaCasillas = new ArrayList<>();
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

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


        String tabla = ("_" + c1.get(1) + "_|_" + c2.get(2)+ "_|_" + c3.get(3) + "_\n" +
                "_" + c4.get(4)+ "_|_" + c5.get(5) + "_|_"+ c6.get(6) + "_\n" +
                " " + c7.get(7)+ " | " + c8.get(8) + " | "+ c9.get(9) + "\n");

        System.out.println(tabla);


        // borrador de logica




    }
}