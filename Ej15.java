public class Ej15 {
    public static void main(String[] args) {
        char clase = 'b';

        System.out.println("Características del auto:");

        switch (clase) {
            case 'a':
                System.out.println(" - Tiene 4 ruedas y un motor.");
                break;
            case 'b':
                System.out.println(" - Tiene 4 ruedas, un motor, cierre centralizado y aire acondicionado.");
                break;
            case 'c':
                System.out.println(" - Tiene 4 ruedas, un motor, cierre centralizado, aire acondicionado y airbag.");
                break;
            default:
                System.out.println(" - Clase de auto no válida.");
                break;
        }
    }
}
