import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            try {
                mostrarMenu();
                int opcion = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer de entrada

                switch (opcion) {
                    case 1:
                        metodoBurbuja(sc);
                        break;
                    case 2:
                        verificarPrimo(sc);
                        break;
                    case 3:
                        calcularOperacion(sc);
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                sc.nextLine(); // Limpiar el buffer de entrada
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }

        sc.close();
        System.out.println("¡Hasta luego!");
    }

    // Método para mostrar el menú al usuario
    private static void mostrarMenu() {
        System.out.println("----- MENÚ -----");
        System.out.println("1. Ordenar arreglo");
        System.out.println("2. Verificar si un número es primo");
        System.out.println("3. Calcular operación con números");
        System.out.println("4. Salir");
        System.out.println("Ingrese la opción deseada:");
    }

    // Método para ordenar un arreglo utilizando el método de burbuja
    private static void metodoBurbuja(Scanner sc) {
        int x[] = { 1, 9, 23, 4, 55, 100, 1, 1, 23 };
        System.out.println("Antes del método de la burbuja: " + Arrays.toString(x));
        MetodoBurbuja.burbuja(x);
        System.out.println("Después del método de la burbuja: " + Arrays.toString(x));
    }

    // Método para verificar si un número ingresado por el usuario es primo
    private static void verificarPrimo(Scanner sc) {
        System.out.println("Ingrese un número para verificar si es primo:");
        int numero = sc.nextInt();
        boolean esPrimo = esPrimo(numero);
        System.out.println("El número " + numero + " es primo: " + esPrimo);
    }

    // Método para calcular una operación con números ingresados por el usuario
    private static void calcularOperacion(Scanner sc) {
        System.out.println("Ingrese cuatro números double para calcular el resultado:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double resultado = calcularResultado(a, b, c, d);
        System.out.println("El resultado de la operación es: " + resultado);
    }

    // Método para verificar si un número es primo
    static boolean esPrimo(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para calcular un resultado basado en operaciones con números double
    static double calcularResultado(double a, double b, double c, double d) {
        return ((a + b) * (c - d)) / (a * d);
    }
}
