package dominio;

    public class VideojuegoEstrategia extends Videojuego {

        private int numeroFacciones; 

        public VideojuegoEstrategia(int codigo, String titulo, String plataforma,
                      int puntuacion, int horasJugadas,int numeroFacciones) {
                this.titulo = titulo;
                this.plataforma = plataforma;
                this.puntuacion = puntuacion;
                this.horasJugadas = horasJugadas;
              this.numeroFacciones = numeroFacciones;  
        }

        public int getNumeroFacciones() {
            return numeroFacciones;
        }

            public String toString() {
            return codigo + " - " + titulo + " - " + plataforma + " - " + horasJugadas + " - " + numeroFacciones;

            }
        }
