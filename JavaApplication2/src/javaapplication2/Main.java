package javaapplication2;

public class Main {

    public static void main(String[] args) {
        Baraja baraja1 = new Baraja();
        baraja1.crearBaraja();
        System.out.println();
        baraja1.Barajar();
        System.out.println("------------------Siguiente carta------------------");
        baraja1.siguienteCarta();
        System.out.println("------------------Cartas disponibles------------------");
        baraja1.cartasDisponibles();
    }
}
