import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TipoNumeros {
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int opcion = 1;
        int numero;

        System.out.println("Sistema que detecta los siguientes tipos de números: ");
        System.out.println("1. Perfecto");
        System.out.println("2. Defectivo");
        System.out.println("3. Abundante");
        System.out.println("Seleccione la opción 1, 2 o 3: ");
        entrada = bufer.readLine();
        opcion = Integer.parseInt(entrada);
        System.out.println("------------------------------------------------------");
        System.out.println("Escriba el número: ");
        entrada = bufer.readLine();
        numero = Integer.parseInt(entrada);

        Numero num = new Numero(numero);

        switch (opcion) {
            case 1:
                if (num.esPerfecto())
                    System.out.println("El número: " + numero + " es perfecto");
                else
                    System.out.println("El número: " + numero + " No es perfecto");
                break;

            case 2:
                if (num.esDefectivo())
                    System.out.println("El número: " + numero + " es defectivo");
                else
                    System.out.println("El número: " + numero + " No es defectivo");
                break;

            case 3:
                if (num.esAbundante())
                    System.out.println("El número: " + numero + " es abundante");
                else
                    System.out.println("El número: " + numero + " No es abundante");
                break;

            default:
                System.out.println("Opción no válida");

        }
    }

    @Override
    public String toString() {
        return "TipoNumeros []";
    }
}
