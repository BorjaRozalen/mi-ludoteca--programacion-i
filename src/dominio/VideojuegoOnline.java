package dominio;

    public class VideojuegoOnline extends Videojuego {

        private int numeroJugadoresOnline; 

        public VideojuegoOnline(int codigo, String titulo, String plataforma,
                      int puntuacion, int horasJugadas,int numeroJugadoresOnline) {
                this.titulo = titulo;
                this.plataforma = plataforma;
                this.puntuacion = puntuacion;
                this.horasJugadas = horasJugadas;
              this.numeroJugadoresOnline = numeroJugadoresOnline;  
        }

        public int getNumeroDeJugadoresOnline() {
            return numeroJugadoresOnline;
        }

            public String toString() {
            return codigo + " - " + titulo + " - " + plataforma + " - " + horasJugadas + " - " + numeroJugadoresOnline;

            }
        }
