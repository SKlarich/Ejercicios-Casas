import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el puesto obtenido en el torneo:");
        int puesto = scanner.nextInt();

        switch (puesto) {
            case 1:
                System.out.println("Obtiene la medalla de oro.");
                break;
            case 2:
                System.out.println("Obtiene la medalla de plata.");
                break;
            case 3:
                System.out.println("Obtiene la medalla de bronce.");
                break;
            default:
                System.out.println("Siga participando.");
                break;
        }
    }
}
