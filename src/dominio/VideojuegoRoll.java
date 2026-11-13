package dominio;

    public class VideojuegoRoll extends Videojuego {

        private int numeroDeMisiones; 

        public VideojuegoRoll(int codigo, String titulo, String plataforma,
                      int puntuacion, int horasJugadas,int numeroDeMisiones) {
                this.titulo = titulo;
                this.plataforma = plataforma;
                this.puntuacion = puntuacion;
                this.horasJugadas = horasJugadas;
              this.numeroDeMisiones = numeroDeMisiones;  
        }

        public int getNumeroDeMisiones() {
            return numeroDeMisiones;
        }

            public String toString() {
            return codigo + " - " + titulo + " - " + plataforma + " - " + horasJugadas + " - " + numeroDeMisiones;

            }
        }

    
