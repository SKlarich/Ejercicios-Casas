import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jugador 1: Elija una opción (0 - Piedra, 1 - Papel, 2 - Tijera):");
        int jugador1 = scanner.nextInt();

        System.out.println("Jugador 2: Elija una opción (0 - Piedra, 1 - Papel, 2 - Tijera):");
        int jugador2 = scanner.nextInt();

        if (jugador1 == 0 && jugador2 == 2) {
            System.out.println("¡Jugador 1 es el ganador!");
        } else if (jugador1 == 1 && jugador2 == 0) {
            System.out.println("¡Jugador 1 es el ganador!");
        } else if (jugador1 == 2 && jugador2 == 1) {
            System.out.println("¡Jugador 1 es el ganador!");
        } else if (jugador1 == 2 && jugador2 == 0) {
            System.out.println("¡Jugador 2 es el ganador!");
        } else if (jugador1 == 0 && jugador2 == 1) {
            System.out.println("¡Jugador 2 es el ganador!");
        } else if (jugador1 == 1 && jugador2 == 2) {
            System.out.println("¡Jugador 2 es el ganador!");
        } else {
            System.out.println("Empate");
        }
    }
}
