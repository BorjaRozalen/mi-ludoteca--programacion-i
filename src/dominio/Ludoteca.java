package dominio;

import java.util.ArrayList;

public class Ludoteca {

    private ArrayList<Videojuego> videojuegos;

    public Ludoteca() {
        videojuegos = new ArrayList<>();
    }

    public void agregar(Videojuego videojuego) {
        if (videojuego == null) {
              System.out.println("El videojuego no puede ser null.");
        }

        videojuegos.add(videojuego);
    }

    public Videojuego buscarPorTitulo(String titulo) {
        for (Videojuego juego : videojuegos) {
            if (juego.getTitulo().equals(titulo)) {
                return juego;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        String listado = "";

        for (Videojuego juego : videojuegos) {
            listado += juego + "\n";
        }

        return listado;
    }

    public void listar() {
        for(Videojuego videojuego : videojuegos){
             System.out.println(videojuego.mostrarFicha());
        }
    }

    public double calcularPuntuacionMedia() {
    if (!videojuegos.isEmpty()) {
        double suma = 0;
        for (Videojuego videojuego : videojuegos) {
            suma += videojuego.getPuntuacion();
        }
        return suma / videojuegos.size();
    }
    return 0;
}

public Videojuego obtenerMejorValorado() {
    if (!videojuegos.isEmpty()) {
        Videojuego mejor = videojuegos.get(0);

        for (Videojuego videojuego : videojuegos) {
            if (mejor.getPuntuacion() < videojuego.getPuntuacion()) {
                mejor = videojuego;
            }
        }
        return mejor;
    }
    return null;
}

    }
