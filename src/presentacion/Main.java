package presentacion;

import dominio.Ludoteca;
import dominio.Videojuego;

public class Main {

    public static void main(String[] args) {

        Ludoteca ludoteca = new Ludoteca();

        Videojuego juego1 = new Videojuego(
            1, "Minecraft", "PC", 90, 120
        );

        Videojuego juego2 = new Videojuego(
            2, "Mario Kart 8 Deluxe", "Nintendo Switch", 95, 60
        );

        Videojuego juego3 = new Videojuego(
            3, "God of War", "PS4", 94, 35
        );

        Videojuego juego4 = new Videojuego(
            4, "Halo Infinite", "Xbox Series X", 85, 40
        );

        Videojuego juego5 = new Videojuego(
            5, "Stardew Valley", "PC", 92, 80
        );

        ludoteca.agregar(juego1);
        ludoteca.agregar(juego2);
        ludoteca.agregar(juego3);
        ludoteca.agregar(juego4);
        ludoteca.agregar(juego5);

        System.out.println("MI LUDOTECA v2.3");
        System.out.print(ludoteca);

        System.out.println("\nBusqueda de Minecraft:");

        Videojuego encontrado = ludoteca.buscarPorTitulo("Minecraft");

        if (encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("Videojuego no encontrado.");
        }

        System.out.println("\nBusqueda de Terraria:");

        encontrado = ludoteca.buscarPorTitulo("Terraria");

        if (encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("Videojuego no encontrado.");
        }

        // Este objeto representa el mismo videojuego que juego1.
        // Tiene el mismo codigo, aunque cambien puntuacion y horas.
        Videojuego mismoJuego = new Videojuego(
            1, "Minecraft", "PC", 95, 150
        );

        System.out.println("\nComprobacion de igualdad por codigo:");

        System.out.println(
            "Mismo codigo: " + juego1.equals(mismoJuego)
        );

        System.out.println(
            "Codigos diferentes: " + juego1.equals(juego2)
        );

        System.out.println(
            "Mismo hashCode para juegos iguales: "
            + (juego1.hashCode() == mismoJuego.hashCode())
        );
    }
}