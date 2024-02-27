package reto6;
import java.util.TimeZone;
import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        mostrarHoraMalasia();
        convertirMoneda();
    }

    public static void mostrarHoraMalasia() {
        // Obtener la zona horaria actual de Malasia
        TimeZone malasiaTimeZone = TimeZone.getTimeZone("Asia/Kuala_Lumpur");

        // Establecer la zona horaria predeterminada para la aplicación
        TimeZone.setDefault(malasiaTimeZone);

        // Imprimir la hora actual en Malasia
        System.out.println("Hora actual en Malasia: " + new java.util.Date());
    }

    public static void convertirMoneda() {
        Scanner scanner = new Scanner(System.in);

        // Tasas de cambio
        double tasaEUR_MYR = 4.75; // Euro a Ringgit de Malasia
        double tasaMYR_EUR = 1 / tasaEUR_MYR; // Ringgit de Malasia a Euro

        // Solicitar al usuario que ingrese la cantidad de euros a convertir
        System.out.print("Ingrese la cantidad de euros que desea cambiar a ringgits de Malasia: ");
        double cantidadEuros = scanner.nextDouble();

        // Realizar el cálculo de euros a ringgits de Malasia
        double resultadoMYR = cantidadEuros * tasaEUR_MYR;

        // Mostrar el resultado
        System.out.println("La cantidad de " + cantidadEuros + " euros equivale a " + resultadoMYR + " ringgits de Malasia (MYR)");

        // Solicitar al usuario que ingrese la cantidad de ringgits de Malasia a convertir
        System.out.print("Ingrese la cantidad de ringgits de Malasia que desea cambiar a euros: ");
        double cantidadMYR = scanner.nextDouble();

        // Realizar el cálculo de ringgits de Malasia a euros
        double resultadoEUR = cantidadMYR * tasaMYR_EUR;

        // Mostrar el resultado
        System.out.println("La cantidad de " + cantidadMYR + " ringgits de Malasia equivale a " + resultadoEUR + " euros (EUR)");

        scanner.close(); // Cerrar el scanner al finalizar
        System.out.println("Fin de programa");
    }
}
