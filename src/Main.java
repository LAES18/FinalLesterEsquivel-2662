import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExamenFinalVarianteC examen = new ExamenFinalVarianteC();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Mayor de tres números");
            System.out.println("2. Concatenar texto");
            System.out.println("3. Tabla de multiplicar");
            System.out.println("4. Operación matemática");
            System.out.println("5. Es primo");
            System.out.println("6. Salir");

            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();


            switch (opcion) {
                case 1:
                    int mayor = examen.mayorDeTresNumeros();
                    System.out.println("El mayor de los tres números es: " + mayor);
                    break;
                case 2:
                    examen.concatenarTexto();
                    break;
                case 3:
                    examen.tablaDeMultiplicar();
                    break;
                case 4:
                    examen.operacionMatematica();
                    break;
                case 5:
                    examen.esPrimo();
            }
        } while (opcion != 6);

    }
}
