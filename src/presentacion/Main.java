package presentacion;
import dominio.*;
import java.util.Scanner;


public class Main {

    public void main(String[] args) {

        Ludoteca ludoteca = new Ludoteca();
        Scanner teclado = new Scanner(System.in);
        System.out.println("-----------\n"+
            "1. agregar Videojuego\n"+
            "2. buscar Videojuego\n"+
            "3. mostrar lista\n"+
            "4. calcular media\n"+
            "5. obtener mejor");

        System.out.println("Introduce lo que necesitas");
        String respuesta = teclado.nextLine();
        if(respuesta== "1"){
            
        }
    }

}