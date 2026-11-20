package dominio;


    public class VideojuegoDeportivo extends Videojuego {

        private String deporte ;

        public VideojuegoDeportivo(int codigo, String titulo, String plataforma,
                      int puntuacion, int horasJugadas,String deporte) {
                this.codigo = codigo;
                this.titulo = titulo;
                this.plataforma = plataforma;
                this.puntuacion = puntuacion;
                this.horasJugadas = horasJugadas;
                this.deporte = deporte;  
        }

        public String getDeporte() {
            return deporte;
        }
        public String toString () {
            return codigo + " - " + titulo + " - " + plataforma + " - " + horasJugadas + " - " + deporte;

        }
    }

        
