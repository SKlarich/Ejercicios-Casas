import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del mes: ");
        String nombreMes = scanner.nextLine();

        int dias = 0;

        if (nombreMes.equalsIgnoreCase("enero") ||
            nombreMes.equalsIgnoreCase("marzo") ||
            nombreMes.equalsIgnoreCase("mayo") ||
            nombreMes.equalsIgnoreCase("julio") ||
            nombreMes.equalsIgnoreCase("agosto") ||
            nombreMes.equalsIgnoreCase("octubre") ||
            nombreMes.equalsIgnoreCase("diciembre")) {
            dias = 31;
        } else if (nombreMes.equalsIgnoreCase("abril") ||
                   nombreMes.equalsIgnoreCase("junio") ||
                   nombreMes.equalsIgnoreCase("septiembre") ||
                   nombreMes.equalsIgnoreCase("noviembre")) {
            dias = 30;
        } else if (nombreMes.equalsIgnoreCase("febrero")) {
            dias = 28;
        }

        System.out.println(nombreMes + " tiene " + dias + " días.");
    }
}
