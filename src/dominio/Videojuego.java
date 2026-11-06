package dominio;

public class Videojuego {

    private int codigo;
    private String titulo;
    private String plataforma;
    private int puntuacion;
    private int horasJugadas;

    public Videojuego(int codigo, String titulo, String plataforma,
                      int puntuacion, int horasJugadas) {
        this.codigo = codigo;
        setTitulo(titulo);
        setPlataforma(plataforma);
        setPuntuacion(puntuacion);
        setHorasJugadas(horasJugadas);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "El titulo no puede estar vacio."
            );
        }

        this.titulo = titulo.trim();
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        if (puntuacion < 0 || puntuacion > 100) {
            throw new IllegalArgumentException(
                "La puntuacion debe estar entre 0 y 100."
            );
        }

        this.puntuacion = puntuacion;
    }

    public int getHorasJugadas() {
        return horasJugadas;
    }

    public void setHorasJugadas(int horasJugadas) {
        if (horasJugadas < 0) {
            throw new IllegalArgumentException(
                "Las horas jugadas no pueden ser negativas."
            );
        }

        this.horasJugadas = horasJugadas;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo
                + " | Titulo: " + titulo
                + " | Plataforma: " + plataforma
                + " | Puntuacion: " + puntuacion
                + " | Horas jugadas: " + horasJugadas;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }

        if (objeto == null || getClass() != objeto.getClass()) {
            return false;
        }

        Videojuego otro = (Videojuego) objeto;

        return this.codigo == otro.codigo;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(codigo);
    }
}