import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la categoría (a, b o c): ");
        String categoria = scanner.nextLine();

        if (categoria.equalsIgnoreCase("a")) {
            System.out.println("Hijo");
        } else if (categoria.equalsIgnoreCase("b")) {
            System.out.println("Padres");
        } else if (categoria.equalsIgnoreCase("c")) {
            System.out.println("Abuelos");
        } else {
            System.out.println("Categoría inválida");
        }
    }
}
