package dominio;

import java.util.ArrayList;

public class Ludoteca {

    private ArrayList<Videojuego> videojuegos;

    public Ludoteca() {
        videojuegos = new ArrayList<>();
    }

    public void agregar(Videojuego videojuego) {
        if (videojuego == null) {
            throw new IllegalArgumentException(
                "El videojuego no puede ser null."
            );
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
        System.out.print(this);
    }
}