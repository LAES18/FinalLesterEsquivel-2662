import java.util.Scanner;

public class ExamenFinalVarianteC {
    private Scanner scanner;

    public ExamenFinalVarianteC() {
        this.scanner = new Scanner(System.in);
    }

    public int mayorDeTresNumeros() {
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public void concatenarTexto() {
        System.out.print("Ingrese el primer texto: ");
        String texto1 = scanner.next();
        System.out.print("Ingrese el segundo texto: ");
        String texto2 = scanner.next();
        System.out.print("Ingrese el tercer texto: ");
        String texto3 = scanner.next();

        String resultado = texto1 + " " + texto2 + " " + texto3;
        System.out.println("Resultado: " + resultado);
    }

    public void tablaDeMultiplicar() {
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public double operacionMatematica() {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Ingrese el operador (+, -, *, /): ");
        String operador = scanner.next();

        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: no se puede dividir entre cero");
                    return 0;
                }
                break;
            default:
                System.out.println("Error: operador no válido");
                return 0;
        }

        System.out.println("Resultado: " + resultado);
        return resultado;
    }

    public boolean esPrimo() {
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // No se puede llamar a los métodos desde aquí, ya que son instancias de la clase
        // Se debe crear una instancia de la clase y llamar a los métodos desde otra clase main
    }
}